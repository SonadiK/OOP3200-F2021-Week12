package ca.durhamcollege;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
//        try
//        {
//            Triangle triangle = new Triangle(new Vector2D(0,1), new Vector2D(2, 0), new Vector2D(0,0));
//            System.out.println(triangle.toString());
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//        Circle circle = new Circle(new Vector2D(19.5f,25.3f), 13.758f);
//        System.out.println(circle.toString());
        ArrayList<Shape> shapes = new ArrayList<Shape>(); // empty collection

        try
        {
            shapes.add(new Circle(new Vector2D(10, 20), 20));
            shapes.add(new Triangle(new Vector2D(30,40), new Vector2D(50,60), new Vector2D(50, 30)));
            shapes.add(new Rectangle(new Vector2D(90,100), 40.0f, 40.0f));

            // Print shapes
            for (var shape: shapes)
            {
                System.out.println(shape);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

//        shapes.get(0).Draw();
//        shapes.get(0).Update();

    }
}
