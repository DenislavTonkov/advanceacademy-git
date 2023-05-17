public class Banitsa extends Dough{
    private  int eggs;
    private int cheese;

    public Banitsa(Dough dough, int eggs, int cheese) {
        super(dough.getFlour(), dough.getSalt(), dough.getWater());
        this.eggs = eggs;
        this.cheese = cheese;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }
}
