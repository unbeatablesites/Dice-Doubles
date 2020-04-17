import java.util.Random;

public class App {

    public static void main(String[] args) {

        logic();
    }


    static  void logic(){

        System.out.println("HERE COMES THE DICE!\n");

        Random rand = new Random();

        int randomRoll1 = 1 + rand.nextInt(6);
        int randomRoll2 = 1 + rand.nextInt(6);
        int count = 1;


        System.out.println("Roll #1: " + randomRoll1 );
        System.out.println("Roll #2: " + randomRoll2 );

        System.out.println("The total is "+ (randomRoll1 + randomRoll2)+"!\n");

        while(randomRoll1 != randomRoll2){
            count ++;
             randomRoll1 = 1 + rand.nextInt(6);
             randomRoll2 = 1 + rand.nextInt(6);

            System.out.println("Roll #1: " + randomRoll1 );
            System.out.println("Roll #2: " + randomRoll2 );
            System.out.println("The total is "+ (randomRoll1 + randomRoll2)+"!\n");
        }
        System.out.println("It took "+count+" rolls to get doubles\n");
    }

}
