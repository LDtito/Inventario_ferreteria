package erp.inventario.reabastecimiento;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;



@RestController
@RequestMapping("/api/reabastecimiento")
@CrossOrigin({"*"})
public class ReabastecimientoController {

@Autowired
ReabastecimientoService service;


@PostMapping("/")
public Reabastecimiento save (@RequestBody Reabastecimiento entity){
return service.save(entity);
}

// Get 2

@GetMapping("/{id}/")
public Reabastecimiento findById(@PathVariable long id){
return service.findById(id);
}

@GetMapping("/")
public List<Reabastecimiento> findAll(){
return service.findAll();
}


// Put

@PutMapping("/")
public Reabastecimiento update (@RequestBody Reabastecimiento entity){
return service.save(entity);
}

//Delete

@DeleteMapping("/{id}/")
public void deeteById(@PathVariable long id){
service.deleteById(id);
}
 @PatchMapping("/{id}/")
    public Reabastecimiento partialUpdate(@PathVariable long id, @RequestBody Map<String, Object> fields){

        Reabastecimiento entity = findById(id);

        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = Reabastecimiento.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                ObjectMapper mapper = new ObjectMapper();
                mapper.registerModule(new JavaTimeModule());
                campoEntidad.set(entity, mapper.convertValue(fieldValue, campoEntidad.getType()));
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                // maneja la excepción si ocurre algún error al acceder al campo
            }
        }
        return update(entity);
    }

}