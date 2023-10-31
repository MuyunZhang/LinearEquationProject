

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
        if(firstY == secondY){
            equation = "y = " + yIntercept;
        }
        else{
            equation = (int) (secondX - firstX) + "/" + (int) (secondY - firstY) + "x " + " + " + yIntercept;
        }
        return equation;
    }


    public String coordinateForX(double x){
        String point = "(" + x + ", " + (x * slope + yIntercept) + ")";
        return point;
    }
}






