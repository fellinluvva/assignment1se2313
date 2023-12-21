import Models.Point;
import Models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplications {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Friday\\IdeaProjects\\se-2313\\src\\Source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        Point firstPoint = null;
        Point previousPoint = null;

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.getLongest());
        System.out.println("Average Side: " + shape.getAverageSide());

        System.out.println("Is it correct?");
    }
}