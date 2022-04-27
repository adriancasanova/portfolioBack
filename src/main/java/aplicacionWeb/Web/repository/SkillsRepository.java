package aplicacionWeb.Web.repository;
import aplicacionWeb.Web.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface SkillsRepository extends JpaRepository <Skills, Long>{
    
}
