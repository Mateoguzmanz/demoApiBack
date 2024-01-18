package com.example.demoApi.services;

import com.example.demoApi.entity.DatosCliente;
import com.example.demoApi.repository.DatosClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosClienteServices  {
    private final DatosClienteRepository datosClienteRepository;

    public DatosClienteServices(DatosClienteRepository datosClienteRepository){
        this.datosClienteRepository = datosClienteRepository;
    }

    //ENCONTRAR_TODO
    public List<DatosCliente> findAll(){
        return datosClienteRepository.findAll();
    }

    //CREAR
    public DatosCliente Crear(DatosCliente datosCliente){
        return datosClienteRepository.save(datosCliente);
    }

    //LEER
    public DatosCliente Leer(Long numeroDocumento){
        return datosClienteRepository.findById(numeroDocumento).
                orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
    }

    //ACTUALIZAR
    public DatosCliente Actualizar(DatosCliente datosCliente){
        return datosClienteRepository.save(datosCliente);
    }

    //BORRAR
    public void Borrar(Long numeroDocumento){
        datosClienteRepository.deleteById(numeroDocumento);
    }
}
