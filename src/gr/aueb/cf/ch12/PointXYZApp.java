package gr.aueb.cf.ch12;


public class PointXYZApp {

    public static void main(String[] args) {

        PointXYZ p1 = new PointXYZ(1, 2, 3);
        PointXYZ p2 = new PointXYZ();
        PointXYZ p3 = new PointXYZ(5, 6, 7);

        p2.setX(9);
        p2.setZ(10);


        System.out.println("Point instances: " + p1.convertToString());
        System.out.println("Point instances: " + p2.convertToString());
        System.out.println("Point instances: " + p3.convertToString());


    }




}
