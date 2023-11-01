import java.util.Scanner;
public class LinearEquationLogic {


    private Scanner myScanner;
    private LinearEquation hi =null;
    public LinearEquationLogic(){
        myScanner = new Scanner(System.in);
    }






    public void start(){
        lineInfor();
        findPoint();
    }








    private void lineInfor(){
        System.out.println("Enter coordinate 1: ");
        String c1 = myScanner.nextLine();
        int idx = c1.indexOf(",");
        System.out.println("Enter coordinate 2: ");
        String c2 = myScanner.nextLine();
        int idx2 = c2.indexOf(",");
        int x1 = Integer.parseInt(c1.substring(1,idx));
        int y1 = Integer.parseInt(c1.substring(idx + 2,c1.length() - 1));
        int x2 = Integer.parseInt(c2.substring(1,idx2));
        int y2 = Integer.parseInt(c2.substring(idx2 + 2, c2.length() -1));
        hi.setValue(x1, y1, x2, y2);
        LinearEquation hi = new LinearEquation(x1, y1, x2, y2);
        double slope = hi.slope();
        System.out.println("----- Line info -----");
        if (x1 == x2){
            System.out.println("These points are on the vertical line: y = "+ x1);
        }
        else{
            double yInt = hi.yIntercept();
            String equation = hi.equation();
            String distance = String.valueOf(hi.distance());


            System.out.println("The two points are: " + c1 + " and " + c2);
            System.out.println("The equation of the line between these points is: "+ equation);
            System.out.println("The slope of this line is: " + slope);
            System.out.println("The y-intercept of this line is: " + yInt);
            System.out.println("The distance between these points is " + distance);
        }
    }


    private void findPoint() {
        String answer = "y";
        while (answer.equals("y")) {
            System.out.println("Enter a value for X: ");
            int x = myScanner.nextInt();
            myScanner.nextLine();
            System.out.println("Coordinate for X: " + hi.coordinateForX(x));
            System.out.println("would you like to enter another pair of coordinates? (y/n): ");
            answer = myScanner.nextLine();

            if(answer.equals("n")){
                System.out.println("Thank you for using the slope calculator, goodbye.");
            }
        }
    }
}
