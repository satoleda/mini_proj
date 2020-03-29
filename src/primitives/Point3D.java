package primitives;

/**
 * this class represent a 3D point and it contains three coordinates x,y,z.
 */
public class Point3D {
    Coordinate x;
    Coordinate y;
    Coordinate z;
    /**
     * constructor with a 3D point
     * @param p
     */
    public Point3D(Point3D p)
    {
        x=p.x;
        y=p.y;
        z=p.z;

    }
    /**
     * constructor with 3 coordinates
     * @param x1 is a coordinate
     * @param y2 is a coordinate
     * @param z3 is a coordinate
     */
    public Point3D(Coordinate x1,Coordinate y2,Coordinate z3)
    {
       x=x1;
       y=y2;
       z=z3;
    }
    /**
     * constructor with three doubles
     * @param _x
     * @param _y
     * @param _z
     */
    public Point3D(double _x, double _y, double _z)
    {
        this(new Coordinate(_x), new Coordinate(_y), new Coordinate(_z));
    }
    public final static  Point3D ZERO=new Point3D(0,0,0);
    /**
     * this function returns the value of the coordinate x.
     * @return new coordinate x.
     */
    public Coordinate getX() {
        return x;
    }
    /**
     * this function returns the value of the coordinate y.
     * @return new coordinate y.
     */
    public Coordinate getY() {
        return y;
    }
    /**
     * this function returns the value of the coordinate z.
     * @return new coordinate z.
     */
    public Coordinate getZ() {
        return z;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Point3D)) return false;
        Point3D oth = (Point3D)obj;
        return x.equals(oth.x) && y.equals(oth.y) && z.equals(oth.z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * this function subtract two points coordinates
     * @param point
     * @return the new vector
     */
    public Vector subtract(Point3D point)
    {
        return new Vector(new Point3D(
                this.x.get() - point.x.get(),
                this.y.get() - point.y.get(),
                this.z.get() - point.z.get()
        ));
    }

    /**
     * this function adds a vector to a point
     * @param vec
     * @return a new point
     */
   public Point3D add(Vector vec)
    {
        return new Point3D(x.get()+vec.head.x.get(),
                y.get()+vec.head.y.get(),
                z.get()+vec.head.z.get());
    }

    /**
     * this function calculates the distance between two points
     * @param point
     * @return the distance squared
     */
    public double distanceSquared(Point3D point)
    {
        double x=(point.x.get()-this.x.get())*(point.x.get()-this.x.get());
        double y=(point.y.get()-this.y.get())*(point.y.get()-this.y.get());
        double z=(point.z.get()-this.z.get())*(point.z.get()-this.z.get());
        double distance= x+y+z;
        return  distance;
    }

    /**
     * calculates the distance between two points
     * @param A
     * @return the distance
     */
    public double distance(Point3D A)
    {
        return Math.sqrt(distanceSquared(A));
    }
}
