package com.example.proyectoTFGBack2.repositorios;



import com.example.proyectoTFGBack2.modelo.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}
