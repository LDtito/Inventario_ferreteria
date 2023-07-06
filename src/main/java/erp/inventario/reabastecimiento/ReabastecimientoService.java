package erp.inventario.reabastecimiento;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReabastecimientoService {
@Autowired
    ReabastecimientoRepository repository;
//CRUD

//Create

public Reabastecimiento save( Reabastecimiento entity){
    return repository.save(entity);

}

//Delete
public void deleteById(long id){
    repository.deleteById(id);
}

//get
public Reabastecimiento findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Reabastecimiento> findAll(){
    return repository.findAll();
}


}
