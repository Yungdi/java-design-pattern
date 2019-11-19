package command.controller;

public class Demo {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Cmd muteBtnCmd = new MuteBtnCmd(tv);
        Cmd turnBtnCmd = new TurnBtnCmd(tv);
        TwoBtnController controller = new TwoBtnController();
        controller.setTurnBtnCmd(muteBtnCmd);
        controller.setMuteBtnCmd(turnBtnCmd);


        controller.pressMuteBtn();
        controller.pressTurnBtn();
        controller.pressMuteBtn();
        controller.pressTurnBtn();
        controller.pressMuteBtn();
        controller.pressTurnBtn();
        controller.pressMuteBtn();
    }
}
