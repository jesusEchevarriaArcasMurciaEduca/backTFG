package com.example.proyectoTFGBack2.DTO;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CitaDTO {

    private Long id;
    private Date fechaHora;
    private String motivoCita;
    private Long clienteId;
    private Long trabajadorId;
}


