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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@Tag(name = "Controlador de la ciudad")
@RequestMapping("/api/ciudad")
@CrossOrigin({"*"})
public class CiudadController {
    @Autowired
    CiudadService Service;
    @GetMapping("/{id}/")
    @Operation(summary = "Obtiene todas las ciudades")
    public Ciudad findById(@PathVariable long id){
        return Service.findById(id);
    }
    @GetMapping ("/")
    @Operation(summary = "Obtiene todas las ciudades")
    public List<Ciudad> findAll(){
        return Service.findAll();
    }
    @PostMapping("/")
    @Operation(summary = "Obtiene todas las ciudades")
    public Ciudad save (@RequestBody Ciudad entity){
        return Service.save(entity);
    }

    @PutMapping ("/")
    @Operation(summary = "Obtiene todas las ciudades")
    public Ciudad update (@RequestBody Ciudad entity){
        return Service.save(entity);
    }


    @DeleteMapping("/{id}/")
    @Operation(summary = "Obtiene todas las ciudades")
    public void deleteById(@PathVariable long id){
        Service.deleteById(id);
    }

}
