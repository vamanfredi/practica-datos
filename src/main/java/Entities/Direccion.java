package Entities;

@Entity
@Table(name = "direccion")
public class Direccion{
    private Integer altura;
    private String calle;
    private String localidadBarrio;
    private String municipioComuna;
    private String provincia;
    public String leyendaCompleta(){};

}