public abstract class Vehicle {
    public double maxSpeed;
    protected double currentSpeed;

    Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public void pedalToTheMetal(){
        while (currentSpeed < maxSpeed) {
            accelerate();
            System.out.println("Current speed: " + currentSpeed);
        }
        System.out.println("Reached max speed: " + maxSpeed);
    }
}