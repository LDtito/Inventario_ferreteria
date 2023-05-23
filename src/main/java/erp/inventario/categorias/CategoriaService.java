package erp.inventario.categorias;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
     CategoriaRepository repository;
    //CRUD

    //Create

    public Categoria save( Categoria entity){
       return repository.save(entity);

    }

    //Delete
    public void deleteById(long id){
        repository.deleteById(id);
    }

    //get
    public Categoria findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Categoria> findAll(){
        return repository.findAll();
    }

 
}
