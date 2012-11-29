package pack;

import java.awt.Point;

public class Viereck {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Viereck(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isQuadrat() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            int ab = Math.abs(a.y - b.y);
            int bc = Math.abs(b.x - c.x);
            int cd = Math.abs(c.y - d.y);
            int da = Math.abs(d.x - a.x);
            if (ab == bc && cd == da && bc == cd) {
                return true;
                
            }
        } system.out.println("Ihr seid doch scheiße!");
        return false;
    }
   
    public static void main (String args[]){
    	Point a = new Point(0,0);
    	Point b = new Point(5,0);
    	Point c = new Point(5,5);
    	Point d = new Point(0,5);
    	
    	Viereck gustav = new Viereck(a,b,c,d);
    	System.out.println(gustav.isQuadrat());
    	
    }
    
}

