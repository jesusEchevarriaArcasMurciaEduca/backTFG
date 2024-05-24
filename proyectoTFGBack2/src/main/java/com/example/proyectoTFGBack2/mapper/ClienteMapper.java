package com.example.proyectoTFGBack2.mapper;

import com.example.proyectoTFGBack2.DTO.ClienteDTO;
import com.example.proyectoTFGBack2.modelo.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO ClienteToClienteDTO(Cliente cliente);

    Cliente ClienteDTOToCliente(ClienteDTO clienteDTO);
}
