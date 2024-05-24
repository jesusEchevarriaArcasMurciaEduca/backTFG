package com.example.proyectoTFGBack2.mapper;

import com.example.proyectoTFGBack2.DTO.TrabajadorDTO;
import com.example.proyectoTFGBack2.modelo.Trabajador;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TrabajadorMapper {

    TrabajadorMapper INSTANCE = Mappers.getMapper(TrabajadorMapper.class);

    TrabajadorDTO TrabajadorToTrabajadorDTO(Trabajador trabajador);

    Trabajador TrabajadorDTOToTrabajador(TrabajadorDTO trabajadorDTO);
}




