package com.example.proyectoTFGBack2.controladores;


import com.example.proyectoTFGBack2.InterfazServicio.TrabajadorInterface;
import com.example.proyectoTFGBack2.DTO.TrabajadorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabajadores")
public class TrabajadorController {

    @Autowired
    private TrabajadorInterface trabajadorInterface;

    @GetMapping
    public List<TrabajadorDTO> getAllTrabajadores() {
        return trabajadorInterface.getAllTrabajadores();
    }

    @GetMapping("/{id}")
    public TrabajadorDTO getTrabajadorById(@PathVariable Long id) {
        return trabajadorInterface.getTrabajadorById(id);
    }

    @PostMapping
    public TrabajadorDTO createTrabajador(@RequestBody TrabajadorDTO trabajadorDTO) {
        return trabajadorInterface.saveTrabajador(trabajadorDTO);
    }

    @PutMapping("/{id}")
    public TrabajadorDTO updateTrabajador(@PathVariable Long id, @RequestBody TrabajadorDTO trabajadorDTO) {
        return trabajadorInterface.updateTrabajador(id, trabajadorDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTrabajador(@PathVariable Long id) {
        trabajadorInterface.deleteTrabajador(id);
    }
}
