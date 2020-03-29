package geometries;

import primitives.Point3D;

public class Sphere extends RadialGeometry {

    Point3D center;

    /**
     * constructor with a radius and a point center
     * @param radius
     * @param c
     */
    public Sphere(double radius,Point3D c) {
        super(radius);
        center=c;
    }

    /**
     * constructor with the sphere center and radial geometry
     * @param radialGeometry
     * @param point3D
     */
    public Sphere(RadialGeometry radialGeometry,Point3D point3D)
    {
        super(radialGeometry);
        center=point3D;
    }

    /**
     * returns the sphere center
     * @return the point center
     */
    public Point3D getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return " The Sphere center is: " + center + ", radius is" + _radius + '.';
    }
}
