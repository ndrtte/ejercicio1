package hn.unah.poo.ejercicio1.ejercicio1.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usuarios")
public class Usuarios {
    
    @Id
    @Column(name="codigousuario")
    private String codigoUsuario;
    
    private String nombre;
    
    private String apellido;

    private String departamento;

    private String correo;
    
    private String telefono;
}
