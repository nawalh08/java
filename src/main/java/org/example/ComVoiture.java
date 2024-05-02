package org.example;

import org.example.entity.Voiture;

public class ComVoiture implements Observer{
    @Override
    public void update(Voiture v1, Voiture v2){
        if(v2.getPosition()> v1.getPosition()) {
            System.out.printf("La voiture " + v2.getNom() + " dépasse la voiture " + v1.getNom() + " sa nouvelle position est " + v1.getPosition() + " \n");
            int tmp = v2.getPosition();
            v2.setPosition(v1.getPosition());
            v1.setPosition(tmp);
        }
    }

}
