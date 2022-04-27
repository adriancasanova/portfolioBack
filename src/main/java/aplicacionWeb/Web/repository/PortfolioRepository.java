
package aplicacionWeb.Web.repository;

import aplicacionWeb.Web.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository <Portfolio, Long>{
    
    
}
