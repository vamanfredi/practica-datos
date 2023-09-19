package Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("")
public class PersonaFisica extends Persona{
    private String apellido;
    private String email;
    private String nombre;
    private String telefono;
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
}