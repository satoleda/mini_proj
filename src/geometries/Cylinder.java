package geometries;

import primitives.Ray;

public class Cylinder extends Tube {
    double height;

    /**
     * constructor with parameters
     * @param rad
     * @param ray
     * @param h
     */
    public Cylinder(double rad, Ray ray, int h)
    {
        super(rad,ray);
        height=h;
    }

    /**
     * constructor with parameters
     * @param radialGeometry
     * @param r
     * @param h
     */
    public Cylinder(RadialGeometry radialGeometry,Ray r, int h)
    {
        super(radialGeometry,r);
        height=h;
    }

    /**
     * the function returns the height of the cylinder
     * @return the cylinder's height
     */
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder 's height is: " + height + ", axisRay is: " + ray + ", radius is" + _radius + '.';
    }
}
