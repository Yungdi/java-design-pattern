package command.controller;

public class MuteBtnCmd implements Cmd {
    private Tv tv;

    public MuteBtnCmd(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.mute();
    }

}
