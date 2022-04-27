package aplicacionWeb.Web.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
     private String educacionTitulo;    
     private String educacionDescripcion;     
     private String educacionLogo;   
     
   

    public Educacion(long id, String educacionTitulo, String educacionDescripcion, String educacionLogo) {
        this.id = id;
        this.educacionTitulo = educacionTitulo;        
        this.educacionDescripcion = educacionDescripcion;
        this.educacionLogo = educacionLogo;
    }
     
    public Educacion() {
    }     
     
    
}
