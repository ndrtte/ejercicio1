package hn.unah.poo.ejercicio1.ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private String codigoUsuario;
    
    private String nombre;
    
    private String apellido;

    private String departamento;

    private String correo;
    
    private String telefono;
}
