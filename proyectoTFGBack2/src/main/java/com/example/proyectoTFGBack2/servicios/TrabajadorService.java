package com.example.proyectoTFGBack2.servicios;

import com.example.proyectoTFGBack2.DTO.TrabajadorDTO;

import com.example.proyectoTFGBack2.InterfazServicio.TrabajadorInterface;
import com.example.proyectoTFGBack2.mapper.TrabajadorMapper;
import com.example.proyectoTFGBack2.modelo.Trabajador;
import com.example.proyectoTFGBack2.repositorios.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrabajadorService implements TrabajadorInterface {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    @Autowired
    private TrabajadorMapper trabajadorMapper;

    public List<TrabajadorDTO> getAllTrabajadores() {
        List<Trabajador> trabajadores = trabajadorRepository.findAll();
        return trabajadores.stream()
                .map(trabajadorMapper::TrabajadorToTrabajadorDTO)
                .collect(Collectors.toList());
    }

    public TrabajadorDTO getTrabajadorById(Long id) {
        Trabajador trabajador = trabajadorRepository.findById(id).orElse(null);
        return trabajador != null ? trabajadorMapper.TrabajadorToTrabajadorDTO(trabajador) : null;
    }

    public TrabajadorDTO saveTrabajador(TrabajadorDTO trabajadorDTO) {
        Trabajador trabajador = trabajadorMapper.TrabajadorDTOToTrabajador(trabajadorDTO);
        return trabajadorMapper.TrabajadorToTrabajadorDTO(trabajadorRepository.save(trabajador));
    }

    public TrabajadorDTO updateTrabajador(Long id, TrabajadorDTO trabajadorDTO) {
        Trabajador existingTrabajador = trabajadorRepository.findById(id).orElse(null);
        if (existingTrabajador != null) {
            existingTrabajador.setNombre(trabajadorDTO.getNombre());
            existingTrabajador.setApellidos(trabajadorDTO.getApellidos());
            existingTrabajador.setClave(trabajadorDTO.getClave());
            existingTrabajador.setEspecialidad(trabajadorDTO.getEspecialidad());
            return trabajadorMapper.TrabajadorToTrabajadorDTO(trabajadorRepository.save(existingTrabajador));
        }
        return null;
    }

    public void deleteTrabajador(Long id) {
        if (trabajadorRepository.existsById(id)) {
            trabajadorRepository.deleteById(id);
        }
    }
}
