public class RegularBakeryImpl implements Bake {
    private  final Dough dough = new Dough(500, 2, 300);
    private Dough bread;
    private final String printdough = "contains: flour:" + bread.getFlour() + ", salt: "+ bread.getSalt() + ", water: " + bread.getWater();

    @Override
    public Bread makeBread() {
        Bread bread = new Bread(dough, 20, 100);
        System.out.println("Bread contains: flour:" + bread.getFlour() + ", salt: "+ bread.getSalt() + ", water: " + bread.getWater() + ", oil: " + bread.getOil() + ", gluten: " + bread.getGluten());
        return null;
    }

    @Override
    public Cookie makeCookie() {
        return null;
    }

    @Override
    public Banitsa makeBanitsa() {
        return null;
    }
}
