package erp.inventario.compania;

import erp.inventario.ciudad.Ciudad;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity


public class Compania {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreCompania;
    private String direccionCompania;
    private Integer telefonoCompania;
    private String correoCompania;

    @ManyToOne
    private Ciudad ciudad;
}

