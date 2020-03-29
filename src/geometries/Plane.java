package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane  implements Geometry
{
    Point3D p;
    Vector d;

    /**
     * constructor with three points
     * @param a
     * @param B
     * @param c
     */
    public Plane(Point3D a,Point3D B,Point3D c)
    {
        p=a;
        d=getNormal(a);
    }

    /**
     * constructor with a point and a vector
     * @param A
     * @param B
     */
    public Plane(Point3D A,Vector B)
    {
        p=A;
        d=B;
    }

    @Override
    public Vector getNormal(Point3D p) {
        return null;
    }

    public Vector getNormal()
    {
        return null;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "p=" + p +
                ", d=" + d +
                '}';
    }
}
