public class Dough {
    private int flour;
    private int salt;
    private int water;

    public Dough(int flour, int salt, int water) {
        this.flour = flour;
        this.salt = salt;
        this.water = water;
    }

    public int getFlour() {
        return flour;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
