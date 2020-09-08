package ai.skillo.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(123123,4);
        car.autoMove();

        car.showPassengers();
        car.addPassenger("Bob");
        car.addPassenger("Elis");
        car.addPassenger("Eva");
        car.addPassenger("John");
        System.out.println( car.addPassenger("Allen"));
        car.showPassengers();

        Car listOfCars[] = {
                new Car(5676767, 4),
                new Car(1234545, 4),
                new Car(6789090, 4),
                new Car(9999999, 4),
                new Car(6666666, 4)
        };

        for (int i = 0; i < listOfCars.length; i++) {
            for (int j = i + 1; j < listOfCars.length; j++) {
                if (listOfCars[i].carNumber > listOfCars[j].carNumber) {
                    car = listOfCars[i];
                    listOfCars[i] = listOfCars[j];
                    listOfCars[j] = car;
                }
            }
        }
        Car listOfCars2[] = {
                new Car(5676767, 4),
                new Car(1234545, 4),
                new Car(6789090, 4),
                new Car(9999999, 4),
                new Car(6666666, 4)
        };

        Arrays.sort(listOfCars2);

        System.out.println("\n\nOur sort: ");
        for (Car current : listOfCars) {
            System.out.print(current.carNumber + ", ");
        }

        System.out.println("\n\nArray sort: ");
        for (Car current : listOfCars2) {
            System.out.print(current.carNumber + ", ");
        }

    }
}
