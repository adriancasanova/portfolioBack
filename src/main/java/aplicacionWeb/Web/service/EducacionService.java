
package aplicacionWeb.Web.service;


import aplicacionWeb.Web.model.Educacion;
import aplicacionWeb.Web.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
    
    
    @Autowired
    public EducacionRepository educacionRepo; 
    
    @Override
    public List<Educacion> verEducacion() {
       return educacionRepo.findAll();
    }

    @Override
    public void agregarEducacion(Educacion edu) {
    educacionRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
     educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
         return educacionRepo.findById(id).orElse(null);
    }

    @Override
  public void editarEducacion (Educacion edu){
  educacionRepo.save(edu);
  }
    
}