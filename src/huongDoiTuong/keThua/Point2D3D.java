package huongDoiTuong.keThua;

import java.awt.geom.Point2D;

public class Point2D3D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D3D() {
    }

    public Point2D3D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
       this.x=x;
       this.y=y;
    }
    public float[] getXY(float x, float y){
         return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "Point2D3D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
            Point2D3D p =new Point2D3D(3,4);
        System.out.println(p.toString());
    }
}
class NewPoint{
  public static class Point3D extends Point2D3D{
      private float z=0.0f;

      public Point3D() {
      }

      public Point3D(float x, float y, float z) {
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
        this.z=z;
      }
      public float[] getXYZ(float x, float y,float z ){
          return new float[]{x,y,z};
      }

      @Override
      public String toString() {
          return "Point3D{"+super.toString()+
                  "z=" + z +
                  '}';
      }

      public static void main(String[] args) {
          Point3D p1 = new Point3D(0.2f,3.4f,3f);
          System.out.println(p1.toString());
      }
  }
}
