package SpringBoot.reponsitory1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import SpringBoot.entity.Project;

/**
 *
 * @author ntt
 */
public interface ProjectRepository extends CrudRepository<Project, Integer> {
    @Query(value = "select count(u.id) from Project u where u.projectNumber= ?1", nativeQuery = true)
    public Integer countByProjectNumber(Integer projectNumber);

}

