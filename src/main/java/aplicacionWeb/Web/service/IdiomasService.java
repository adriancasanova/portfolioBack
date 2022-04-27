package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Idiomas;
import aplicacionWeb.Web.repository.IdiomasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomasService implements IIdiomasService{   
    
    @Autowired
    public IdiomasRepository idiomasRepo; 
    
    @Override
    public List<Idiomas> verIdiomas() {
       return idiomasRepo.findAll();
    }

    @Override
    public void agregarIdiomas(Idiomas idiom) {
    idiomasRepo.save(idiom);
    }
    
  

    @Override
    public void borrarIdiomas(Long id) {
     idiomasRepo.deleteById(id);
    }

    @Override
    public Idiomas buscarIdiomas(Long id) {
     return idiomasRepo.findById(id).orElse(null);
    }   
    
}