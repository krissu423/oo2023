import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private List<Integer> xCoordinates;
    private List<Integer> yCoordinates;

    public Triangle() {
        xCoordinates = new ArrayList<>();
        yCoordinates = new ArrayList<>();
    }

    public void addCoordinate(int x, int y) {
        xCoordinates.add(x);
        yCoordinates.add(y);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int numPoints = xCoordinates.size();

        for (int i = 0; i < numPoints; i++) {
            int currentX = xCoordinates.get(i);
            int currentY = yCoordinates.get(i);

            int nextX = xCoordinates.get((i + 1) % numPoints);
            int nextY = yCoordinates.get((i + 1) % numPoints);

            double sideLength = Math.sqrt(Math.pow(nextX - currentX, 2) + Math.pow(nextY - currentY, 2));
            perimeter += sideLength;
        }

        return perimeter;
    }

    public void printCoordinates() {
        System.out.println("Triangle coordinates:");
        int numPoints = xCoordinates.size();

        for (int i = 0; i < numPoints; i++) {
            System.out.println("(" + xCoordinates.get(i) + ", " + yCoordinates.get(i) + ")");
        }
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        // Lisame koordinaadid esimesele kolmnurgale
        triangle1.addCoordinate(0, 0);
        triangle1.addCoordinate(3, 0);
        triangle1.addCoordinate(0, 4);

        // Lisame koordinaadid teisele kolmnurgale
        triangle2.addCoordinate(1, 1);
        triangle2.addCoordinate(4, 1);
        triangle2.addCoordinate(1, 5);

        // Trükime koordinaadid välja
        triangle1.printCoordinates();
        triangle2.printCoordinates();

        // Arvutame ja trükime välja ümbermõõdu
        System.out.println("Triangle 1 perimeter: " + triangle1.calculatePerimeter());
        System.out.println("Triangle 2 perimeter: " + triangle2.calculatePerimeter());
    }
}
