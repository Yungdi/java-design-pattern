package command.controller;

public class TwoBtnController {
    private Cmd turnBtnCmd;
    private Cmd muteBtnCmd;

    public void setTurnBtnCmd(Cmd turnBtnCmd) {
        this.turnBtnCmd = turnBtnCmd;
    }

    public void setMuteBtnCmd(Cmd muteBtnCmd) {
        this.muteBtnCmd = muteBtnCmd;
    }

    public void pressTurnBtn() {
        this.turnBtnCmd.execute();
    }

    public void pressMuteBtn() {
        this.muteBtnCmd.execute();
    }

}
