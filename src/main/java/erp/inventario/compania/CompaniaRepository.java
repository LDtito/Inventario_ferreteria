package erp.inventario.compania;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompaniaRepository extends CrudRepository <Compania, Long> {

    List<Compania> findAll();
    
}
