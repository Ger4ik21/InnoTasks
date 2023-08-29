package javacore.coffeebuilder;

public class Coffee {
    private boolean isDoubleCoffee;
    private boolean hasMilk;
    private boolean hasCream;
    private boolean hasSugar;
    private boolean hasCinnamon;
    private boolean hasSyrup;

    public void setDoubleCoffee(boolean doubleCoffee) {
        this.isDoubleCoffee = doubleCoffee;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public void setHasCream(boolean hasCream) {
        this.hasCream = hasCream;
    }

    public void setHasCinnamon(boolean hasCinnamon) {
        this.hasCinnamon = hasCinnamon;
    }

    public void setHasSyrup(boolean hasSyrup) {
        this.hasSyrup = hasSyrup;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Your coffee: ");
        result.append(isDoubleCoffee ? "Double coffee" : "Coffee");
        if(hasMilk) {
            result.append(", Milk");
        }
        if(hasCream) {
            result.append(", Cream");
        }
        if(hasCinnamon) {
            result.append(", Cinnamon");
        }
        if(hasSyrup) {
            result.append(", Syrup");
        }
        return result.toString();
    }

}
