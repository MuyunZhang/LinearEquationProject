

public class LinearEquation {


    private String point;
    private double slope;
    private double firstX;
    private double firstY;
    private double secondX;
    private double secondY;
    private double distance;
    private double yIntercept;
    private String equation;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        firstX = x1;
        secondX = x2;
        firstY = y1;
        secondY = y2;
        slope = slope();
        distance = distance();
        yIntercept= yIntercept();
        equation = equation();
    }


    public void setValue(double x1, double y1, double x2, double y2){
        firstX = x1;
        secondX = x2;
        firstY= y1;
        secondY = y2;
    }


    public double slope() {
        double x = secondX - firstX;
        double y = secondY - firstY;

        slope = Math.round((y / x) * 100) / 100.0;
        return slope;
    }


    public double distance(){
        double first = Math.pow((firstX - secondX), 2);
        double second = Math.pow((firstY - secondY), 2);
        double dis = Math.sqrt((first + second));
        dis = Math.round(dis * 100) / 100.0;
        return dis;
    }


    public double yIntercept(){
        double y = secondY - slope * secondX;
        yIntercept = Math.round(y * 100) / 100.0;
        return yIntercept;
    }


    public String equation(){
        double y = secondY - firstY;
        double x = secondX - firstX;
        int whole = (int)(y/x);
        int yInt = (int) yIntercept;
        if(x < 0 && y<0){
            x = Math.abs(x);
            y = Math.abs(y);
        }
        else if(x < 0 && y > 0){
            y = -1 * y;
            x = -1 * x;
        }
        if(slope == 1 || slope == -1){
            if(yIntercept == yInt){
                if (firstY == secondY) {
                    equation = "y = " + yInt;
                } else if (y / x == (int) (y / x) && yInt == 0) {
                    equation = "x";
                } else if (y / x == (int) (y / x)) {
                    equation = "x " + "+ " + yInt;
                } else if (yInt == 0) {
                    equation = (int) (y) + "/" + (int) (x) + "x";
                } else if (yInt <0) {
                    yInt = Math.abs(yInt);
                    equation = (int) (y) + "/" + (int) (x) + "x " + " - " + yInt;
                } else {
                    equation = (int) (y) + "/" + (int) (x) + "x " + " + " + yInt;
                }
            }
            else {
                if (firstY == secondY) {
                    equation = "y = " + yIntercept;
                } else if (y / x == (int) (y / x) && yIntercept == 0) {
                    equation = whole + "x";
                } else if (y / x == (int) (y / x)) {
                    equation = whole + "x " + " + " + yIntercept;
                } else if (yIntercept == 0) {
                    equation = (int) (y) + "/" + (int) (x) + "x";
                } else if (yIntercept <0) {
                    yIntercept = Math.abs(yIntercept);
                    equation = (int) (y) + "/" + (int) (x) + "x " + " - " + yIntercept;
                } else {
                    equation = (int) (y) + "/" + (int) (x) + "x " + " + " + yIntercept;
                }
            }
        }
        else {
            if(yIntercept == yInt){
                if (firstY == secondY) {
                    equation = "y = " + yInt;
                } else if (y / x == (int) (y / x) && yInt == 0) {
                    equation = whole + "x";
                } else if (y / x == (int) (y / x)) {
                    equation = whole + "x " + " + " + yInt;
                } else if (yInt == 0) {
                    equation = (int) (y) + "/" + (int) (x) + "x";
                } else if (yInt <0) {
                    yInt = Math.abs(yInt);
                    equation = (int) (y) + "/" + (int) (x) + "x " + " - " + yInt;
                } else {
                    equation = (int) (y) + "/" + (int) (x) + "x " + " + " + yInt;
                }
            }
            else {
                if (firstY == secondY) {
                    equation = "y = " + yIntercept;
                } else if (y / x == (int) (y / x) && yIntercept == 0) {
                    equation = whole + "x";
                } else if (y / x == (int) (y / x)) {
                    equation = whole + "x " + " + " + yIntercept;
                } else if (yIntercept == 0) {
                    equation = (int) (y) + "/" + (int) (x) + "x";
                } else if (yIntercept <0) {
                    yIntercept = Math.abs(yIntercept);
                    equation = (int) (y) + "/" + (int) (x) + "x " + " - " + yIntercept;
                } else {
                    equation = (int) (y) + "/" + (int) (x) + "x " + " + " + yIntercept;
                }
            }
        }

        return equation;
    }


    public String coordinateForX(double x){
        double um = (x * slope + yIntercept);
        String point = "(" + x + ", " + (Math.round(um * 100) / 100.0) + ")";
        return point;
    }
    public String lineinfo(){
        String c1 = "(" + firstX + ", " + firstY + ")";
        String c2 = "(" + secondX + ", " + secondY + ")";

        return "The two points are: " + c1 + " and " + c2 + "\n" +
                "The equation of the line between these points is: "+ equation + "\n"
                + "The slope of this line is: " + slope + "\n" + "The y-intercept of this line is: " + yIntercept
                + "\n" + "The distance between these points is " + distance;
    }

}






