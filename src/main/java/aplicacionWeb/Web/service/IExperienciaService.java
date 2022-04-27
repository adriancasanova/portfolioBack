package aplicacionWeb.Web.service;

import aplicacionWeb.Web.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
     public List <Experiencia> verExperiencia();
    public void agregarExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id); 
     public void editarExperiencia (Experiencia exp);
}

