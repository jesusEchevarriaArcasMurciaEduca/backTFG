package com.example.proyectoTFGBack2.mapper;

import com.example.proyectoTFGBack2.DTO.CitaDTO;
import com.example.proyectoTFGBack2.modelo.Cita;
import com.example.proyectoTFGBack2.modelo.Cliente;
import com.example.proyectoTFGBack2.modelo.Trabajador;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-03T14:00:21+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class CitaMapperImpl implements CitaMapper {

    @Override
    public Cita citaDTOToCita(CitaDTO citaDTO) {
        if ( citaDTO == null ) {
            return null;
        }

        Cita.CitaBuilder cita = Cita.builder();

        cita.cliente( citaDTOToCliente( citaDTO ) );
        cita.trabajador( citaDTOToTrabajador( citaDTO ) );
        cita.id( citaDTO.getId() );
        cita.fechaHora( citaDTO.getFechaHora() );
        cita.motivoCita( citaDTO.getMotivoCita() );

        return cita.build();
    }

    @Override
    public CitaDTO citaToCitaDTO(Cita cita) {
        if ( cita == null ) {
            return null;
        }

        CitaDTO citaDTO = new CitaDTO();

        citaDTO.setClienteId( citaClienteId( cita ) );
        citaDTO.setTrabajadorId( citaTrabajadorId( cita ) );
        citaDTO.setId( cita.getId() );
        citaDTO.setFechaHora( cita.getFechaHora() );
        citaDTO.setMotivoCita( cita.getMotivoCita() );

        return citaDTO;
    }

    protected Cliente citaDTOToCliente(CitaDTO citaDTO) {
        if ( citaDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( citaDTO.getClienteId() );

        return cliente;
    }

    protected Trabajador citaDTOToTrabajador(CitaDTO citaDTO) {
        if ( citaDTO == null ) {
            return null;
        }

        Trabajador trabajador = new Trabajador();

        trabajador.setId( citaDTO.getTrabajadorId() );

        return trabajador;
    }

    private Long citaClienteId(Cita cita) {
        if ( cita == null ) {
            return null;
        }
        Cliente cliente = cita.getCliente();
        if ( cliente == null ) {
            return null;
        }
        Long id = cliente.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long citaTrabajadorId(Cita cita) {
        if ( cita == null ) {
            return null;
        }
        Trabajador trabajador = cita.getTrabajador();
        if ( trabajador == null ) {
            return null;
        }
        Long id = trabajador.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
