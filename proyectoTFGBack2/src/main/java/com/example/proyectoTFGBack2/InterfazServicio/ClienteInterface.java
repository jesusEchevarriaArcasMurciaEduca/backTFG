package com.example.proyectoTFGBack2.InterfazServicio;

import com.example.proyectoTFGBack2.DTO.ClienteDTO;

import java.util.List;

public interface ClienteInterface {

    public List<ClienteDTO> getAllClientes();
    public ClienteDTO getClienteById(Long id);
    public ClienteDTO saveCliente(ClienteDTO clienteDTO);
    public ClienteDTO updateCliente(Long id, ClienteDTO clienteDTO);
    public void deleteCliente(Long id);
}
