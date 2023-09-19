package Entities.converters;

import Entities.Email;
import Entities.MedioDeComunicacion;
import Entities.Telegram;
import Entities.Whatsapp;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MedioDeComunicacionConverter implements AttributeConverter<MedioDeComunicacion, Integer> {
    @Override
    public Integer convertToDatabaseColumn(MedioDeComunicacion medio){
        String nombre = medio.getClass().getName();
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
    public MedioDeComunicacion convertToEntityAttribute(Integer num) {
        MedioDeComunicacion medio = null;
        if(num==0){medio= new Whatsapp();}
        if(num==1){medio= new Telegram();}
        if(num==2){medio= new Email();}
        return medio;
    } //recuperando, desde la base hacia java
}