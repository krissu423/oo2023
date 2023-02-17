public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String sonaline = "Sõnaline muutuja";
/*        char taheline = 's'; //üks täht
        double komakohaga = 4231.452342; //tuleks pigem kasutada
        float komakohaga2 = 313.425232F;
        boolean kahendv22rtus = true; //0 ja 1       2   "g"  "n"
        byte pisikenumber = 432;
        short lyhikenumber = 473;
        long pikkNumber = 31312321312L;*/

        int worldWidth = 10;
        int worldHeight = 5;

        int playerXCoordinaate = getRandomCoordinaate(worldWidth); //täisarvuline number
        int playerYCoordinaate = getRandomCoordinaate(worldHeight); //castimine ehk teisendamine ühest tüübist teise
        char playerSymbol = 'X';
        int dragonXCoordinaate = getRandomCoordinaate(worldWidth);
        int dragonYCoordinaate = getRandomCoordinaate(worldHeight);
        char dragonSymbol = '0';
        int orcXCoordinaate = getRandomCoordinaate(worldWidth);
        int orcYCoordinaate = getRandomCoordinaate(worldHeight);
        char orcSymbol = '0';

        // algväärtus kuni iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y==worldHeight-1) {
                    System.out.print("-");
                } else if (x== 0 || x== worldWidth-1) {
                    System.out.print("|");
                } else {
       //               ctrl + alt + m
                    printCharacters(playerXCoordinaate, playerYCoordinaate, playerSymbol,
                            dragonXCoordinaate, dragonYCoordinaate, dragonSymbol,
                            orcXCoordinaate, orcYCoordinaate, orcSymbol, y, x);
                }
            }
        }
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * worldDimension - 2 + 1); 
    }


    //void on tagastustüüp, tüüp mis järgneb returnil
            //void tähendab, et ei tagasta midagi
    private static void printCharacters(int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                                        int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                                        int orcXCoordinaate, int orcYCoordinaate, char orcSymbol,
                                        int mapY, int mapX) { //aktiveerin + rclick->refactor>rename
        if (playerXCoordinaate == mapX && playerYCoordinaate == mapY) {
            System.out.print(playerSymbol);
        } else if (dragonXCoordinaate == mapX && dragonYCoordinaate == mapY) {
            System.out.print(dragonSymbol);
        } else if (orcXCoordinaate == mapX && orcYCoordinaate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}