package org.example.modulo_3.entidades;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class Cliente {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    @ToString.Exclude
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();


}
