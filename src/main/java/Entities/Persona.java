package Entities;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Persona implements Contactable{
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "cuitCuil")
    private String cuitCuil;

    @ManyToOne
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

    @Convert(converter = MedioDeComunicacionConverter.class)
    @Column(name = "medio_preferido")
    private MedioDeComunicacion medioPreferido;

    public String nombre(){ //TODO
    }
    public Persona(){};
}
