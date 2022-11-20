package BurgerProject;

public class HamBurger {
    private String name;
    private String breadRollType;
    private String meat;
    private double burgerPrice;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;

    public HamBurger(String name, String breadRollType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.cheese = cheese;
        this.burgerPrice = 15.75;
    }

    public double addLettuce() {
        if(lettuce == true) {
            burgerPrice = burgerPrice + 2.25;
        }
        return burgerPrice;
    }

    public double addTomato() {
        if(lettuce == true) {
            burgerPrice = burgerPrice + 4.25;
        }
        return burgerPrice;
    }

    public double addCarrot() {
        if(lettuce == true) {
            burgerPrice = burgerPrice + 3.75;
        }
        return burgerPrice;
    }

    public double addCheese() {
        if(lettuce == true) {
            burgerPrice = burgerPrice + 7.50;
        }
        return burgerPrice;
    }
}
