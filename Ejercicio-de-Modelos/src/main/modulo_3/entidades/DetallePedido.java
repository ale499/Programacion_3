package org.example.modulo_3.entidades;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer cantidad;
    private double subTotal;

    @ToString.Exclude
    private Articulo articulo;


}
