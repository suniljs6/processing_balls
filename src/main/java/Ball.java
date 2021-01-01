import processing.core.PApplet;

public class Ball extends PApplet {
    int xAxis;
    int yAxis;
    int width;
    int height;
    int speed;


    public Ball(int xAxis, int yAxis, int width, int height,int speed){
        this.xAxis = 10;
        this.yAxis = yAxis;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

}
