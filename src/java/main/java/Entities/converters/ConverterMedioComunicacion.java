@Converter(autoApply = true)
public class MedioDeComunicacionConverter implements AttributeConverter<MedioDeComunicaciones, Integer> {
    @Override
    public Integer convertToDatabaseColumn(MedioDeComunicaciones medio){
        String medio = contactable.getClass().getName();
        switch(nombre){
            case "Whatsapp":
                return 0;
            case "Telegram":
                return 1;
            case "Email":
                return 2;
            default:
                return -1;
        }
    } //persistir, desde java a la base
    @Override
    public MedioDeComunicaciones convertToEntityAttribute(Integer num) {
        MedioDeComunicaciones medio = null;
        if(num==0){medio= new Whatsapp();}
        if(num==1){medio= new Telegram();}
        if(num==2){medio= new Email();}
        return medio;
    } //recuperando, desde la base hacia java
}