package task8;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.concurrent.ArrayBlockingQueue;

public class Triangle {
    private Point a, b, c;
    private double area, perimeter,height,hafPerimeter,ab,bc,ac;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getAb() {
        return this.ab = Math.sqrt((b.getX()-a.getX())*(b.getX()-a.getX())+(b.getY()-a.getY())*(b.getY()-a.getY()));
    }

    public double getBc() {
        return this.bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
    }

    public double getAc() {
        return this.ac = Math.sqrt((c.getX()-a.getX())*(c.getX()-a.getX())+(c.getY()-a.getY())*(c.getY()-a.getY()));
    }

    public double getPerimeter() {
        return this.perimeter = ab+bc+ac;
    }

    public double getHafPerimeter() {
        return this.hafPerimeter= perimeter/2 ;
    }

    public double getHeight() {
        return this.height=(2*(Math.sqrt(hafPerimeter*(hafPerimeter-ab)*(hafPerimeter-bc)*(hafPerimeter-ac))))/ab;
    }

    public double getArea() {
        return this.area= (getAc()*height)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c + '}'+
                "\n height=" + height +
                "\n area=" + area +
                "\n perimeter=" + perimeter ;
    }
}