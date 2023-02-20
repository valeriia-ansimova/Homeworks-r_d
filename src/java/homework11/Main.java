package homework11;

public class Main {
    public static void main(String[] args) {

        Automobile audi = new Car();
        String carType = audi.getCarType();
        System.out.println(carType);

        Automobile volvo = new Truck();
        String carType1 = volvo.getCarType();
        System.out.println(carType1);
    }

}

