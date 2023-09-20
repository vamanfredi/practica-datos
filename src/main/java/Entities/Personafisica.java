package Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("fisica")
public class PersonaFisica extends Persona{
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;

    public String emailPreferido(){//TODO
        return null;
    };
    public String nombre(){//TODO
        return null;
    };
    public String numeroPreferido(){//TODO
        return null;
    };
    public PersonaFisica(){

    }
}