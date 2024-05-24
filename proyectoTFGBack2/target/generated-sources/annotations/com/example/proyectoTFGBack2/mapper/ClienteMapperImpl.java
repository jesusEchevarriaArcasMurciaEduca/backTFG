package com.example.proyectoTFGBack2.mapper;

import com.example.proyectoTFGBack2.DTO.ClienteDTO;
import com.example.proyectoTFGBack2.modelo.Cliente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-03T12:42:04+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO ClienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( cliente.getId() );
        clienteDTO.setNombre( cliente.getNombre() );
        clienteDTO.setApellidos( cliente.getApellidos() );
        clienteDTO.setClave( cliente.getClave() );
        clienteDTO.setTelefono( cliente.getTelefono() );
        clienteDTO.setDireccion( cliente.getDireccion() );

        return clienteDTO;
    }

    @Override
    public Cliente ClienteDTOToCliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteDTO.getId() );
        cliente.setNombre( clienteDTO.getNombre() );
        cliente.setApellidos( clienteDTO.getApellidos() );
        cliente.setClave( clienteDTO.getClave() );
        cliente.setTelefono( clienteDTO.getTelefono() );
        cliente.setDireccion( clienteDTO.getDireccion() );

        return cliente;
    }
}
