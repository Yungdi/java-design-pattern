package command.controller;

public class TurnBtnCmd implements Cmd {
    private Tv tv;

    public TurnBtnCmd(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.power();
    }

}
