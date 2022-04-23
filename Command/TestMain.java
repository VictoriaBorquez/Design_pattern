//Client
public class TestMain{
    public static void main(String[] args){


        System.out.println("*************************");
        System.out.println("Ejemplo de Patrón Command");
        System.out.println("*************************");

        Invoker invoker = new Invoker();
        Wifi wifi = new Wifi();
        Command wifiOn = new WifiOnCommand(wifi);
        Command wifiOff = new WifiOffCommand(wifi);

        //wifi on
        invoker.setCommand(wifiOn);
        invoker.button();

        //wifi off
        invoker.setCommand(wifiOff);
        invoker.button();
    }
}
