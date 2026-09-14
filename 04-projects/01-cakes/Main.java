public class Main {
    public static void main(String[] args) {
        // First log
        System.out.println("Java Cakes Project!");

        // Cake
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println(
            String.format("New cake with flavor '%s' and price '%s'!",
                cake.getFlavor(), cake.getPrice()
            )
        );

        // Birthday Cake
        BirthdayCake bdcake = new BirthdayCake();
        bdcake.setPrice(39.99);
        bdcake.setCandles(5);
        System.out.println(
            String.format("New birthday cake with flavor '%s' and price %s and %s candles!",
                bdcake.getFlavor(), bdcake.getPrice(), bdcake.getCandles()
            )
        );

        // Wedding Cake
        WeddingCake wdcake = new WeddingCake();
        wdcake.setPrice(99.99);
        wdcake.setTiers(7);
        System.out.println(
            String.format("New birthday cake with flavor '%s' and price '%s' and %s tiers!",
                wdcake.getFlavor(), wdcake.getPrice(), wdcake.getTiers()
            )
        );
    }
}

// It inherits from the Cake class.
class BirthdayCake extends Cake {
    private double candles;
    
    public BirthdayCake(){
        // The default flavor of a birthday cake is chocolate.
        this.setFlavor("chocolate");
    }

    public double getCandles() {
        return candles;
    }

    public void setCandles(double candles) {
        this.candles = candles;
    }
}

// It inherits from the Cake class.
class WeddingCake extends Cake {
    private double tiers;

    public WeddingCake(){
        // The default flavor of a birthday cake is almond.
        this.setFlavor("almond");
    }

    public double getTiers() {
        return tiers;
    }

    public void setTiers(double tiers) {
        this.tiers = tiers;
    }
}

class Cake {
    private String flavor;
    private double price;

    public Cake(){
        this("vanilla");
    }

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}