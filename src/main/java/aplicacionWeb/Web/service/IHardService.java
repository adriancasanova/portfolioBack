package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Hard;
import java.util.List;

public interface IHardService {
     public List <Hard> verHard();
    public void agregarHard (Hard har);
    public void borrarHard (Long id);
    public Hard buscarHard (Long id); 
}

