package SpringBoot.Converter;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import SpringBoot.entity.Project;
import SpringBoot.reponsitory1.EmployeeReponsitory;
import SpringBoot.reponsitory1.GroupReponsitory;

@Component
@Transactional
public class ProjectConverter extends Converter {
    @Autowired
    private EmployeeReponsitory employeeReponsitory;
    @Autowired
    private GroupReponsitory groupReponsitory;
    @PersistenceContext
    private EntityManager entityManager;

    public Project toEntity(SpringBoot.dto.Project dto) {
        Project entity = new Project();
        entity.setCustomer(dto.getCustomer());
        try {
            entity.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getStartDate()));
            entity.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getEndDate()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (String i : dto.getMember().split(",")) {
//            TypedQuery<Employee> query = entityManager.createQuery("select u from Employee u join fetch u.projects where u.visa=?1", Employee.class);
//            query.setParameter(1, i);
//            Employee tmp = query.getSingleResult();
//            entity.addEmployee(tmp);
            TypedQuery<Project> query = entityManager.createQuery("select u from Project u where u.projectNumber=2", Project.class);
            List<Project> projects = query.getResultList();
        }
        groupReponsitory.findById(dto.getId()).ifPresent(group -> {
            entity.setGroup(group);
        });
        entity.setProjectName(dto.getProjectName());
        entity.setStatus(dto.getStatus());
        return entity;

    }
}
