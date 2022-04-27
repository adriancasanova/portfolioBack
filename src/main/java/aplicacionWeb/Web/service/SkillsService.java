package aplicacionWeb.Web.service;
import aplicacionWeb.Web.model.Skills;
import aplicacionWeb.Web.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillsService implements ISkillsService{
    
    
    @Autowired
    public SkillsRepository skillsRepo; 
    
    @Override
    public List<Skills> verSkills() {
       return skillsRepo.findAll();
    }

    @Override
    public void agregarSkills(Skills ski) {
    skillsRepo.save(ski);
    }

    @Override
    public void borrarSkills(Long id) {
     skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
     return skillsRepo.findById(id).orElse(null);
    }

   
    
}
