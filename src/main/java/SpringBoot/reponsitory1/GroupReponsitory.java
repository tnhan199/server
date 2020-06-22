package SpringBoot.reponsitory1;

import org.springframework.data.repository.CrudRepository;

import SpringBoot.entity.Group;


/**
 *
 * @author ntt
 */
public interface GroupReponsitory extends CrudRepository<Group, Integer> {

}
