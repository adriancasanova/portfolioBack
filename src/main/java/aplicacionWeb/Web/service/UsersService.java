package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Users;
import aplicacionWeb.Web.repository.UsersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersService implements IUsersService{
    
    
    @Autowired
    public UsersRepository usersRepo; 
    
    @Override
    public List<Users> verUsers() {
       return usersRepo.findAll();
    }

    @Override
    public void agregarUsers(Users user) {
    usersRepo.save(user);
    }

    @Override
    public void borrarUsers(Long id) {
     usersRepo.deleteById(id);
    }

    @Override
    public Users buscarUsers(Long id) {
     return usersRepo.findById(id).orElse(null);
    }

   
    
}
