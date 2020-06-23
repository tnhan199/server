package SpringBoot.reponsitory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import SpringBoot.entity.Employee;


/**
 *
 * @author ntt
 */
public interface EmployeeReponsitory extends CrudRepository<Employee, Integer> {
    public Integer countByVisa(String visa);

    @Query("select u from Employee u  left join fetch u.projects where u.visa=?1 ")
    public Employee getByVisa(String visa);
}
