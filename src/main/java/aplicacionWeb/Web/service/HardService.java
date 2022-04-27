package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Hard;
import aplicacionWeb.Web.repository.HardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardService implements IHardService{   
    
    @Autowired
    public HardRepository hardRepo; 
    
    @Override
    public List<Hard> verHard() {
       return hardRepo.findAll();
    }

    @Override
    public void agregarHard(Hard har) {
    hardRepo.save(har);
    }

    @Override
    public void borrarHard(Long id) {
     hardRepo.deleteById(id);
    }

    @Override
    public Hard buscarHard(Long id) {
     return hardRepo.findById(id).orElse(null);
    }   
    
}