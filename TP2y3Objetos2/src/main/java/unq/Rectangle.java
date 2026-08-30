package unq;

public class Rectangle {
    private Point intialPoint;
    private int width;
    private  int height;

    public Rectangle(Point origin , int width ,int height ){
          this.validateDimensions(width,height );
          this.validateOriginNotNull(origin);
          this.width = width;
          this.height = height;
          this.intialPoint = origin;
    }

    private void validateDimensions(int num1 ,int num2){
        if(num1 <= 0 || num2 <= 0){
            throw new IllegalArgumentException("not valid width or height");
        }
    }

    private void validateOriginNotNull(Point evaluablePoint) {
        if (evaluablePoint == null) {
            throw new IllegalArgumentException("Point cant be null");
        }
    }

    public int getArea(){
        return this.getHeight() * getWidth();
    }

    public int getPerimeter(){
        return 2 * (this.getWidth() + this.getWidth());
    }

    public boolean isHorizontal() {
        return this.width > this.height;
    }

    public boolean isVertical() {
        return this.height > this.width;
    }

    public Point getOrigin() {
        return intialPoint;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
