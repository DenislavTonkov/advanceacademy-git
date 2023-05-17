public class Cookie extends Dough {
    private int sugar;

    public Cookie(Dough dough, int sugar) {
        super(dough.getFlour(), dough.getSalt(), dough.getWater());
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
