
package aplicacionWeb.Web.service;


import aplicacionWeb.Web.model.Banner;
import aplicacionWeb.Web.repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BannerService implements IBannerService{
    
    
    @Autowired
    public BannerRepository bannerRepo; 
    
    @Override
    public List<Banner> verBanner() {
       return bannerRepo.findAll();
    }

    @Override
    public void agregarBanner(Banner bann) {
    bannerRepo.save(bann);
    }

    @Override
    public void borrarBanner(Long id) {
     bannerRepo.deleteById(id);
    }

    @Override
    public Banner buscarBanner(Long id) {
         return bannerRepo.findById(id).orElse(null);
    }

     @Override
    public void editarBanner(Banner bann) {
    bannerRepo.save(bann);
    }
    
}
