public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike();

        Frame frame1 = new Frame();
        frame1.shape = "round";
        frame1.color = "white";
        bike1.frame = frame1;

        Wheel wheel1 = new Wheel();
        wheel1.diameter = 65;
        wheel1.number = 2;
        bike1.wheel = wheel1;

    }
}
