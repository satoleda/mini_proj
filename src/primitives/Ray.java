package primitives;

/**
 * this class contains a vector ans a 3D point
 */
public class Ray {
    Point3D point;
    Vector vector;

    /**
     * constructor with a vector and a point
     * @param point
     * @param vector
     */
    public Ray(Point3D point, Vector vector) {
        if (lengthRay(point, vector) != 1)
            throw new IllegalArgumentException(" This vector is not a unit vector! ");
        else {
            this.point = point;
            this.vector= vector;
        }
    }

    /**
     * copy constructor
     * @param r -ray
     */
    public Ray(Ray r) {
        this.point = r.point;
        this.vector = r.vector;
    }

    /**
     * returns a 3D point
     * @return a point
     */
    public Point3D get_point() {
        return point;
    }

    /**
     * the function returns the vector
     * @return the vector
     */
    public Vector get_vector() {
        return vector;
    }

    @Override
    public String toString() {
        return "Ray: \nPoint is: " + point + "\nVector is: " + vector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return point.equals(ray.point) &&
                vector.equals(ray.vector);
    }

    /**
     * this function calculates the ray's length
     * @param point
     * @param vector
     * @return the length of the ray
     */
    public double lengthRay(Point3D point, Vector vector) {
        return Math.sqrt((point.x.get() - vector.head.x.get()) * (point.x.get() - vector.head.x.get())
                + (point.y.get() - vector.head.y.get()) * (point.y.get() - vector.head.y.get())
                + (point.z.get() - vector.head.z.get()) * (point.z.get() - vector.head.z.get())
        );
    }
}


