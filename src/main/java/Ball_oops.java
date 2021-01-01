import processing.core.PApplet;

public class Ball_oops extends PApplet {

    public static final int width = 800;
    public static final int height = 800;

    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;

    public static void main(String[] args) {
        PApplet.main("Ball_oops",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(this.width,this.height);
    }


    @Override
    public void setup() {
        b1 = new Ball(0,height / 5, 10, 10 ,1);
        b2 = new Ball(0,height * 2 / 5, 10, 10 ,2);
        b3 = new Ball(0,3 * height / 5, 10, 10 ,3);
        b4 = new Ball(0,4 * height / 5, 10, 10 ,4);
    }

    @Override
    public void draw() {
        drawSketch(b1);
        drawSketch(b2);
        drawSketch(b3);
        drawSketch(b4);
    }

    public void drawSketch(Ball b) {
        ellipse(b.xAxis,b.yAxis,b.width,b.height);
        b.xAxis += b.speed;
    }
}
