package aplicacionWeb.Web.Controller;

import aplicacionWeb.Web.model.Users;
import aplicacionWeb.Web.service.IUsersService;
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
   @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app/")
public class UsersController {      
 @Autowired
private IUsersService usersServ;  
  @PostMapping ("/new/users")
  public void agregarUsers (@RequestBody Users user) {
  usersServ.agregarUsers(user);
  } 
  @GetMapping ("/portfolio/users") 
  @ResponseBody
  public List<Users> verUsers() {
 return usersServ.verUsers();
  }
  @DeleteMapping ("/delete/users/{id}")
  public void borrarUsers (@PathVariable Long id){
  usersServ.borrarUsers(id);
  } 
  }