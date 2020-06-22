package SpringBoot.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Groupt")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer version;
    private String name;
    @OneToOne
    @JoinColumn(name = "group_leader_id")
    private Employee leader;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @OneToMany(mappedBy = "group")
    private List<Project> projects;

    public void setId(Integer id) {
        this.id = id;
    }

//    public Employee getLeader() {
//        return leader;
//    }
//
//    public void setLeader(Employee leader) {
//        this.leader = leader;
//    }

    public int getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
//    public void addProject(Project project){
//        this.projectList.add(project);
//        project.setGroup(this);
//    }
}
