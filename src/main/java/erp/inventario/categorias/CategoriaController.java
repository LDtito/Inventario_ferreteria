package erp.inventario.categorias;

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
@RequestMapping("/api/categoria")
@CrossOrigin({"*"})
public class CategoriaController {

    @Autowired
    CategoriaService service;


    @PostMapping("/")
    public Categoria save (@RequestBody Categoria entity){
        return service.save(entity);
    }

    // Get 2

    @GetMapping("/{id}/")
    public Categoria findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Categoria> findAll(){
        return service.findAll();
    }


    // Put

    @PutMapping("/")
    public Categoria update (@RequestBody Categoria entity){
        return service.save(entity);
    }

    //Delete

    @DeleteMapping("/{id}/")
    public void deeteById(@PathVariable long id){
        service.deleteById(id);
    }


}
