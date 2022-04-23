//Client
public class TestMain{

    private Console console;
    private Control control;

    public TestMain(AbstractFactory abstractFactory){
        this.console = abstractFactory.createConsole();
        this.control = abstractFactory.createControl();
    }

    public void make() {
        console.make();
        control.make();
    }

    public static void main(String[] args){
        System.out.println("**********************************");
        System.out.println("Ejemplo de Patrón Abstract Factory");
        System.out.println("**********************************");

        TestMain app;
        AbstractFactory abstractFactory;

        //abstractFactory = new NintendoFactory();
        //app = new TestMain(abstractFactory);

        abstractFactory = new PlaystationFactory();
        app = new TestMain(abstractFactory);

        app.make();
    }
}
