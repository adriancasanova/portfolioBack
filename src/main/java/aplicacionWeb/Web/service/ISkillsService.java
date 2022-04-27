package aplicacionWeb.Web.service;

import aplicacionWeb.Web.model.Skills;
import java.util.List;

public interface ISkillsService {
     public List <Skills> verSkills();
    public void agregarSkills (Skills ski);
    public void borrarSkills (Long id);
    public Skills buscarSkills (Long id); 
}

