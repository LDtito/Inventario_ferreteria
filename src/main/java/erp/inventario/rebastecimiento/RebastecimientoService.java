package erp.inventario.rebastecimiento;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RebastecimientoService {
@Autowired
    RebastecimientoRepository repository;
//CRUD

//Create

public Rebastecimiento save( Rebastecimiento entity){
    return repository.save(entity);

}

//Delete
public void deleteById(long id){
    repository.deleteById(id);
}

//get
public Rebastecimiento findById(long id){
    return repository.findById(id).orElse(null);
}

public List<Rebastecimiento> findAll(){
    return repository.findAll();
}


}
