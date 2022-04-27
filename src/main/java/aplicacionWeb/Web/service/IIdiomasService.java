package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Idiomas;
import java.util.List;

public interface IIdiomasService {
     public List <Idiomas> verIdiomas();
    public void agregarIdiomas (Idiomas idiom);
    public void borrarIdiomas (Long id);
    public Idiomas buscarIdiomas (Long id); 
}

