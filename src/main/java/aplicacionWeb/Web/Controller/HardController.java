package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.model.Hard;
import aplicacionWeb.Web.service.IHardService;
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
 //@CrossOrigin (origins = "http://localhost:4200")
   @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app")
public class HardController {      
 @Autowired
private IHardService hardServ;  
  @PostMapping ("/new/hards")
  public void agregarHard (@RequestBody Hard har) {
  hardServ.agregarHard(har);
  } 
  @GetMapping ("/portfolio/hards") 
  @ResponseBody
  public List<Hard> verHard() {
 return hardServ.verHard();
  }
  @DeleteMapping ("/delete/hards/{id}")
  public void borrarHard (@PathVariable Long id){
  hardServ.borrarHard(id);
  }  
  }

