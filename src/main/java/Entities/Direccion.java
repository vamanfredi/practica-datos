package Entities;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion{
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "altura")
    private Integer altura;

    @Column(name = "calle")
    private String calle;

    @Column(name = "localidad_barrio")
    private String localidadBarrio;

    @Column(name = "municipio_comuna")
    private String municipioComuna;

    @Column(name = "provincia")
    private String provincia;

    public String leyendaCompleta(){//TODO};
    public Direccion(){};
}