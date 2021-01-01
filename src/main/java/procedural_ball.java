import processing.core.PApplet;

public class procedural_ball extends PApplet {

    public static final int width = 800;
    public static final int height = 800;
    int[] heights = { width/5, width * 2 /5, width * 3 /5, width * 4 /5 };
    int ball_width = 10;
    int ball_height = 10;
    int[] xOfBalls = {0, 0, 0, 0};
    int[] speeds = {1, 2, 3 ,4};

    public static void main(String[] args) {
        PApplet.main("procedural_ball",args);
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void draw() {
        drawBallOne();
        drawBallTwo();
        drawBallThree();
        drawBallFour();
    }

    private void drawBallFour() {
        ellipse(xOfBalls[3],heights[3],this.ball_width,this.ball_height);
        xOfBalls[3]+=speeds[3];
    }

    private void drawBallThree() {
        ellipse(xOfBalls[2],heights[2] , this.ball_width,this.ball_height);
        xOfBalls[2]+=speeds[2];
    }

    private void drawBallTwo() {
        ellipse(xOfBalls[1], heights[1],this.ball_width,this.ball_height);
        xOfBalls[1]+=speeds[1];
    }

    private void drawBallOne() {
        ellipse(xOfBalls[0], heights[0],this.ball_width,this.ball_height);
        xOfBalls[0]+=speeds[0];
    }
}
