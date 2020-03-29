package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class RadialGeometry {
    double _radius;

    /**
     * constructor with a radius
     * @param rad
     */
    public  RadialGeometry(double  rad)

    {
        _radius=rad;
    }

    /**
     * copy constructor
     * @param rad
     */
    public RadialGeometry(RadialGeometry  rad)
    {
      _radius=rad._radius;
    }

    /**
     * the function returns the radius
     * @return the radius
     */
    public double get_radius()
    {
        return _radius;
    }

    public Vector getNormal(Point3D p) {
        return null;
    }

    @Override
    public String toString() {
        return "The radius is: " + _radius + '.';
    }
}
