package ai.skillo.task3;
import java.util.Objects;
public class Car implements Comparable<Car> {

    private double speed;
    private double acceleration;
    private double tachometer;
    private int carTransmission;
    private String passengers[];
    private int qty;
    public int carNumber;

    public Car(int id, int qty) {
        this.tachometer = 0;
        this.speed = 0;
        this.acceleration = 0;
        this.carTransmission = 1;
        this.qty = qty;
        this.passengers = new String[0];
        this.carNumber = id;
    }
    public void autoMove() {
        double time = 0;
        this.startEngine();

        do {
            this.speed += this.acceleration;
            time += 0.1;

            if (this.speed >= 60 && this.carTransmission == 1) {
                this.carTransmission++;
                this.acceleration = 2;
            }
        } while (time * this.speed < 150);



        System.out.println("Max speed " + this.speed);
        System.out.println("Distance " + time * this.speed);
        this.tachometer += time * this.speed;
        this.stop();

    }

    private void stop() {
        this.speed = 0;
        this.acceleration = 0;
        this.carTransmission = 1;
        System.out.println("I am stopped");
    }

    private void startEngine() {
        this.acceleration = 20;
        System.out.println("Engine is started!");

    }

    public String addPassenger(String name) {
        if (this.passengers.length == this.qty) {
            return "Car is full";
        }

        int currentPass = this.passengers.length;
        String passengers [] = new String[currentPass + 1];
        for (int i = 0; i < currentPass; i++) {
            passengers[i] = this.passengers[i];
        }
        passengers[currentPass] = name;
        this.passengers = passengers;
        return name;
    }

    public void showPassengers() {
        if (this.passengers.length == 0) {
            System.out.println("Car is good for sleeping");
        }else {
            for (int i = 0; i < this.passengers.length; i++) {
                System.out.print(this.passengers[i] + " ");
            }
        }

    }

    @Override
    public int compareTo(Car o) {
        return this.carNumber - o.carNumber;
    }
}
