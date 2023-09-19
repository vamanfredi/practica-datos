package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion{
    @Id@GeneratedValue
    Long id;
    private Integer altura;
    private String calle;
    private String localidadBarrio;
    private String municipioComuna;
    private String provincia;
    public String leyendaCompleta(){//TODO};

}