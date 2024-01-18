package com.example.demoApi.controller;

import com.example.demoApi.entity.DatosCliente;
import com.example.demoApi.services.DatosClienteServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datosCliente")
@Tag(name = "Datos Cliente Controller", description = "Operaciones relacionadas con el formulario")
public class DatosClienteController {
    private final DatosClienteServices datosClienteServices;

    public DatosClienteController(DatosClienteServices datosClienteServices) {
        this.datosClienteServices = datosClienteServices;
    }

    //MOSTRAR
    @GetMapping()
    public ResponseEntity<List<DatosCliente>> getAllDatosCliente() {
        List<DatosCliente> datosClientes = datosClienteServices.findAll();
        return new ResponseEntity<>(datosClientes, HttpStatus.OK);
    }

    //LEER
    @GetMapping("/{id}")
    public DatosCliente leer(@PathVariable Long id){
        return datosClienteServices.Leer(id);
    }

    //CREAR
    @PostMapping
    public DatosCliente crear(@RequestBody DatosCliente datosCliente){
        return datosClienteServices.Crear(datosCliente);
    }

    //ACTUALIZAR
    @PutMapping
    public DatosCliente actualizar(@RequestBody DatosCliente datosCliente){
        return datosClienteServices.Actualizar(datosCliente);
    }

    //BORRAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long numeroDocuemnto){
        datosClienteServices.Borrar(numeroDocuemnto);
    }
}
