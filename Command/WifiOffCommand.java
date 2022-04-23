//Command2
public class WifiOffCommand implements Command{

    private Wifi wifi;

    public WifiOffCommand(Wifi wifi){
        this.wifi = wifi;
    }
    @Override
    public void execute(){
        wifi.wifiOff();
    }
}
