package org.example.modulo_3.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder

public class Articulo {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Integer tiempoEstimadoMinutos;

    private UnidadMedida unidadMedida;


    @ToString.Exclude
    private Imagenes imagenes;

}
