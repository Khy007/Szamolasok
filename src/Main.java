import java.util.Random;

public class Main {


    public static void main(String[] args) {
       Random veletlenszeruEredmeny = new Random();   //meghívok egy példányt a Random osztályból
       Bringa fekSebessegOsszefugges = new Bringa(veletlenszeruEredmeny.nextBoolean(), 50); //random true vagy false keletkezik és be kell állítani a sebességet

    }
}