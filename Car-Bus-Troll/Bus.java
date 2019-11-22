public class Bus extends Car {

protected int sit;

public Bus(String model, String color, int MaxSpeed, double power, double trunkCapacity, int pointX, int pointY, int sit) {

    super(model, color, MaxSpeed, power, trunkCapacity, pointX, pointY);
    this.sit = sit;

}

    public void print() {

        super.print();

        System.out.println("Сидений : " + sit);


    }



}
