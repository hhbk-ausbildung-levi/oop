package de.levihessmann.oop;

import de.levihessmann.oop.example.Kfz;
import de.levihessmann.oop.exercise.two.Player;

public class Main {

    public static void main(String[] args) {
        player();
    }

    private static void kfz() {
        Kfz kfz = new Kfz("Audi", "Kaka", "D:RW:2143");
        kfz.drive(69);

        System.out.println("Milage: " + kfz.getMileage());
    }

    private static void player() {
        Player player = new Player("Max", "Musterfrau", "meerjung@frau.de");

        System.out.println("Giving player 20 Bonus points... (Points: " + player.getPoints() + ")");

        player.addBonusPoints(20);

        System.out.println("Player is having now " + player.getPoints() + " points and "
                + player.getBonusPoints() + " bonus points.");

        System.out.println("Giving player 200 points... (Points: " + player.getPoints() + ")");

        player.addPoints(200);

        System.out.println("Player is having now " + player.getPoints() + " points and "
                + player.getBonusPoints() + " bonus points.");

        System.out.println("Players temporary (generated) username: " + player.getUsername());

        player.setUsername("megagamerHd");

        System.out.println("New username: " + player.getUsername());
    }
}
