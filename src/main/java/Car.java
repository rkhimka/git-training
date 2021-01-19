public class Car {
    private int maxSpeed;
    private String carName;
    private String color;

    public Car(int maxSpeed, String carName, String color) {
        this.maxSpeed = maxSpeed;
        this.carName = carName;
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public String getColor() {
        return color;
    }
}
