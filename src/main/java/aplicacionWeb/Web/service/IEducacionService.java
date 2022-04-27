package aplicacionWeb.Web.service;

import aplicacionWeb.Web.model.Educacion;
import java.util.List;

public interface IEducacionService {
     public List <Educacion> verEducacion();
    public void agregarEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id); 
    public void editarEducacion (Educacion edu);
}
