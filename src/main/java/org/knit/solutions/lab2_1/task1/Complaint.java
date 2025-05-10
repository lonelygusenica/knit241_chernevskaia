package org.knit.solutions.lab2_1.task1;


class Complaint {
    private String description;
    private int difficulty;

    public Complaint(String description, int difficulty) {
        this.description = description;
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
