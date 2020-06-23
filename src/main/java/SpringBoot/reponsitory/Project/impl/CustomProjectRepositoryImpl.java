package SpringBoot.reponsitory.Project.impl;

import java.util.List;

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

        TypedQuery<Project> query;
        if (project.getProjectNumber() != 0) {
            query = entityManager.createQuery("select u from Project u left join fetch u.employees where u.projectNumber=?1", Project.class);
            query.setParameter(1, project.getProjectNumber());
        } else {
            if (!project.getCustomer().equals("")) {
                query = entityManager.createQuery("select u from Project u left join fetch u.employees where u.projectName like ?1 or u.customer like ?2", Project.class);
                query.setParameter(1, "%" + project.getProjectName() + "%");
                query.setParameter(2, "%" + project.getCustomer() + "%");
            } else {
                query = entityManager.createQuery("select u from Project u left join fetch u.employees", Project.class);
            }
        }
        if (page != 0) {
            query.setFirstResult((page - 1) * maxItemsInPage);
            query.setMaxResults(maxItemsInPage);
        }
        return query.getResultList();
    }
}
