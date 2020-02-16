package code.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import code.model.Flight;


public interface FlightRepository extends JpaRepository<Flight,String> {

}
