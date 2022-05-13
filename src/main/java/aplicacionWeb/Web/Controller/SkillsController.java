package aplicacionWeb.Web.Controller;

import aplicacionWeb.Web.model.Skills;
import aplicacionWeb.Web.service.ISkillsService;
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
 @CrossOrigin (origins = "http://localhost:4200")
//   @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app")
public class SkillsController {      
 @Autowired
private ISkillsService skillsServ;  
  @PostMapping ("/new/softs")
  public void agregarSkills (@RequestBody Skills ski) {
  skillsServ.agregarSkills(ski);
  } 
  @GetMapping ("/portfolio/softs") 
  @ResponseBody
  public List<Skills> verSkills() {
 return skillsServ.verSkills();
  }
  @DeleteMapping ("/delete/softs/{id}")
  public void borrarSkills (@PathVariable Long id){
  skillsServ.borrarSkills(id);
  }  
  }
