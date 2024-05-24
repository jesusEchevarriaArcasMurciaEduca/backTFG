package com.example.proyectoTFGBack2.DTO;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TrabajadorDTO{


    private Long id;
    private String nombre;
    private String apellidos;
    private String clave;
    private String especialidad;

}
