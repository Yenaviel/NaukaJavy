package logic;

import data.Car;

public class CarShop {
    public static void main(String [] args) {
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelesColor = "Srebrny";
        audi.tiresColor = "Czarny";

        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelesColor
                + ", Kolor opon: " + audi.tiresColor;

        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);
    }
}