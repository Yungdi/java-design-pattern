package decorator.road;

public class RoadClient {
    public static void main(String[] args) {
        Display roadDisplay = new RoadDisplay();
        roadDisplay.draw();
        Display laneDecorator = new LaneDecorator(roadDisplay);
        laneDecorator.draw();
        Display trafficDecorator = new TrafficDecorator(roadDisplay);
        trafficDecorator.draw();
        Display roadWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(roadDisplay));
        roadWithLaneAndTraffic.draw();
        Display roadWithCrossingAndLaneAndTraffic =
                new CrossingDecorator(
                        new TrafficDecorator(
                                new LaneDecorator(roadDisplay)));

        roadWithCrossingAndLaneAndTraffic.draw();
    }
}
