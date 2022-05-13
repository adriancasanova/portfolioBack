
package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.model.Portfolio;
import aplicacionWeb.Web.service.IPortfolioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
  @RestController  
 @CrossOrigin (origins = "http://localhost:4200")
 //  @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app")
public class Controller {
      
 @Autowired
private IPortfolioService portServ;  

  @PostMapping ("/new/abouts")
  public void agregarPortfolio (@RequestBody Portfolio port) { 
  portServ.agregarPortfolio(port);
  } 
  @GetMapping ("/portfolio/abouts")  
  @ResponseBody
  public List<Portfolio> verPortfolio() {
 return portServ.verPortfolio();
  }
  @DeleteMapping ("/delete/abouts/{id}")
  public void borrarPortfolio (@PathVariable Long id){
  portServ.borrarPortfolio(id);
  }  
  
   @PutMapping ("/portfolio/abouts/{id}")
  public void editarPortfolio (@RequestBody Portfolio port) { 
  portServ.editarPortfolio(port);
  } 
  
  }