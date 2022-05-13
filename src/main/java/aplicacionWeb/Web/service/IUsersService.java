package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Users;
import java.util.List;

public interface IUsersService {
  public  List<Users> getUsuarios();
   public void eliminar(Long id);
   public void registrar(Users usuario);
   public Users obtenerUsuarioPorCredenciales(Users usuario);    
}
