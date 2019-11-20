package decorator.road;

public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }
}
