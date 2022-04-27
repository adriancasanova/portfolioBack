
package aplicacionWeb.Web.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
      private long id;
     private String bannerImg;

    public Banner(long id, String bannerImg) {
     
          this.id = id;
        this.bannerImg = bannerImg; 
    }    

    public Banner() {
    }     
     
    
}
