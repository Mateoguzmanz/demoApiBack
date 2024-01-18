package com.example.demoApi.repository;

import com.example.demoApi.entity.DatosCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosClienteRepository extends JpaRepository<DatosCliente, Long> {
}
