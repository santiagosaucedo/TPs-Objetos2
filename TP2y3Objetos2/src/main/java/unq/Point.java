package unq;

public class Point {
    int Xvalue;
    int Yvalue;
    public Point(){
        this(0,0);
    }
    public Point(int xValue , int yValue){
        this.Xvalue = xValue;
        this.Yvalue = yValue;
    }

    public void moveThePontTo(int newX , int newY){
        this.Xvalue = newX;
        this.Yvalue = newY;
    }

    public Point sumPoint(Point anotherPoint) {
        int summedX = this.Xvalue + anotherPoint.getX();
        int summedY = this.Yvalue + anotherPoint.getY();

        return new Point(summedX, summedY);
    }

    public int getX(){
        return this.Xvalue;
    }

    public  int getY(){
        return  this.Yvalue;
    }

}
