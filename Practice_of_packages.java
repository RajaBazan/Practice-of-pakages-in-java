package hello.com;
class square1{
    int side;

    public void setSide(int side) {
        this.side = side;
    }
    class CalcSquare extends square1{
        public int area(){
            return 4*side;
        }
    }
    class rectangle{
        int length;
        int Breadth;

        public void setLength(int length) {
            this.length = length;
        }

        public void setBreadth(int breadth) {
            Breadth = breadth;
        }
    }
    class CalcRectangle extends rectangle{
        public int area(){
            return length * Breadth;
        }
    }
class circle123{
        float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
class CalcuCircle extends circle123{
        public float area(){
            return (float)Math.PI*radius*radius;
        }
        public float circumstance(){
            return 2*(float)Math.PI*radius;
        }
}
class Cylinder{
        float radius;
        float height;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
class CalcuCylinder extends Cylinder{
        public float surface_area(){
            return 2*(float)Math.PI*radius*height;
        }
        public float volume(){
            return (float) Math.PI*radius*height;
        }
}
class Sphere{
        float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
}
public class Practice_of_packages {
    public static void main(String[] args) {

    }
}
