package SpringBoot.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "project_employee", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private Set<Employee> employees;
    @Column(name = "projectNumber", nullable = false, unique = true)
    private Integer projectNumber;
    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;
    private String customer;

    public Project() {
        employees = new HashSet<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        e.getProjects().add(this);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Integer projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "projectName", nullable = false)
    private String projectName;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "startDate", nullable = false)
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
