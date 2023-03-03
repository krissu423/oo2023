public class World {
    int width;
    int height;

    public World(int width, int height) {
       this.width = width;
       this.height = height;
    }

    public void printMap(int worldWidth, int worldHeight, int playerXCoordinaate, int playerYCoordinaate, char playerSymbol, int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol, int orcXCoordinaate, int orcYCoordinaate, char orcSymbol) {
        // algväärtus kuni iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y== worldHeight -1) {
                    System.out.print("-");
                } else if (x== 0 || x== worldWidth -1) {
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

//    private static int getRandomCoordinaate(int worldDimension) {
//        return (int) (Math.random() * worldDimension - 2 + 1);
//    }


    //void on tagastustüüp, tüüp mis järgneb returnil
    //void tähendab, et ei tagasta midagi
    private void printCharacters(int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
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
