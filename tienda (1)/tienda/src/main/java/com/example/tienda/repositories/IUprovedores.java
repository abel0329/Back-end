package com.example.tienda.repositories;

import com.example.tienda.models.proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUprovedores extends JpaRepository<proveedores, Long> {
}
