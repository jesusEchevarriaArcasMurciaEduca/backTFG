package com.example.proyectoTFGBack2.mapper;


import com.example.proyectoTFGBack2.DTO.CitaDTO;
import com.example.proyectoTFGBack2.modelo.Cita;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitaMapper {

    CitaMapper INSTANCE = Mappers.getMapper(CitaMapper.class);

    @Mapping(source = "clienteId", target = "cliente.id")
    @Mapping(source = "trabajadorId", target = "trabajador.id")
    Cita citaDTOToCita(CitaDTO citaDTO);

    @Mapping(source = "cliente.id", target = "clienteId")
    @Mapping(source = "trabajador.id", target = "trabajadorId")
    CitaDTO citaToCitaDTO(Cita cita);
}
