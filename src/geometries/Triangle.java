package geometries;

import primitives.Point3D;

public class Triangle extends Polygon {
    /**
     * constructor with 3 points
     * @param p1
     * @param p2
     * @param p3
     */
    Triangle(Point3D p1, Point3D p2, Point3D p3)
    {
        super(p1,p2,p3);
    }

    @Override
    public String toString() {
        return "Triangle vertices:" + _vertices + ", plane" + _plane + '.';
    }
}
