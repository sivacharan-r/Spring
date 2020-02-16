package code.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import code.model.Alert;


public interface AlertRepository extends JpaRepository<Alert,Integer> {

}
