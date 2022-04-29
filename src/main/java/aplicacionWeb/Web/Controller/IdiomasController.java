package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.model.Idiomas;
import aplicacionWeb.Web.service.IIdiomasService;
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
public class IdiomasController {      
 @Autowired
private IIdiomasService idiomasServ;  
  @PostMapping ("/new/idiomas")
  public void agregarIdiomas (@RequestBody Idiomas idiom) {
  idiomasServ.agregarIdiomas(idiom);
  } 
  @GetMapping ("/portfolio/idiomas") 
  @ResponseBody
  public List<Idiomas> verIdiomas() {
 return idiomasServ.verIdiomas();
  }
  @DeleteMapping ("/delete/idiomas/{id}")
  public void borrarIdiomas (@PathVariable Long id){
  idiomasServ.borrarIdiomas(id);
  }  
  }

