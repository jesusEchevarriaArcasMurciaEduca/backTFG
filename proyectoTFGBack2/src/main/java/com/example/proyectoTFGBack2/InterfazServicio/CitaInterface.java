package com.example.proyectoTFGBack2.InterfazServicio;

import com.example.proyectoTFGBack2.DTO.CitaDTO;
import com.example.proyectoTFGBack2.mapper.CitaMapper;
import com.example.proyectoTFGBack2.repositorios.CitaRepository;

import java.util.List;

public interface CitaInterface {
    public List<CitaDTO> getAllCitas();
    public CitaDTO getCitaById(Long id);
    public CitaDTO saveCita(CitaDTO citaDTO);
    public CitaDTO updateCita(Long id, CitaDTO citaDTO);
    public void deleteCita(Long id);
}
