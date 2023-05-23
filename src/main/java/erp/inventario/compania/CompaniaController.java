package erp.inventario.compania;

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
@RequestMapping("/api/compania")
@CrossOrigin({"*"})
public class CompaniaController {
    @Autowired
    CompaniaService Service;
    @GetMapping("/{id}/")
    public Compania findById(@PathVariable long id){
        return Service.findById(id);
    }
    @GetMapping ("/")
    public List<Compania> findAll(){
        return Service.findAll();
    }
    @PostMapping("/")
    public Compania save (@RequestBody Compania entity){
        return Service.save(entity);
    }

    @PutMapping ("/")
    public Compania update (@RequestBody Compania entity){
        return Service.save(entity);
    }


    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        Service.deleteById(id);
    }

}