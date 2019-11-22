import java.awt.*;
import java.util.Scanner;

public class Car {

    protected String model;
    protected String color;
    protected int MaxSpeed;
    protected double power;
    protected double trunkCapacity;
    protected int pointX;
    protected int pointY;

    Color red  = new Color(255, 0, 0);

    public Car(String model, String color, int MaxSpeed, double power, double trunkCapacity, int pointX, int pointY) {

        this.model = model;
        this.color = color;
        this.MaxSpeed = MaxSpeed;
        this.power = power;
        this.trunkCapacity = trunkCapacity;
        this.pointX = pointX;
        this.pointY = pointY;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public double getPower() {
        return power;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }
    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void move() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" -Enter vehicle point at X");

        pointX = sc.nextInt();

        System.out.println(" -Enter vehicle point at Y");

        pointY = sc.nextInt();

    }

    public void print() {

        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Max Velocity : " + MaxSpeed);
        System.out.println("HP : " + power);
        System.out.println("TrunkCapacity : " + trunkCapacity);
        System.out.println("Point : " + pointX + " | " + pointY);

    }

    public static void main (String [] args) {

        Car vaz = new Car("Ваз 2107", "Red", 210, 105.5, 200, 4, 3);

         System.out.println(vaz.getModel());

         System.out.println(vaz.getColor());

         System.out.println(vaz.getMaxSpeed());

         System.out.println(vaz.getPower());

         System.out.println(vaz.getTrunkCapacity());

         System.out.println(vaz.getPointX());

         System.out.println(vaz.getPointY());

        vaz.setColor("Yellow");

        vaz.move();

        vaz.print();

        System.out.println("----------");

        Bus zil = new Bus("Пазик", "white / Blue", 150, 150.5, 1000, 2, 90, 50);

        zil.move();

        zil.print();

        System.out.println("----------");

        TrolleyBus troll = new TrolleyBus("ЭлектроПазик", "Green", 136, 100, 1000, 56, 67 , 60, 85);

        troll.move();

        troll.print();
    }
}
