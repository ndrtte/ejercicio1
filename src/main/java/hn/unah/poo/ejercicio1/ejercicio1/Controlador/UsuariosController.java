package hn.unah.poo.ejercicio1.ejercicio1.Controlador;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.ejercicio1.ejercicio1.Servicio.UsuarioServicio;
import hn.unah.poo.ejercicio1.ejercicio1.dto.UsuarioDTO;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping("/crear/nuevo")
    public String crearUsuarios(@RequestBody UsuarioDTO nvoUsuario) {
        return usuarioServicio.crearUsuarios(nvoUsuario);
    }
    
    @DeleteMapping("/eliminar/{dni}")
    public String eliminarUsuario(@PathVariable(name="dni")String dni){
        return usuarioServicio.eliminarUsuario(dni);
    }

    @GetMapping("/obtener/dni")
    public UsuarioDTO obtenerUsuario(@RequestParam(name="dni") String dni) {
        return usuarioServicio.obtenerUsuario(dni);
    }
    
    @GetMapping("/obtener")
    public List obtenerTodos() {
        return usuarioServicio.obtenerTodos();
    }
    

}
