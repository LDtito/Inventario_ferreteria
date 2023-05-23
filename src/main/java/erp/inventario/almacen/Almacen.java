package erp.inventario.almacen;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
    
@Data
@Entity
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String nombreAlmacen;
    private String direccionAlmacen;
    private String capacidadAlmacenamiento;
        
}
