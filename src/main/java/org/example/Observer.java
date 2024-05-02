package org.example;

import org.example.entity.Voiture;

public interface Observer {
    void update(Voiture v1,Voiture v2);
}
