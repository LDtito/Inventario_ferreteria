package erp.inventario.proveedor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProveedorRepository extends CrudRepository <Proveedor, Long> {

    List<Proveedor> findAll();
    
}