package Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("juridica")
public class PersonaJuridica extends Persona{
    @ElementCollection
    @CollectionTable(name = "email_de_contacto", joinColumns =  @JoinColumn(name = "persona_id"))
    @Column (name = "email")
    private List<String> emailsDeContacto;

    @Column(name = "fecha_constitucion", columnDefinition = "DATE")
    private LocalDate fechaConstitucion;

    @Column(name = "razon_social")
    private String razonSocial;

    @ElementCollection
    @CollectionTable(name = "telefono_de_contacto", joinColumns =  @JoinColumn(name = "persona_id"))
    @Column (name = "telefono")
    private List<String> telefonosDeContacto;

    public String emailPreferido(){};
    public String nombre(){};
    public String numeroPreferido(){};
    public PersonaJuridica(){

    }
}