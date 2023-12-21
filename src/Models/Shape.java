package Models;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter() {
        double totalPerimeter = 0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            totalPerimeter += points.get(i).distance(points.get((i + 1) % numPoints));
        }

        return totalPerimeter;
    }
    public double getLongest() {
        double maxDist = 0;

        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).distance(points.get(j));
                if (distance > maxDist) {
                    maxDist = distance;
                }
            }
        }

        return maxDist;
    }public double getAverageSide() {
        double totalDist = 0;
        int numSides = points.size();

        for (int i = 0; i < numSides; i++) {
            totalDist += points.get(i).distance(points.get((i + 1) % numSides));
        }

        return totalDist / numSides;
    }
}