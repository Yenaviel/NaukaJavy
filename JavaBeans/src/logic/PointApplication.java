package logic;

import data.Point;

public class PointApplication {

    public static void main (String [] args) {
        final int wybor = 3;
        Point p = new Point (5, 3);
        PointController pc = new PointController();
       /* pc.addX(p);
        System.out.println(p.getX());
        pc.minusX(p);
        System.out.println(p.getX());
        pc.addY(p);
        System.out.println(p.getY());
        pc.minusY(p);
        System.out.println(p.getY());
        */
       System.out.println("Twój punkt ma współrzędne X: " + p.getX() + ", Y: " + p.getY());
       System.out.println("Witaj, wybierz którąś z opcji: ");
       System.out.println("0. Przesunięcie punktu o 1 w lewo!");
       System.out.println("1. Przesunięcie punktu o 1 w prawo!");
       System.out.println("2. Przesunięcie punktu o 1 do góry!");
       System.out.println("3. Przesunięcie punktu o 1 w dół!");

       switch (wybor) {
           case 0:
               pc.minusX(p);
               System.out.println("Twój punkt ma współrzędne X: " + p.getX() + ", Y: " + p.getY());
               break;
           case 1:
               pc.addX(p);
               System.out.println("Twój punkt ma współrzędne X: " + p.getX() + ", Y: " + p.getY());
               break;
           case 2:
               pc.addY(p);
               System.out.println("Twój punkt ma współrzędne X: " + p.getX() + ", Y: " + p.getY());
               break;
           case 3:
               pc.minusY(p);
               System.out.println("Twój punkt ma współrzędne X: " + p.getX() + ", Y: " + p.getY());

       }
    }
}
