package com.example.proyectoTFGBack2.modelo;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    private String motivoCita;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "trabajador_id")
    private Trabajador trabajador;

}
