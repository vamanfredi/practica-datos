@Entity
@DiscriminatorValue("")
public class PersonaFisica extends Persona{
    private String apellido;
    private String email;
    private String nombre;
    private String telefono;
    private LocalDate fechaNacimiento;
    public String emailPreferido(){};
    public String nombre(){};
    public String numeroPreferido(){};
}