@Entity
@DiscriminatorValue("")
public class PersonaJuridica extends Persona{
    private List<String> emailsDeContacto;
    private LocalDate fechaConstitucion;
    private String razonSocial;
    private List<String> telefonosDeContacto;
    public String emailPreferido(){};
    public String nombre(){};
    public String numeroPreferido(){};
}