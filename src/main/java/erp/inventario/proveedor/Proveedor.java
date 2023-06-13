package erp.inventario.proveedor;

import erp.inventario.ciudad.Ciudad;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity


public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreProveedor;
    private String direccionProveedor;

    @ManyToOne
    private Ciudad ciudad;
}
