package com.example.proyectoTFGBack2.InterfazServicio;

import com.example.proyectoTFGBack2.DTO.TrabajadorDTO;

import java.util.List;

public interface TrabajadorInterface {
    public List<TrabajadorDTO> getAllTrabajadores();
    public TrabajadorDTO getTrabajadorById(Long id);
    public TrabajadorDTO saveTrabajador(TrabajadorDTO trabajadorDTO);
    public TrabajadorDTO updateTrabajador(Long id, TrabajadorDTO trabajadorDTO);
    public void deleteTrabajador(Long id);
}
