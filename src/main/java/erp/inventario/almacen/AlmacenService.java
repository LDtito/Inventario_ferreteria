package erp.inventario.almacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class AlmacenService {
    @Autowired
    AlmacenRepository repository;
    
    public Almacen save( Almacen entity ){
        return repository.save(entity);
    }
    
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    public Almacen findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    public List<Almacen> findAll(){
        return repository.findAll();
    }
    
}
