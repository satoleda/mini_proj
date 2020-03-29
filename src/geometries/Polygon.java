package geometries;
import java.util.List;
import primitives.*;
import static primitives.Util.*;

public  class Polygon  implements Geometry {


        protected List<Point3D> _vertices;

        protected Plane _plane;


        public Polygon(Point3D... vertices) {
            if (vertices.length < 3)
                throw new IllegalArgumentException("A polygon can't have less than 3 vertices");
            _vertices = List.of(vertices);
            // Generate the plane according to the first three vertices and associate the
            // polygon with this plane.
            // The plane holds the invariant normal (orthogonal unit) vector to the polygon
            _plane = new Plane(vertices[0], vertices[1], vertices[2]);
            if (vertices.length == 3) return; // no need for more tests for a Triangle

            Vector n = _plane.getNormal();

            // Subtracting any subsequent points will throw an IllegalArgumentException
            // because of Zero Vector if they are in the same point
            Vector edge1 = vertices[vertices.length - 1].subtract(vertices[vertices.length - 2]);
            Vector edge2 = vertices[0].subtract(vertices[vertices.length - 1]);


            boolean positive = edge1.crossProduct(edge2).dotProduct(n) > 0;
            for (int i = 1; i < vertices.length; ++i) {
                // Test that the point is in the same plane as calculated originally
                if (!isZero(vertices[i].subtract(vertices[0]).dotProduct(n)))
                    throw new IllegalArgumentException("All vertices of a polygon must lay in the same plane");
                // Test the consequent edges have
                edge1 = edge2;
                edge2 = vertices[i].subtract(vertices[i - 1]);
                if (positive != (edge1.crossProduct(edge2).dotProduct(n) > 0))
                    throw new IllegalArgumentException("All vertices must be ordered and the polygon must be convex");
            }
        }

        @Override
        public Vector getNormal(Point3D point) {
            return _plane.getNormal();
        }
    }


