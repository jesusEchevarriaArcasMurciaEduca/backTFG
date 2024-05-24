package com.example.proyectoTFGBack2.repositorios;



import com.example.proyectoTFGBack2.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
