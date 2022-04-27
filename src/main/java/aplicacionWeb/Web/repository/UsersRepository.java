package aplicacionWeb.Web.repository;
import aplicacionWeb.Web.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface UsersRepository extends JpaRepository <Users, Long>{
    
}
