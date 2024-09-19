package org.example.modulo_3.entidades;

import lombok.*;
import org.example.modulo_3.enums.Estado;
import org.example.modulo_3.enums.FormaPago;
import org.example.modulo_3.enums.TipoEnvio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder


public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private LocalDate FechaPedido;

    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;


    private Set<DetallePedido>detallesPedidos = new HashSet<>();


    public void AgregarDetallePedido(DetallePedido detallePedido){

        this.detallesPedidos.add(detallePedido);

    }
    public void BorrarDetallesPedido(DetallePedido detallePedido){

        this.detallesPedidos.remove(detallePedido);

    }

    public void calcularTotal(){
        Double TotaldetallePedido = 0D;
        Double TotalCdetallePedido = 0D;
        for (DetallePedido pedidos : detallesPedidos){
            TotaldetallePedido += pedidos.getSubTotal()*pedidos.getCantidad();
            TotalCdetallePedido += pedidos.getArticulo().getPrecioCompra()*pedidos.getCantidad();
        }
        this.total = TotaldetallePedido;
        this.totalCosto = TotalCdetallePedido;
    }


}
