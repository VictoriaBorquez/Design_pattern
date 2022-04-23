//Invoker
public class Invoker{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public Command getCommand(){
        return this.command;
    }

    public void button(){
        this.command.execute();
    }

}
