package org.example;

import org.example.entity.Voiture;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);


    public void notifyObserver(Voiture v1,Voiture v2);
}