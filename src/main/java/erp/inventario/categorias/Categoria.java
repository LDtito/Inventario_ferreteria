package erp.inventario.categorias;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Categoria {
//  Delimitador de acceso , tipo de dato, nombre del atributo
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 private String nombre;
 private String descripcion;
}


