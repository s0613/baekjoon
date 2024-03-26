package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class XYSorting_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++){
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.y == o2.y) {
                    return Integer.compare(o1.x, o2.x);
                }
                return Integer.compare(o1.y, o2.y);
            }
        });
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
