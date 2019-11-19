package command.controller;

public class Tv {
    private boolean powerOn = false;
    private boolean muteOn = false;

    public void power() {
        this.powerOn = !this.powerOn;
        if (powerOn)
            System.out.println("Power On");
        else
            System.out.println("Power Off");
    }

    public void mute() {
        if (!powerOn)
            return;
        this.muteOn = !this.muteOn;
        if (muteOn)
            System.out.println("Mute On");
        else
            System.out.println("Mute Off");
    }

}
