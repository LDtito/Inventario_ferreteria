package erp.inventario.rebastecimiento;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RebastecimientoRepository extends CrudRepository <Rebastecimiento, Long> {
List<Rebastecimiento> findAll();

}

