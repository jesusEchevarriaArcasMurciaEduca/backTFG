package com.example.proyectoTFGBack2.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private String clave;
    private String telefono;
    private String direccion;

    }


