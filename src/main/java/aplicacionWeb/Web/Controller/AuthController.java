
package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.service.IUsersService;
import aplicacionWeb.Web.model.Users;
import aplicacionWeb.Web.service.UsersService;
import aplicacionWeb.Web.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
  //@CrossOrigin (origins = "http://localhost:4200")
  @CrossOrigin (origins = "https://portafolio-angular-3c67e.web.app") 
public class AuthController {
    @Autowired
    private IUsersService usuarioDao;  
    @Autowired
    private JWTUtil jwtUtil;
    @RequestMapping(value = "portfolio/users", method = RequestMethod.POST)
    public String login(@RequestBody Users usuario) {
        Users usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales (usuario);
        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
            return tokenJwt;
        }
        return /*"FAIL"*/ null;
    }
}