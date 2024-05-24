package com.example.proyectoTFGBack2.repositorios;



import com.example.proyectoTFGBack2.modelo.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Long> {
}

