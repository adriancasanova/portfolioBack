
package aplicacionWeb.Web.service;

import aplicacionWeb.Web.model.Portfolio;
import java.util.List;

public interface IPortfolioService {
    
    public List <Portfolio> verPortfolio();
    public void agregarPortfolio (Portfolio port);
    public void borrarPortfolio (Long id);
    public Portfolio buscarPorfolio (Long id); 
    public void editarPortfolio (Portfolio port);
}
