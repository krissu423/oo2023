import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Random rand = new Random(); //uus instants
//        Math.random(); //static


        System.out.println("Hello world!");
        String sonaline = "Sõnaline muutuja";
/*        char taheline = 's'; //üks täht
        double komakohaga = 4231.452342; //tuleks pigem kasutada
        float komakohaga2 = 313.425232F;
        boolean kahendv22rtus = true; //0 ja 1       2   "g"  "n"
        byte pisikenumber = 432;
        short lyhikenumber = 473;
        long pikkNumber = 31312321312L;*/
        Scanner scanner = new Scanner(System.in);

        World world = new World(10, 5);

        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height,
                player.xCoordinaate, player.yCoordinaate, player.symbol,
                dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
        String input = scanner.nextLine();
        // for (; !input.equals("end"); )
        while (!input.equals("end")){
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }

}