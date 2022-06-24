package carpetwashing;

public class CarpetWashing {

    public static void main(String[] args) {

        Product rug = ProductFactory.getProduct("Rug", 12, 12, "yıkama", "abc marka", 12344, 1, 1);
        System.out.println(" kilim yıkanan ürünün özellikleri ");
        System.out.println(rug);
        Product Carpt = ProductFactory.getProduct("Carpet", 13, 13, "kurutma", "xyz marka", 12345, 2, 3);
        System.out.println("halı yıkanan ürünün özellikleri ");
        System.out.println(Carpt);

        Wash wash = new Wash();
        Drying drying = new Drying();

        process pro1 = new RugPro(1, "rug 1", wash, drying);
        process pro2 = new CarpetPro(2, "Carpet 1", wash, drying);

        pro1.allProcess();
        pro2.allProcess();

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        Celebrity carpet = new Celebrity("Carpet");

        follow c1 = new follow("ali");
        follow c2 = new follow("ata");
        follow c3 = new follow("hüsniye ");

        carpet.register(c1);
        System.out.println("-----------------------------------------------------");
        carpet.register(c2);
        System.out.println("-----------------------------------------------------");
        carpet.register(c3);
        carpet.notifyAllObservers(new Message("halı işlemi devam ediyor"));
        System.out.println("-----------------------------------------------------");
        carpet.notifyAllObservers(new Message("halı işlemi bitti"));
        System.out.println("-----------------------------------------------------");
    }
}
