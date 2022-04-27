
package aplicacionWeb.Web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String aboutNombre;
     private String aboutDescripcion;
     private String aboutImg;

    public Portfolio(int id, String aboutNombre, String aboutDescripcion, String aboutImg) {
        this.id = id;
        this.aboutNombre = aboutNombre;
        this.aboutDescripcion = aboutDescripcion;
        this.aboutImg = aboutImg;
    }
     

    

    public Portfolio() {
    }
       
     
     
    
}
