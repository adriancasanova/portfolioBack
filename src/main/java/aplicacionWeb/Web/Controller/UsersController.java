package aplicacionWeb.Web.Controller;
import aplicacionWeb.Web.service.IUsersService;
import aplicacionWeb.Web.model.Users;
import aplicacionWeb.Web.service.UsersService;
import aplicacionWeb.Web.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class UsersController {
   
    @Autowired
    private IUsersService usuarioDao;  

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "ver/usuarios", method = RequestMethod.GET)
    public List<Users> getUsuarios(@RequestHeader(value="Authorization") String token) {
        if (!validarToken(token)) { return null; }
        return usuarioDao.getUsuarios();
    }

    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

    @RequestMapping(value = "crear/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Users usuario) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword());
        usuario.setPassword(hash); 
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@RequestHeader(value="Authorization") String token,
                          @PathVariable Long id) {
       if (!validarToken(token)) { return; } 
       usuarioDao.eliminar(id);
    }
}