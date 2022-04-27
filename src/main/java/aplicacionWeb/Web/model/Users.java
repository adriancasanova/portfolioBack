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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String email;
      private String password;


    public Users(int id, String email, String password) {
        this.id = id;
        this.email = email;
         this.password = password;
    }

    public Users() {
    }         
    
}
