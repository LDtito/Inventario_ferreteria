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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Controlador de categorias")
@RequestMapping("/api/categoria")
@CrossOrigin({"*"})
public class CategoriaController {

    @Autowired
    CategoriaService service;


    @PostMapping("/")
     @Operation(summary = "Obtiene todas las categorias")
    public Categoria save (@RequestBody Categoria entity){
        return service.save(entity);
    }

    // Get 2

    @GetMapping("/{id}/")
     @Operation(summary = "Obtiene todas las categorias")
    public Categoria findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
     @Operation(summary = "Obtiene todas las categorias")
    public List<Categoria> findAll(){
        return service.findAll();
    }


    // Put

    @PutMapping("/")
     @Operation(summary = "Obtiene todas las categorias")
    public Categoria update (@RequestBody Categoria entity){
        return service.save(entity);
    }

    //Delete

    @DeleteMapping("/{id}/")
    @Operation(summary = "Obtiene todas las categorias")
    public void deeteById(@PathVariable long id){
        service.deleteById(id);
    }


}
