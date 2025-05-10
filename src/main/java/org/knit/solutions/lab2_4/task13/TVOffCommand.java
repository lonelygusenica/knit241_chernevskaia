package org.knit.solutions.lab2_4.task13;

public class TVOffCommand implements Command {
    private final TV tv;
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.off();
    }
    @Override
    public void undo() {
        tv.on();
    }
}
