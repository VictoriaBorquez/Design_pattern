//Command1
public class WifiOnCommand implements Command{

    private Wifi wifi;

    public WifiOnCommand(Wifi wifi){
        this.wifi = wifi;
    }
    @Override
    public void execute(){
        wifi.wifiOn();
    }
}
