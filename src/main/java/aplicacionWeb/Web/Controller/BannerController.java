
package aplicacionWeb.Web.Controller;

import aplicacionWeb.Web.model.Banner;
import aplicacionWeb.Web.service.IBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController  
 @CrossOrigin (origins = "http://localhost:4200")
  
public class BannerController {      
 @Autowired
private IBannerService bannerServ;  
  @PostMapping ("/new/banners")
  public void agregarBanner (@RequestBody Banner bann) {
  bannerServ.agregarBanner(bann);
  } 
  @GetMapping ("/portfolio/banners") 
  @ResponseBody
  public List<Banner> verBanner() {
 return bannerServ.verBanner();
  }
  @DeleteMapping ("/admin/banners/{id}")
  public void borrarBanner (@PathVariable Long id){
  bannerServ.borrarBanner(id);
  }  
   @PutMapping ("/portfolio/banners/{id}")
  public void editarBanner (@RequestBody Banner bann) {
  bannerServ.editarBanner(bann);
  } 
  
  }