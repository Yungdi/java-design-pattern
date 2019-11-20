package decorator.road;

public class CrossingDecorator extends DisplayDecorator {
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("\t교차로 표시");
    }
}
