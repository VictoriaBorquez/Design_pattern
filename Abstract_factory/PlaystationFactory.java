//Concrete Factory 2
public class PlaystationFactory implements AbstractFactory{
    @Override
    public Control createControl(){
        return new PlaystationControl();
    }

    @Override
    public Console createConsole(){
        return new PlaystationConsole();
    }
}
