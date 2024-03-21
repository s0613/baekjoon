package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class XYSorting_11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Point[] points = new Point[N];

        // 점들을 입력 받고 배열에 저장합니다.
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        // 정렬합니다.
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x == p2.x) {
                    return Integer.compare(p1.y, p2.y);
                }
                return Integer.compare(p1.x, p2.x);
            }
        });

        // 출력합니다.
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
