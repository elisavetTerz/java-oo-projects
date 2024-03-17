package gr.aueb.cf.ch15;

public class PointUtil {
    public static double distanceFromOrigin(Point point) {

        if (point instanceof Point3D point3D) {
            return point3D.getDistanceFromOrigin();
        } else if (point instanceof Point2D point2D) {
            return point2D.getDistanceFromOrigin();
        } else {
            return point.getDistanceFromOrigin();
        }
    }
}
