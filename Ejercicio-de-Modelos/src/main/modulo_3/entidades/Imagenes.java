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

public class Imagenes {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String url;


}
