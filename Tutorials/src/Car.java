public class Car extends Vehicle{
    public Car(double maxSpeed){
        super(maxSpeed);
    }
    @Override
    public void accelerate(){
        currentSpeed += 10.0;
        if (currentSpeed > maxSpeed){
            currentSpeed = maxSpeed;
        }
    }
    public static void main(String[] args) {
        Car volvo = new Car(69.42);
        System.out.println("Max speed: " + volvo.getMaxSpeed());
        System.out.println("Current speed: " + volvo.getCurrentSpeed());
        volvo.pedalToTheMetal();
    }
}