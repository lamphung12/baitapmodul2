package huongDoiTuong.keThua;

public class PointMoveablePoint {
    private float x=0.0f;
    private float y=0.0f;

    public PointMoveablePoint() {
    }

    public PointMoveablePoint(float x, float y) {
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
class newPoint{
    public static class MoveablePoint extends PointMoveablePoint{
        private float xSpeed =0.0f;
        private float ySpeed =0.0f;

        public MoveablePoint() {
        }

        public MoveablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getXSpeed() {
            return xSpeed;
        }

        public void setXSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getYSpeed() {
            return ySpeed;
        }

        public void setYSpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public void setSpeed(float xSpeed, float ySpeed){
           this.xSpeed=xSpeed;
           this.ySpeed=ySpeed;
        }

        public float[] getSpeed(float xSpeed, float ySpeed) {
            return new float[]{xSpeed,ySpeed};
        }

        @Override
        public String toString() {
            return "MoveablePoint{" +
                    "xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +"speed ="+(xSpeed+ ","+ySpeed)+
                    '}';
        }
        public MoveablePoint move(){
            super.setX(super.getX()+ xSpeed);
            super.setY(super.getY()+ySpeed);
            return this;
        }

        public static void main(String[] args) {
            MoveablePoint m = new MoveablePoint(3,4,3,8);
            System.out.println(m);
        }
    }
}
