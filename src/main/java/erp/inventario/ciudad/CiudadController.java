package erp.inventario.ciudad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/ciudad")
@CrossOrigin({"*"})
public class CiudadController {
    @Autowired
    CiudadService Service;
    @GetMapping("/{id}/")
    public Ciudad findById(@PathVariable long id){
        return Service.findById(id);
    }
    @GetMapping ("/")
    public List<Ciudad> findAll(){
        return Service.findAll();
    }
    @PostMapping("/")
    public Ciudad save (@RequestBody Ciudad entity){
        return Service.save(entity);
    }

    @PutMapping ("/")
    public Ciudad update (@RequestBody Ciudad entity){
        return Service.save(entity);
    }


    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        Service.deleteById(id);
    }

}
