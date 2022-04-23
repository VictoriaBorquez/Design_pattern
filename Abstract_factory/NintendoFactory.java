//Concrete Factory 1
public class NintendoFactory implements AbstractFactory{
    @Override
    public Control createControl(){
        return new NintendoControl();
    }

    @Override
    public Console createConsole(){
        return new NintendoConsole();
    }
}
