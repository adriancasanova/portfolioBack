package aplicacionWeb.Web.service;


import aplicacionWeb.Web.model.Navbar;
import aplicacionWeb.Web.repository.NavbarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NavbarService implements INavbarService{    
    
    @Autowired
    public NavbarRepository navbarRepo; 
    
    @Override
    public List<Navbar> verNavbar() {
       return navbarRepo.findAll();
    }

    @Override
    public void agregarNavbar(Navbar navb) {
    navbarRepo.save(navb);
    }

    @Override
    public void borrarNavbar(Long id) {
     navbarRepo.deleteById(id);
    }

    @Override
    public Navbar buscarNavbar(Long id) {
         return navbarRepo.findById(id).orElse(null);
    }
   
}
