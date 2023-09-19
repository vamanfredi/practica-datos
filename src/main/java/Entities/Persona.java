package Entities;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="",discriminatorType= DiscriminatorType.STRING)
public abstract class Persona implements Contactable{
    private String cuitCuil;
    private Direccion direccion;
    private MedioDeComunicacion medioPreferido;
    public String nombre(){ //TODO
    } 
}