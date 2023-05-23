package erp.inventario.proveedor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository repository;
    public Proveedor save( Proveedor entity ){
         return repository.save(entity);
    }
    public void deleteById(Long id){
        repository.deleteById(id);
    }
    public Proveedor findById(long id){
        return repository.findById(id).orElse(null);
    }
    public List<Proveedor> findAll(){
        return repository.findAll();
    }

   
}
