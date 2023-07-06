package erp.inventario.rol;

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
     @PatchMapping("/{id}/")
    public Rol partialUpdate(@PathVariable long id, @RequestBody Map<String, Object> fields){

        Rol entity = findById(id);

        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = Rol.class.getDeclaredField(fieldName);
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
