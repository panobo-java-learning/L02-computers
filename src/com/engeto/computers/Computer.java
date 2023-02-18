package com.engeto.computers;

public class Computer {
    private String model;
    private double weight;
    private double displayDiagonal;
    private boolean isCompanyComputer;
    private boolean isNotebook;

    public Computer(String model, double weight, double displayDiagonal, boolean isCompanyComputer, boolean isNotebook) {
        this.model = model;
        this.weight = weight;
        this.displayDiagonal = displayDiagonal;
        this.isCompanyComputer = isCompanyComputer;
        this.isNotebook = isNotebook;
    }

    public Computer(double weight, double displayDiagonal) {
        this("MotoDesk", weight, displayDiagonal, true, false);
    }

    public Computer() {
        this("MotoBag", 2.4, 16.1, false, true);
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }
}
