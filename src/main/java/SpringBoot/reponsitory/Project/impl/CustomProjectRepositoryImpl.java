package SpringBoot.reponsitory.Project.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import SpringBoot.entity.Project;
import SpringBoot.reponsitory.Project.CustomProjectRepository;

public class CustomProjectRepositoryImpl implements CustomProjectRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Project> searchBy(Project project, int page, int maxItemsInPage) {
        StringBuilder rawQuery = new StringBuilder("select u from Project u left join fetch u.employees where 1=1 ");
        Map<String, Object> parameters = new HashMap<>();
        if (project.getProjectNumber() != 0)
            parameters.put("projectNumber", project.getProjectNumber());
        if (!project.getProjectName().equals("")) {
            rawQuery.append("and (u.projectName like '%" + project.getProjectName() + "%' or u.customer like '%" + project.getCustomer() + "%')");
        }
        if (!project.getStatus().equals(""))
            parameters.put("status", "%" + project.getStatus() + "%");


        int count = 0;
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            count++;
            rawQuery.append(" and u." + entry.getKey());
            if (entry.getValue() instanceof String) {
                rawQuery.append(" like ");

            }
            if (entry.getValue() instanceof Integer) {
                rawQuery.append(" = ");
            }
            rawQuery.append("?" + count);
        }
        count = 0;
        TypedQuery<Project> query = entityManager.createQuery(rawQuery.toString(), Project.class);
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            count++;
            query.setParameter(count, entry.getValue());
        }
        if (page != 0) {
            query.setFirstResult((page - 1) * maxItemsInPage);
            query.setMaxResults(maxItemsInPage);
        }
        return query.getResultList();
    }
}
