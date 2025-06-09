package algo.algorithm;

import kotlin.TuplesKt;
import org.apache.logging.log4j.util.PropertySource;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Programming1 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(5, 4));
        points.add(new Point(3, 3));

        long xSum = 0;
        long ySum = 0;

        for(Point point : points) {
            xSum += point.x;
            ySum += point.y;
        }

        double xAvg = (double) xSum / points.size();
        double yAvg = (double) ySum / points.size();

        points.sort((p1, p2) -> {
            double p1AvgDiff = Math.abs(p1.x - xAvg) + Math.abs(p1.y - yAvg); //p1이 평균점에서 얼마나 멀리 떨어져 있는지
            double p2AvgDiff = Math.abs(p2.x - xAvg) + Math.abs(p2.y - yAvg);
            return Double.compare(p1AvgDiff, p2AvgDiff);
        });

        for (Point point : points) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
    }
}
