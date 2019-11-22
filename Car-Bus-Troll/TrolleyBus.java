public class TrolleyBus extends Bus {

    private int elPower;

    public TrolleyBus(String model, String color, int MaxSpeed, double power, double trunkCapacity, int pointX, int pointY, int sit, int elPower) {

        super(model, color, MaxSpeed, power, trunkCapacity, pointX, pointY, sit);

        this.elPower = elPower;



    }

    public void print() {

        super.print();

        System.out.println("Тяга : " + elPower);


    }

}
