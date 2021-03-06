package ca.durhamcollege;

public class Triangle extends Shape
{
    // public properties
    @Override
    public float getArea()
    {
        var A = getVertices().get(0);
        System.out.println("Debug: " + A);
        var B = getVertices().get(1);
        var C = getVertices().get(2);
        var firstTerm = A.getX() * (B.getY() - C.getY());
        var secondTerm = B.getX() * (C.getY() - A.getY());
        var thirdTerm = C.getX() * (A.getY() - B.getY());

        return Math.abs((firstTerm + secondTerm + thirdTerm)/2);
    }
//    /**
//     * The empty constructor for the Triangle class created a shape with a single vertex and single edge.
//     */
//    Triangle()
//    {
//        super();
//    }

    /**
     * Thos constructs a triangle with three points(p1, p2, p3)
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */
    public Triangle(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception {
        super();
        setVertices(p1, p2, p3);
    }

    /**
     * Constructs a triangle from a Vector2D Array of points.
     * The Vector2D must have a minimum size of 3 is required for this constructor to be used.
     * @param vertices Vector2D array to be passed to the constructor
     * @throws Exception throws an exception if the size of the vertices array is less than 3.
     */
    public Triangle(Vector2D[] vertices) throws Exception {
        super();
        if (vertices.length >= 3)
        {
        setVertices(vertices[0], vertices[1], vertices[2]);
        }
        else
        {
            throw new Exception("ERROR: Triangle constructed with less than 3 vertices.");
        }
    }

    //private Vector2D[] points; //overshadow all vertices in shape class

    // public methods
    /**
     * sets the values of the vertices of the triangle.
     * if values for these points already exists they are overridden.
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */
    public void setVertices(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception {
        // initializing an array
        Vector2D[] vertices = {p1, p2, p3};

        // check if any of the Vector2Ds are the same
        if((p1.equals(p2)) || (p1.equals(p3)) || (p2.equals(p3)))
        {
            throw new Exception("ERROR: Triangle constructed with at least one vertex that is the same as another.");
        }
        else
        {
            super.setVertices(vertices);
        }
    }

    // public methods
    @Override
    public String toString()
    {
        String output_string = "";
        output_string += "-----------------------------------------------------\n";
        output_string += "Triangle\n";
        output_string += super.toString();
        output_string += "-----------------------------------------------------\n";
        output_string += "Area             : " + getArea() + " \n";
        output_string += "-----------------------------------------------------\n";
        return output_string;
    }

    @Override
    public void Draw()
    {
        System.out.println("Now drawing triangle.");
    }

    @Override
    public void Update()
    {

    }

//    @Override
//    public float getArea()
//    {
//        Vector2D A = getVertices().get(0);
//        Vector2D B = getVertices().get(1);
//        Vector2D C = getVertices().get(2);
//        var firstTerm = A.getX() * (B.getY() - C.getY();
//        var secondTerm = B.getX() * (C.getY() - A.getY());
//        var thirdTerm = C.getX() * (A.getY() - B.getY());
//
//        return (firstTerm + secondTerm + thirdTerm)/2;
//    }
}
