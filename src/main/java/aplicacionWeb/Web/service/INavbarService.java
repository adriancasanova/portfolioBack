package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Navbar;
import java.util.List;

public interface INavbarService {
     public List <Navbar> verNavbar();
    public void agregarNavbar (Navbar navb);
    public void borrarNavbar (Long id);
    public Navbar buscarNavbar (Long id); 
}

