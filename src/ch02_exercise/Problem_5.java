package ch02_exercise;

public class Problem_5 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.getX() + " " + p.getY());
    }
}

class Point {
    /**
     * 一个<code>Point<code/>对象代表一个点
     */
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    Point translate(double delta_x, double delta_y) {
        return new Point(this.x + delta_x, this.y + delta_y);
    }

    Point scale(double rate) {
        return new Point(this.x * rate, this.y * rate);
    }

}