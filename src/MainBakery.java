public class MainBakery {


    public static void main(String args[]){
        Bake regularBakery = new RegularBakeryImpl();

        regularBakery.makeBanitsa();
        System.out.println("------------------------");
//        Bake garlicBakery = new GarlicBakeryImpl();
    }
}
