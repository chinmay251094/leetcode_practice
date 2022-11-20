package DataFiles;

class MyCar {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public MyCar(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        if(this.engine == false) {
            return "No engine";
        } else {
            return "Engine started.";
        }
    }

    public String accelerate() {
        return "Can't accelerate";
    }

    public String stop() {
        return "Can't stop";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Pulsar extends MyCar {
    public Pulsar() {
        super("Pulsar 150", 1);
    }

    @Override
    public String startEngine() {
        return "Engine started";
    }

    @Override
    public String accelerate() {
        return "Accelerated";
    }

    @Override
    public String stop() {
        return "Stopped";
    }
}

class Yamaha extends MyCar {
    public Yamaha() {
        super("Yamaha YZF-R1", 3);
    }

    @Override
    public String startEngine() {
        return "Engine started";
    }

    @Override
    public String accelerate() {
        return "Accelerated";
    }

    @Override
    public String stop() {
        return "Stopped";
    }
}

class Wespa extends MyCar {
    public Wespa() {
        super("Wespa", 0);
    }
}

public class Cars {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            MyCar myCar = randomSelection();
            System.out.println("Car #"+i+": "+myCar.getName()+myCar.startEngine());
        }
    }

    public static MyCar randomSelection() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        switch (randomNumber) {
            case 1:
                return new Pulsar();
            case 2:
                return new Yamaha();
            case 3:
                return new Wespa();
        }
        return null;
    }
}