package ca.durhamcollege;

public class Rectangle extends Shape
{
    // private instance members (fields)
    private Vector2D start;
    private float width;
    private float height;

    // public properties
    public Vector2D getStart()
    {
        return start;
    }

    public void setStart(Vector2D start)
    {
        this.start = start;
    }

    public float getWidth()
    {
        return width;
    }

    public void setWidth(float width)
    {
        this.width = width;
        set(start, this.width, height);
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
        set(start, width, this.height);
    }

    public float getPerimeter()
    {
        return (width + height) * 2.0f;
    }

    public float getArea()
    {
        return (width * height);
    }
    public boolean isSquare()
    {
        return (width == height);
    }
    // constructor(s)
    public Rectangle(Vector2D start, float width, float height)
    {
        super();// call this in first place inside a constructor
        this.start = start;
        this.width = width;
        this.height = height;
        set(start, width, height);

    }

    // private methods

    // public methods
    public void set(Vector2D start, float width, float height)
    {
        Vector2D[] vertices = {
                start,
                new Vector2D(start.getX()+ width, start.getY()),
                new Vector2D(start.getX()+ width, start.getY() + height),
                new Vector2D(start.getX(), start.getY() + height),
        };
        super.setVertices(vertices);
    }
    @Override
    public String toString()
    {
        String output_string = "";
        output_string += "-----------------------------------------------------\n";
        output_string += "Rectangle\n";
        output_string += super.toString();
        output_string += "-----------------------------------------------------\n";
        output_string += "Perimeter        : " + getPerimeter() + " \n";
        output_string += "Area             : " + getArea() + " \n";
        output_string += "Square?          : " + isSquare() + " \n";
        output_string += "-----------------------------------------------------\n";

        return output_string;
    }

    @Override
    public void Draw()
    {

    }

    @Override
    public void Update()
    {

    }
}
