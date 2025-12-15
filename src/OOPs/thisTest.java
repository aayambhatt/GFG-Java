package OOPs;

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println("x= " + x + ", y= " + y);
    }
}

public class thisTest {
    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        p1.print();
    }
}
