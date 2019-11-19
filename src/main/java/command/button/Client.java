package command.button;

public class Client {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Command lampOffCommand = new LampOffCommand(lamp);
        Command alarmOnCommand = new AlarmOnCommand(new Alarm());

        Button button = new Button();
        button.setCommand(lampOnCommand);
        button.pressed();
        button.setCommand(lampOffCommand);
        button.pressed();
        button.setCommand(alarmOnCommand);
        button.pressed();
    }

}
