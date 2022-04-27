package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Users;
import java.util.List;
public interface IUsersService {
     public List <Users> verUsers();
    public void agregarUsers (Users user);
    public void borrarUsers (Long id);
    public Users buscarUsers (Long id); 
}
