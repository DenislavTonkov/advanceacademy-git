public class Bread extends Dough {
    private int oil;
    private int gluten;


    public Bread(Dough dough, int oil, int gluten) {
        super(dough.getFlour(), dough.getSalt(), dough.getWater());
        this.oil = oil;
        this.gluten = gluten;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getGluten() {
        return gluten;
    }

    public void setGluten(int gluten) {
        this.gluten = gluten;
    }
}
