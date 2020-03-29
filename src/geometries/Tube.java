package geometries;
import  primitives.Ray;
public class  Tube extends RadialGeometry
{
  public Ray ray;

    /**
     * constructor with a radius and a ray
     * @param radius
     * @param d
     */
  public  Tube(double radius,Ray d)
  {
      super(radius);
      ray =d;
  }

    /**
     * constructor with parameters
     * @param radialGeometry
     * @param ray
     */
  public Tube(RadialGeometry radialGeometry,Ray ray)
  {
      super(radialGeometry);
      this.ray =ray;
  }

    /**
     * returns the ray
     * @return the ray
     */
    public Ray getRay() {
        return ray;
    }

    @Override
    public String toString() {
        return "the Tube's axisRay= is :" + ray + ", the radius is" + _radius + '.';
    }
}
