package aplicacionWeb.Web.model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String skill;


    public Idiomas(int id, String skill) {
        this.id = id;
        this.skill = skill;
    }

    public Idiomas() {
    }     
     
    
}
