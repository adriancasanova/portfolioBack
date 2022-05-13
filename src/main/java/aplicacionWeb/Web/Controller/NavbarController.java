package aplicacionWeb.Web.Controller;

import aplicacionWeb.Web.model.Navbar;
import aplicacionWeb.Web.service.INavbarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController  
// @CrossOrigin (origins = "http://localhost:4200")
  @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app")
public class NavbarController {      
 @Autowired
private INavbarService navbarServ;  
  @PostMapping ("/new/navbars")
  public void agregarNavbar (@RequestBody Navbar navb) {
  navbarServ.agregarNavbar (navb);
  } 
  
  @GetMapping ("/portfolio/navbars") 
  @ResponseBody
  public List<Navbar> verNavbar() {
 return navbarServ.verNavbar();
  }
  @DeleteMapping ("/delete/navbars/{id}")
  public void borrarNavbar (@PathVariable Long id){
  navbarServ.borrarNavbar(id);
  }  
  }