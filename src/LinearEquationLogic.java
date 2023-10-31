import java.util.Scanner;
public class LinearEquationLogic {


    private Scanner myScanner;
    private LinearEquation hi = new LinearEquation();
    public LinearEquationLogic(){
        myScanner = new Scanner(System.in);
    }






    public void start(){
        lineInfo();
        findPoint();
    }








    private void lineInfo(){
        System.out.println("Enter coordinate 1: ");
        String c1 = myScanner.nextLine();
        int idx = c1.indexOf(",");
        System.out.println("Enter coordinate 2: ");
        String c2 = myScanner.nextLine();
        int idx2 = c2.indexOf(",");
        double x1 = Integer.parseInt(c1.substring(1,idx));
        double y1 = Integer.parseInt(c1.substring(idx + 2,c1.length() - 1));
        double x2 = Integer.parseInt(c2.substring(1,idx2));
        double y2 = Integer.parseInt(c2.substring(idx2 + 2, c2.length() -1));
        hi.setValue(x1, y1, x2, y2);
        double slope = hi.getSlope();
        double yInt = hi.getYIntercept();
        String equation = hi.equation();
        String distance = String.valueOf(hi.getDistance());








        System.out.println("The two points are: " + c1 + " and " + c2);
        System.out.println("The equation of the line between these points is: "+ equation);
        System.out.println("The slope of this line is: " + slope);
        System.out.println("The y-intercept of this line is: " + yInt);
        System.out.println("The distance between these points is " + distance);
    }


    private void findPoint(){
        System.out.println("Enter a value for X: ");
        int x = myScanner.nextInt();
        System.out.println("The point on the line is: " + hi.getPoint(x));
        System.out.println("would you like to enter another pair of coordinates? (y/n)");
        String answer = myScanner.nextLine();


        while (answer.equals("y")) {
            System.out.println("Enter a value for X: ");
            x = myScanner.nextInt();
            System.out.println("The point on the line is: " + hi.getPoint(x));
            System.out.println("would you like to enter another pair of coordinates? (y/n)");
            answer = myScanner.nextLine();
        }
        System.out.println("Thank you for using the slope calculator, goodbye.");
    }
}
