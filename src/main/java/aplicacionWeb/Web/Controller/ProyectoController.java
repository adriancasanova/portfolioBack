package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.model.Proyecto;
import aplicacionWeb.Web.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController  
// @CrossOrigin (origins = "http://localhost:4200")
   @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app")
public class ProyectoController {      
 @Autowired
private IProyectoService proyectoServ;  
  @PostMapping ("/new/proyectos")
  public void agregarProyecto (@RequestBody Proyecto proyect) {
  proyectoServ.agregarProyecto(proyect);
  } 
  @GetMapping ("/portfolio/proyectos") 
  @ResponseBody
  public List<Proyecto> verProyecto() {
 return proyectoServ.verProyecto();
  }
  @DeleteMapping ("/delete/proyectos/{id}")
  public void borrarProyecto (@PathVariable Long id){
  proyectoServ.borrarProyecto(id);
  }  
   @PutMapping ("/portfolio/proyectos/{id}")
  public void editarProyectos (@RequestBody Proyecto proyect) {
  proyectoServ.editarProyecto(proyect);
  } 
  
  }