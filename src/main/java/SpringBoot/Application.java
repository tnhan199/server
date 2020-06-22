package SpringBoot;

import SpringBoot.reponsitory.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ntt
 */
@SpringBootApplication
public class Application {
    @Autowired
    public static EmployeeReponsitory employeeReponsitory;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
