package com.example.tienda.controllers;

import com.example.tienda.models.proveedores;
import com.example.tienda.services.proveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/proveedores")

public class proveedoresController {
    @Autowired
    private proveedoresService proveedoresService;
    //leer
    @GetMapping
    public List<proveedores> getproveedores() {
        return proveedoresService.getproveedores();
    }
    //leer por id
    @GetMapping("/{proveedoresId}")
    public Optional<proveedores> getproveedoresByID(@PathVariable("proveedoresId") Long proveedoresId) {
        return proveedoresService.getproveedor(proveedoresId);
        }
        //crear o actualizar
    @PostMapping
    public void saveOrUpdate(@RequestBody proveedores proveedores) {
        proveedoresService.saveOrUpdate(proveedores);
    }
    //eliminar por id
    @DeleteMapping("/{proveedorId}")
    public void deleteproveedor (@PathVariable("proveedorId") Long proveedorId) {
        proveedoresService.deleteproveedor(proveedorId);
    }
}
