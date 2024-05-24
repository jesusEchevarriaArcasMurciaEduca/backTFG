package com.example.proyectoTFGBack2.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor//Esta anotación genera un constructor sin argumentos.
@AllArgsConstructor //Esta anotación genera un constructor con todos los argumentos
@ToString //Esta anotación genera automáticamente el método toString() para la clase
//@Builder
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String nombre;
    private String apellidos;
    private String clave;
    private String telefono;
    private String direccion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    List<Cita> citas;


}
