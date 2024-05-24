package com.example.proyectoTFGBack2.servicios;

import com.example.proyectoTFGBack2.DTO.ClienteDTO;
import com.example.proyectoTFGBack2.InterfazServicio.ClienteInterface;
import com.example.proyectoTFGBack2.mapper.ClienteMapper;
import com.example.proyectoTFGBack2.modelo.Cliente;
import com.example.proyectoTFGBack2.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService implements ClienteInterface {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    public List<ClienteDTO> getAllClientes() {
        List<Cliente> Clientes = clienteRepository.findAll();
        return Clientes.stream()
                .map(clienteMapper::ClienteToClienteDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO getClienteById(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        return cliente != null ? clienteMapper.ClienteToClienteDTO(cliente) : null;
    }

    public ClienteDTO saveCliente(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.ClienteDTOToCliente(clienteDTO);
        return clienteMapper.ClienteToClienteDTO(clienteRepository.save(cliente));
    }

    public ClienteDTO updateCliente(Long id, ClienteDTO clienteDTO) {
        Cliente existingCliente = clienteRepository.findById(id).orElse(null);
        if (existingCliente != null) {
            existingCliente.setNombre(clienteDTO.getNombre());
            existingCliente.setApellidos(clienteDTO.getApellidos());
            existingCliente.setClave(clienteDTO.getClave());
            existingCliente.setTelefono(clienteDTO.getTelefono());
            existingCliente.setDireccion(clienteDTO.getDireccion());
            return clienteMapper.ClienteToClienteDTO(clienteRepository.save(existingCliente));
        }
        return null;
    }

    public void deleteCliente(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        }
    }
}
