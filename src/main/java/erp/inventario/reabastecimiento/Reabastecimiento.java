package erp.inventario.reabastecimiento;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Reabastecimiento {
//  Delimitador de acceso , tipo de dato, nombre del atributo
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private int productoReabastecimiento;
private int cantidadReabastecimiento;
private Date fechaReabastecimiento;
}
