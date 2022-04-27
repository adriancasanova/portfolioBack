package aplicacionWeb.Web.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Navbar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String logo;
     private String link;
     

    public Navbar(int id, String logo, String link) {
          this.id = id;
        this.logo = logo;
         this.link = link;       
    }
        

    public Navbar() {
    }     
     
    
}
