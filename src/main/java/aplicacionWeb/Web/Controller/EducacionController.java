package aplicacionWeb.Web.Controller;

import aplicacionWeb.Web.model.Educacion;
import aplicacionWeb.Web.service.IEducacionService;
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
  
public class EducacionController {      
 @Autowired
private IEducacionService educacionServ;  
  @PostMapping ("/portfolio/educaciones")
  public void agregarEducacion (@RequestBody Educacion edu) {
  educacionServ.agregarEducacion(edu);
  } 
  @GetMapping ("/portfolio/educaciones") 
  @ResponseBody
  public List<Educacion> verEducacion() {
 return educacionServ.verEducacion();
  }

  @DeleteMapping ("/portfolio/educaciones/{id}") 
  public void borrarEducacion (@PathVariable Long id){
  educacionServ.borrarEducacion(id);
  }  
  
  @PutMapping ("/portfolio/educaciones/{id}")   
   public void editarEducacion (@RequestBody Educacion edu) {
  educacionServ.editarEducacion(edu);
  } 
  
  
  }