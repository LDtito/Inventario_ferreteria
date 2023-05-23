package erp.inventario.proveedor;

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
@RequestMapping("/api/proveedor")
@CrossOrigin({"*"})
public class ProveedorController {
    @Autowired
    ProveedorService Service;
    @GetMapping("/{id}/")
    public Proveedor findById(@PathVariable long id){
        return Service.findById(id);
    }
    @GetMapping ("/")
    public List<Proveedor> findAll(){
        return Service.findAll();
    }
    @PostMapping("/")
    public Proveedor save (@RequestBody Proveedor entity){
        return Service.save(entity);
    }

    @PutMapping ("/")
    public Proveedor update (@RequestBody Proveedor entity){
        return Service.save(entity);
    }


    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        Service.deleteById(id);
    }

}