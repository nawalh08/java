package org.example;

import org.example.entity.Voiture;
import org.example.factory.VoitureFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Singleton.getInstance();
        ComVoiture com = new ComVoiture();

        Course course = Course.builder().observers(new ArrayList<>()).build();
        course.registerObserver(com);
        Scanner scanner = new Scanner(System.in);
        VoitureFactory voitureFactory = new VoitureFactory();
        List<Voiture> depart = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            String nom;
            System.out.println("Veuillez indiquez le nom de la voiture " + i);
            nom = scanner.nextLine();
            String couleur;
            System.out.println("Veuillez indiquez la couleur de la voiture " + i);
            couleur = scanner.nextLine();
            depart.add(voitureFactory.createCar(new Voiture.VoitureBuilder().nom(nom).couleur(couleur).position(i)));

        }
        int tour = 1;
        while (tour<10){
            System.out.println("Nous sommes actuellemnt au tour n°" + tour);
            int pr,tw;
            for (int i = 0; i < 4; i++) {
                pr = random.nextInt(5);
                tw = random.nextInt(5);
                if(pr != tw){
                    course.notifyObserver(depart.get(pr), depart.get(tw) );
                }
            }
            for( Voiture v : depart){
                System.out.println(v.toString());
            }
            tour++;
        }
        for( Voiture v : depart){
            if(v.getPosition() == 1){
                System.out.println("La voiture qui à gagné est la voiture " + v.toString());
            }
        }


    }
}