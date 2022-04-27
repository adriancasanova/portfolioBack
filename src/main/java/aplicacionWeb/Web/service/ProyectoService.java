package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Proyecto;
import aplicacionWeb.Web.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    
    
    @Autowired
    public ProyectoRepository proyectoRepo; 
    
    @Override
    public List<Proyecto> verProyecto() {
       return proyectoRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto proyect) {
    proyectoRepo.save(proyect);
    }

    @Override
    public void borrarProyecto(Long id) {
     proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
         return proyectoRepo.findById(id).orElse(null);
    }

   
    
}
