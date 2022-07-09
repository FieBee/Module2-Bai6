public class Test {
    public static void main(String[] args) {
        Point2d d21 = new Point2d();
        System.out.println(d21);

        Point2d d22 = new Point2d(3,3);
        System.out.println(d22);

        Point3d d31 = new Point3d();
        System.out.println(d31);

        Point3d d32 = new Point3d(4,4,4);
        System.out.println(d32);

        System.out.println(d32.getXY());

        for (float element: d22.getXY()){
            System.out.println(element);
        }

    }
}
