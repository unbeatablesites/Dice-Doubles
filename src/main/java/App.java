import java.util.Random;

public class App {

    public static void main(String[] args) {

        logic();
    }


    static  void logic(){

        System.out.println("HERE COMES THE DICE!");

        Random rand = new Random();

        int randomRoll1 = 1 + rand.nextInt(6);
        int randomRoll2 = 1 + rand.nextInt(6);

        System.out.println("Roll #1:" +randomRoll1);
        System.out.println(randomRoll2);


    }



}