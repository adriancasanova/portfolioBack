package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.model.Experiencia;
import aplicacionWeb.Web.service.IExperienciaService;
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
 //@CrossOrigin (origins = "http://localhost:4200")
   @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app")
public class ExperienciaController {      
 @Autowired
private IExperienciaService experienciaServ;  
  @PostMapping ("/portfolio/experiencias")
  public void agregarExperiencia (@RequestBody Experiencia exp) {
  experienciaServ.agregarExperiencia(exp);
  } 
  @GetMapping ("/portfolio/experiencias") 
  @ResponseBody
  public List<Experiencia> verExperiencia() {
 return experienciaServ.verExperiencia();
  }
  @DeleteMapping ("/portfolio/experiencias/{id}")
  public void borrarExperiencia (@PathVariable Long id){
  experienciaServ.borrarExperiencia(id);
  }  
  
    @PutMapping ("/portfolio/experiencias/{id}")   
   public void editarExperiencia (@RequestBody Experiencia exp) {
  experienciaServ.editarExperiencia(exp);
  } 
  
  }
