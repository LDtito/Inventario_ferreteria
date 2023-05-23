package erp.inventario.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;
    
    public Usuario save( Usuario entity ){
        return repository.save(entity);
    }
    
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    public Usuario findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    public List<Usuario> findAll(){
        return repository.findAll();
    }
    
}