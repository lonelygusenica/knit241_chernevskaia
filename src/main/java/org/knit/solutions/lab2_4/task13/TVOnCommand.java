package org.knit.solutions.lab2_4.task13;

public class TVOnCommand implements Command {
    private final TV tv;
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
    }
    @Override
    public void undo() {
        tv.off();
    }
}

