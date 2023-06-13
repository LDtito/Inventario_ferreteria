package erp.inventario.cliente;


import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
    
@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String nombreCliente;
    private Timestamp fechaNacimiento;
    private String direccion;
    private String correoElectronico;
        
}