package erp.inventario.rol;

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
@RequestMapping("/api/rol")
@CrossOrigin({"*"})
public class RolController {

    @Autowired
    RolService service;

    @GetMapping("/{id}/")
    public Rol findById( @PathVariable long id ){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Rol> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Rol save( @RequestBody Rol entitiy ){
        return service.save(entitiy);
    }
    
    @PutMapping("/")
    public Rol update ( @RequestBody Rol entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById( @PathVariable long id ){
        service.deleteById(id);
    }

}
