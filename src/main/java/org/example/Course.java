package org.example;
import org.example.entity.Voiture;

import java.util.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Course implements Subject{


    private List<Observer> observers;


    @Override
    public void registerObserver(Observer observer){observers.add(observer);}

    @Override
    public void removeObserver(Observer observer){observers.remove(observer);}

    @Override
    public void notifyObserver(Voiture v1,Voiture v2){observers.forEach(observer -> observer.update(v1,v2));}
}
