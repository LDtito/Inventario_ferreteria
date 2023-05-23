package erp.inventario.producto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
@Autowired
    ProductoRepository repository;
//CRUD

//Create

public Producto save( Producto entity){
    return repository.save(entity);

}

//Delete
public void deleteById(long id){
    repository.deleteById(id);
}

//get
public Producto findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Producto> findAll(){
    return repository.findAll();
}


}
