package org.example.factory;



import org.example.entity.AbstractVoitureBuilder;
import org.example.entity.Voiture;

public class VoitureFactory {
    public Voiture createCar(AbstractVoitureBuilder voitureBuilder){return voitureBuilder.build();}
}
