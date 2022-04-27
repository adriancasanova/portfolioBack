package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Proyecto;
import java.util.List;

public interface IProyectoService {
     public List <Proyecto> verProyecto();
    public void agregarProyecto (Proyecto proyect);
    public void borrarProyecto (Long id);
    public Proyecto buscarProyecto (Long id); 
}
