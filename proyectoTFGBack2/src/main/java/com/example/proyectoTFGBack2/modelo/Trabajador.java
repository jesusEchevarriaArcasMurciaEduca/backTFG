package com.example.proyectoTFGBack2.modelo;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "trabajador")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String clave;
    private String especialidad;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL)
            List<Cita> citas;
}
