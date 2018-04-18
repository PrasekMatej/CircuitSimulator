package Blocks;

import Data.NumericData;
import Ports.InputNumericPort;
import Ports.OutputNumericPort;

public class DividerBlock extends BlockBase {

    private InputNumericPort input1;
    private InputNumericPort input2;
    private OutputNumericPort output;

    public DividerBlock() {
        this.input1 = new InputNumericPort();
        this.input2 = new InputNumericPort();
        this.output = new OutputNumericPort();
        this.inputPorts.add(input1);
        this.inputPorts.add(input2);
        this.outputPorts.add(output);
    }

    @Override
    public void Execute() {     // TODO division by zero exception
        double result = input1.DownloadData().Data / input2.DownloadData().Data;
        output.Send(new NumericData(result));

    }

}
