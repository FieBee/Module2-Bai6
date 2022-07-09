public class Point3d extends Point2d{
    private float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float []arr = {super.getX(),super.getY(),z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z +
                '}' + super.toString() +" "+ getXYZ();
    }
}
