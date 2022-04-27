
package aplicacionWeb.Web.repository;
import aplicacionWeb.Web.model.Navbar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavbarRepository extends JpaRepository <Navbar, Long>{    
}
