

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


    public LinearEquation() {
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
        yIntercept = secondY - slope * secondX;
        return yIntercept;
    }


    public String equation(){
        double y = secondY - firstY;
        double x = secondX - firstX;
        int whole = (int)(y/x);
        int yInt = (int) yIntercept;

        if(yIntercept == yInt){
            if (firstY == secondY) {
                equation = "y = " + yInt;
            } else if (y / x == (int) (y / x) && yInt == 0) {
                equation = whole + "x";
            } else if (y / x == (int) (y / x)) {
                equation = whole + "x " + " + " + yInt;
            } else if (yInt == 0) {
                equation = (int) (secondY - firstY) + "/" + (int) (secondX - firstX) + "x";
            } else {
                equation = (int) (secondY - firstY) + "/" + (int) (secondX - firstX) + "x " + " + " + yInt;
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
                equation = (int) (secondY - firstY) + "/" + (int) (secondX - firstX) + "x";
            }
            else {
                equation = (int) (secondY - firstY) + "/" + (int) (secondX - firstX) + "x " + " + " + yIntercept;
            }
        }
        return equation;
    }


    public String coordinateForX(double x){
        String point = "(" + x + ", " + (x * slope + yIntercept) + ")";
        return point;
    }
}






