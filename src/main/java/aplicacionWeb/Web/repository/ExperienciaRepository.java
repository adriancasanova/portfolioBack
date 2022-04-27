package aplicacionWeb.Web.repository;
import aplicacionWeb.Web.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
