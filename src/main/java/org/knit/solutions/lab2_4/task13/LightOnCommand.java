package org.knit.solutions.lab2_4.task13;

public class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
    @Override
    public void undo() {
        light.off();
    }
}
