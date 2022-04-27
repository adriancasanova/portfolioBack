
package aplicacionWeb.Web.service;

import aplicacionWeb.Web.model.Banner;
import java.util.List;

public interface IBannerService {
     public List <Banner> verBanner();
    public void agregarBanner (Banner bann);
    public void borrarBanner (Long id);
    public Banner buscarBanner (Long id); 
     public void editarBanner (Banner bann);
}
