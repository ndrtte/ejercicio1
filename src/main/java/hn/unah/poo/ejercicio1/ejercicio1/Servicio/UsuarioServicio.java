package hn.unah.poo.ejercicio1.ejercicio1.Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.ejercicio1.ejercicio1.Modelo.Usuarios;
import hn.unah.poo.ejercicio1.ejercicio1.Repositorio.UsuarioRepositorio;
import hn.unah.poo.ejercicio1.ejercicio1.dto.UsuarioDTO;
import hn.unah.poo.ejercicio1.ejercicio1.modelmapper.ModelMapperSingleton;


@Service
public class UsuarioServicio {
    
    private ModelMapper modelMapper = ModelMapperSingleton.getInstancia();

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public String crearUsuarios(UsuarioDTO nvoUsuario) {
        if (usuarioRepositorio.existsById(nvoUsuario.getCodigoUsuario())){
            return "Este usuario ya existe";
        }
        Usuarios usuarioBD = new Usuarios();
        usuarioBD = modelMapper.map(nvoUsuario, Usuarios.class);
        usuarioRepositorio.save(usuarioBD);
        return "Este usuario ha sido creado con exito";
    }

    public String eliminarUsuario(String dni){
        if(!usuarioRepositorio.existsById(dni)){
            return "El usuario no existe";
        }
        usuarioRepositorio.deleteById(dni);
        return "El usuario ha sido borrado con exito";
    }

    public UsuarioDTO obtenerUsuario(String dni) {
        Optional <Usuarios> usuario = usuarioRepositorio.findById(dni);
        UsuarioDTO usuarioDTO = modelMapper.map(usuario, UsuarioDTO.class);
        return usuarioDTO;
    }

    public List<Usuarios> obtenerTodos() {
        return this.usuarioRepositorio.findAll();
    }
    

}
