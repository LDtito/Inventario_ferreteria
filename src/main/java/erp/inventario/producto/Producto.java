package erp.inventario.producto;

import java.math.BigDecimal;

import erp.inventario.categorias.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Producto {
//  Delimitador de acceso , tipo de dato, nombre del atributo
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String nombre;
private String descripcion;
private BigDecimal precioUnitario;

@ManyToOne
private Categoria categoria;
@ManyToOne
private Producto reabastesimiento;

}

