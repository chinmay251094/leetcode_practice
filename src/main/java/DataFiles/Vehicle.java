package DataFiles;

public class Vehicle {
   private String name;
   private int currentVelocity;
   private int currentDirection;

   public Vehicle(String name) {
       this.name = name;
       this.currentVelocity = 0;
       this.currentDirection = 0;
   }

   public void steer(int direction) {
       currentDirection = currentDirection + direction;
       System.out.println("Vehicle.steer(). Vehicle steering at "+currentDirection+" degrees.");
   }

   public void move(int velocity, int direction) {
       currentVelocity = velocity;
       currentDirection = direction;

       System.out.println("Vehicle.move(): Moving at "+currentVelocity+" in direction "+currentDirection);
   }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
       this.currentVelocity = 0;
    }
}
