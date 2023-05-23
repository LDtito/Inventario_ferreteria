package erp.inventario.cliente;

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
@RequestMapping("/api/cliente")
@CrossOrigin({"*"})
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping("/{id}/")
    public Cliente findById( @PathVariable long id ){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Cliente save( @RequestBody Cliente entitiy ){
        return service.save(entitiy);
    }
    
    @PutMapping("/")
    public Cliente update ( @RequestBody Cliente entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById( @PathVariable long id ){
        service.deleteById(id);
    }

}
