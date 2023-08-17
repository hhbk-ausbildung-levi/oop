package de.levihessmann.oop.exercise.two;

import java.util.UUID;

public class Player {
    private final String name;
    private final String surname;
    private final String email;

    private String username;

    private long points = 0;
    private long bonusPoints = 0;

    public Player(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = "Player" + UUID.randomUUID();
    }

    public long getPoints() {
        return points;
    }

    public long getBonusPoints() {
        return bonusPoints;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void addPoints(long points) {
        this.points += points;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public long addBonusPoints(long points) {
        long newPoints = this.bonusPoints += points;

        if (newPoints >= 20) {
            this.addPoints(100);
            this.bonusPoints = 0;
        }

        return newPoints;
    }
}
