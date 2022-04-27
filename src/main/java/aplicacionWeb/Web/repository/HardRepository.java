package aplicacionWeb.Web.repository;
import aplicacionWeb.Web.model.Hard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface HardRepository extends JpaRepository <Hard, Long>{
    
}
