package erp.inventario.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    @Autowired
    RolRepository repository;

    public Rol save( Rol entity ){
        return repository.save(entity);
    }

    public void deleteById( Long id ){
        repository.deleteById(id);
    }

    public Rol findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Rol> findAll(){
        return repository.findAll();
    }

}
