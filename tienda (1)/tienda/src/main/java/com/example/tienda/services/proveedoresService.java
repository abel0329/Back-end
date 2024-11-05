package com.example.tienda.services;

import com.example.tienda.models.proveedores;
import com.example.tienda.repositories.IUprovedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class proveedoresService {

    @Autowired
    IUprovedores IUprovedores;

    //Este cod es para crea o actualizar
    public void saveOrUpdate(proveedores proveedores) {
        IUprovedores.save(proveedores);
    }
    //leer la info
    public List<proveedores> getproveedores() {
        return IUprovedores.findAll();

    }
    //leer por id
    public Optional<proveedores> getproveedor(Long id){
        return IUprovedores.findById(id);
    }
    //eliminar por id
    public void deleteproveedor(Long id){
        IUprovedores.deleteById(id);
    }
}
