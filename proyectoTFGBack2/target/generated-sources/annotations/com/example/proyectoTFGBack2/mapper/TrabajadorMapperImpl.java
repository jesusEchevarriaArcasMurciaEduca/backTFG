package com.example.proyectoTFGBack2.mapper;

import com.example.proyectoTFGBack2.DTO.TrabajadorDTO;
import com.example.proyectoTFGBack2.modelo.Trabajador;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-03T12:42:04+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class TrabajadorMapperImpl implements TrabajadorMapper {

    @Override
    public TrabajadorDTO TrabajadorToTrabajadorDTO(Trabajador trabajador) {
        if ( trabajador == null ) {
            return null;
        }

        TrabajadorDTO trabajadorDTO = new TrabajadorDTO();

        trabajadorDTO.setId( trabajador.getId() );
        trabajadorDTO.setNombre( trabajador.getNombre() );
        trabajadorDTO.setApellidos( trabajador.getApellidos() );
        trabajadorDTO.setClave( trabajador.getClave() );
        trabajadorDTO.setEspecialidad( trabajador.getEspecialidad() );

        return trabajadorDTO;
    }

    @Override
    public Trabajador TrabajadorDTOToTrabajador(TrabajadorDTO trabajadorDTO) {
        if ( trabajadorDTO == null ) {
            return null;
        }

        Trabajador trabajador = new Trabajador();

        trabajador.setId( trabajadorDTO.getId() );
        trabajador.setNombre( trabajadorDTO.getNombre() );
        trabajador.setApellidos( trabajadorDTO.getApellidos() );
        trabajador.setClave( trabajadorDTO.getClave() );
        trabajador.setEspecialidad( trabajadorDTO.getEspecialidad() );

        return trabajador;
    }
}
