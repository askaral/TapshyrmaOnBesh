public class Circle {

    public static int radius;

    public static void area(){
        System.out.println("Area of a circle: "+Math.round(Math.PI*(radius*radius)));

    }
    public static void circumference(){
        System.out.println("Circumference: "+Math.round(Math.PI*2*radius));
    }
}
