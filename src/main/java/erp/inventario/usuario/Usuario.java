package erp.inventario.usuario;

import erp.inventario.compania.Compania;
import erp.inventario.rol.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
    
@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String nombre;
    private String correo;
    private String contraseña;

    @ManyToOne
    private Rol rol;

    @ManyToOne
    private Compania compania;
}
