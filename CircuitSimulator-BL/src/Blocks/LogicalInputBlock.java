package Blocks;

import Ports.OutputBooleanPort;

public class LogicalInputBlock extends BlockBase {
    private OutputBooleanPort output;
    private boolean executed = false;

    public LogicalInputBlock() {
        this.output = new OutputBooleanPort();
        this.outputPorts.add(output);
    }

    @Override
    public void ProcessTick() {
        if (!executed) {
            this.executed = true;
            Execute();
        }
    }

    @Override
    public void Execute() {
        //output.Send(); // TODO
    }

}