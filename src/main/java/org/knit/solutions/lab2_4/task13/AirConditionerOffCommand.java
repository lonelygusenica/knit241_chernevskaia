package org.knit.solutions.lab2_4.task13;

public class AirConditionerOffCommand implements Command {
    private final AirConditioner ac;
    public AirConditionerOffCommand(AirConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.off();
    }
    @Override
    public void undo() {
        ac.on();
    }
}
