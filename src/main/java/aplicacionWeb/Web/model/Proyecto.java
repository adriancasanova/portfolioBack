package aplicacionWeb.Web.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String proyectoTitulo;
     private String proyectoDescripcion;
     private String proyectoFecha;      
      private String proyectoLink;
       private String proyectoImg;  

    public Proyecto(int id, String proyectoTitulo, String proyectoDescripcion, String proyectoFecha, String proyectoLink, String proyectoImg) {
        this.id = id;
        this.proyectoTitulo = proyectoTitulo;
        this.proyectoDescripcion = proyectoDescripcion;
        this.proyectoFecha = proyectoFecha; 
        this.proyectoLink = proyectoLink; 
        this.proyectoImg = proyectoImg; 
    } 

    public Proyecto() {
    }         
    
}
