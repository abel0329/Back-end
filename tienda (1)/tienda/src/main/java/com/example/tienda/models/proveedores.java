package com.example.tienda.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "proveedores")
public class proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_proveedor")
    private Long id_proveedor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "telefono")
    private String telefono;

}
