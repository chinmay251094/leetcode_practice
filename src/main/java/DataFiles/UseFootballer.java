package DataFiles;

class Footballer {
    private String name;

    public Footballer(String name) {
        this.name = name;
    }

    public String playingPosition() {
        return "Not a player.";
    }

    public String getName() {
        return name;
    }
}

class Ronaldo extends Footballer {
    public Ronaldo() {
        super("Ronaldo");
    }

    @Override
    public String playingPosition() {
        return "Center Forward";
    }
}

class Messi extends Footballer {
    public Messi() {
        super("Messi");
    }

    @Override
    public String playingPosition() {
        return "Right Winger";
    }
}

class Salah extends Footballer {
    public Salah() {
        super("Mo Salah");
    }

    @Override
    public String playingPosition() {
        return "Forward";
    }
}

class Ramos extends Footballer {
    public Ramos() {
        super("Ramos");
    }

    @Override
    public String playingPosition() {
        return "Center Back";
    }
}

class Klopp extends Footballer {
    public Klopp() {
        super("Klopp");
    }
}

public class UseFootballer {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Footballer useFootballer = randomFootballer();
            System.out.println("Footballer #"+i+": "+ useFootballer.getName()+ " Position: "+useFootballer.playingPosition());
        }
    }

    public static Footballer randomFootballer() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated is " +randomNumber);

        switch (randomNumber) {
            case 1:
                return new Ronaldo();

            case 2:
                return new Messi();

            case 3:
                return new Salah();

            case 4:
                return new Ramos();

            case 5:
                return new Klopp();
        }
        return null;
    }
}