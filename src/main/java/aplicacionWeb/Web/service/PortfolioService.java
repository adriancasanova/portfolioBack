
package aplicacionWeb.Web.service;

import aplicacionWeb.Web.model.Portfolio;
import aplicacionWeb.Web.repository.PortfolioRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PortfolioService implements IPortfolioService{
    
    @Autowired
    public PortfolioRepository portfolioRepo; 
    
    @Override
    public List<Portfolio> verPortfolio() {
       return portfolioRepo.findAll();
    }

    @Override
    public void agregarPortfolio(Portfolio port) {
    portfolioRepo.save(port);
    }

    @Override
    public void borrarPortfolio(Long id) {
     portfolioRepo.deleteById(id);
    }

    @Override
    public Portfolio buscarPorfolio(Long id) {
         return portfolioRepo.findById(id).orElse(null);
    }
    
     @Override
    public void editarPortfolio(Portfolio port) {
    portfolioRepo.save(port);
    }
    
}
