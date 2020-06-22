package SpringBoot.Converter;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import SpringBoot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import SpringBoot.entity.Project;
import SpringBoot.reponsitory.EmployeeReponsitory;
import SpringBoot.reponsitory.GroupReponsitory;

@Component
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
           Employee tmp=employeeReponsitory.getByVisa(i);
           if(tmp!=null)
               entity.addEmployee(tmp);
        }
        groupReponsitory.findById(dto.getGroupId()).ifPresent(group -> {
            entity.setGroup(group);
        });
        entity.setProjectName(dto.getProjectName());
        entity.setProjectNumber(dto.getProjectNumber());
        entity.setStatus(dto.getStatus());
        return entity;

    }
    public SpringBoot.dto.Project toDTO(Project project){
        return SpringBoot.dto.Project.newBuilder().setGroupId(project.getGroup().getId()).setId(project.getId()).setProjectNumber(project.getProjectNumber()).setProjectName(project.getProjectName()).setStatus(project.getStatus()).setStartDate( new SimpleDateFormat("yyyy-MM-dd").format(project.getStartDate())).setEndDate(new SimpleDateFormat("yyyy-MM-dd").format(project.getEndDate())).build();
    }
}
