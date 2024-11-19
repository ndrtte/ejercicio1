package hn.unah.poo.ejercicio1.ejercicio1.modelmapper;

import org.modelmapper.ModelMapper;

public class ModelMapperSingleton {

    private static ModelMapper modelMapper;

    private ModelMapperSingleton(){
    }

    public static ModelMapper getInstancia(){
        if(modelMapper==null){
            modelMapper = new ModelMapper();
        }
        return modelMapper;
    }
}
