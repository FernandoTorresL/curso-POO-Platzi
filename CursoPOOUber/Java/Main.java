class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");

    Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
    car.passenger = 4;

    //System.out.println("Car License: " + car.license);
    car.printDataCar();

    Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
    car2.passenger = 3;

    //System.out.println("Car License: " + car2.license);
    car2.printDataCar();
  }

}
