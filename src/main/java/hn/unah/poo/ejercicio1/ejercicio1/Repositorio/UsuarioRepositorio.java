package hn.unah.poo.ejercicio1.ejercicio1.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.poo.ejercicio1.ejercicio1.Modelo.Usuarios;

public interface UsuarioRepositorio extends JpaRepository<Usuarios,String>{
    
}
