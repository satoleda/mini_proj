package primitives;

import java.util.Objects;

public class Vector {
    Point3D head;
    /**
     * constructor with a vector
     *
     * @param p
     */
    public Vector(Vector p)
    {
        head=p.head;
    }

    /**
     * constructor with a Point3D
     * @param point
     */
    public Vector(Point3D point)
    {
    if(point.equals(Point3D.ZERO))
        throw new IllegalArgumentException("You entered Vector Zero");
    else head=point;
    }

    /**
     * constructor with three coordinates
     * @param x1
     * @param y2
     * @param z3
     */
    public Vector(Coordinate x1,Coordinate y2,Coordinate z3) {
        Point3D head = new Point3D(x1, y2, z3);
        if (head.equals(Point3D.ZERO))
            throw new IllegalArgumentException("You entered Vector Zero");
        else {
            head.x = x1;
            head.y = y2;
            head.z = z3;
        }
    }

    /**
     * constructor with three doubles
     * @param h1
     * @param h2
     * @param h3
     */
    public Vector(double h1, double h2,double h3)
    {
        this(new Coordinate(h1), new Coordinate(h2), new Coordinate(h3));
        Point3D head = new Point3D(h1, h2, h3);
        if (head.equals(Point3D.ZERO))
            throw new IllegalArgumentException("You entered Vector Zero");
        else {
            this.head=new Point3D(h1,h2,h3);
        }
    }

    /**
     * this function returns the vector
     * @return
     */
    public Point3D getHead() {
        return new Point3D(head.x,head.y,head.z);
    }

    /**
     * the function compares two vectors
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(head, vector.head);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "head=" + head +
                '}';
    }

    /**
     * this function subtracts two vectors
     * @param vec
     * @return
     */
    public Vector subtract(Vector vec)
    {
        return new Vector(
                this.head.x.get() - vec.head.x.get(),
                this.head.y.get() - vec.head.y.get(),
                this.head.z.get() - vec.head.z.get()
        );
    }

    /**
     * this function adds one vector to another and returns the new vector
     * @param vec
     * @return
     */
    public Vector add(Vector vec)
    {
        return new Vector(
                this.head.x.get() + vec.head.x.get(),
                this.head.y.get() + vec.head.y.get(),
                this.head.z.get() + vec.head.z.get()
        );
    }

    /**
     * this function scales a vector with a scalar-number
     * @param num
     * @return
     */
    public Vector scale(int num)
    {
        return  new Vector(
                this.head.x.get()*num,
                this.head.y.get()*num,
                this.head.z.get()*num
        );
    }

    /**
     * this function does a dot product between two vectors
     * @param vec
     * @return a double number which is the dot product between the vectors.
     */
    public double dotProduct(Vector vec)
    {
        return
                this.head.x.get() * vec.head.x.get()+
                this.head.y.get() *vec.head.y.get()+
                this.head.z.get() * vec.head.z.get();
    }

    /**
     * this function multiplies two vectors and returns a new vector which is vertical to the vectors
     * @param vec is multiplied by the vector we have
     * @return a new vertical vector
     */
    public Vector crossProduct(Vector vec)
    {
        double x=(this.head.y.get()*vec.head.z.get())-(this.head.z.get()*vec.head.y.get());
        double y= (this.head.z.get()*vec.head.x.get())-(this.head.x.get()*vec.head.z.get());
        double z= (this.head.x.get()*vec.head.y.get())-(this.head.y.get()*vec.head.x.get());
        return new Vector(new Point3D(x,y,z));
    }

    /**
     * this function calculates the vector's length and returns it by square
     * @return squared vector length
     */
        public double lengthSquared() {
        return (this.head.x.get() * this.head.x.get()
                + this.head.y.get() * this.head.y.get()
                + this.head.z.get() * this.head.z.get());
    }

    /**
     * calculates the vector's length
     * @return
     */
    public double length()
    {
        return Math.sqrt(lengthSquared());
    }

    /**
     * the function normalize a vector
     * @return the normalized vector
     */
    public Vector normalize()
    {
        this.head=new Point3D(this.head.x.get()/length(),
                this.head.y.get()/length(),
                this.head.z.get()/length());
        return this;
    }

    /**
     * creates a new normalized vector
     * @return the new normalized vector
     */
    public  Vector normalized()
    {
        return new Vector((normalize()));
    }
}
