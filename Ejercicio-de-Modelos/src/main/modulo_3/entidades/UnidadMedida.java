package org.example.modulo_3.entidades;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class UnidadMedida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denominacion;

}
