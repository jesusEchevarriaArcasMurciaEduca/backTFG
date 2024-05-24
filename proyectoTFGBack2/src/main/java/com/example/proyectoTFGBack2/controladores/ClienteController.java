package com.example.proyectoTFGBack2.controladores;


import com.example.proyectoTFGBack2.InterfazServicio.ClienteInterface;
import com.example.proyectoTFGBack2.DTO.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteInterface clienteInterface;

    @GetMapping
    public List<ClienteDTO> getAllClientes() {
        return clienteInterface.getAllClientes();
    }

    @GetMapping("/{id}")
    public ClienteDTO getClienteById(@PathVariable Long id) {
        return clienteInterface.getClienteById(id);
    }

    @PostMapping
    public ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteInterface.saveCliente(clienteDTO);
    }

    @PutMapping("/{id}")
    public ClienteDTO updateCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO) {
        return clienteInterface.updateCliente(id, clienteDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteInterface.deleteCliente(id);
    }
}
