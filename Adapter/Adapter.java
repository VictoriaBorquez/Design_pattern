//Adapter
//Comentario para commit
public class Adapter implements InformationTemperature{
    private CelciusInformation celciusInformation;


    public Adapter() {
        celciusInformation = new CelciusInformation();
    }

    @Override
    public double getTemperatureInCelsius(){
        return celciusInformation.getTemperature();
    }

    @Override
    public void setTemperatureInCelsius(double temperatureInCelsius){
        celciusInformation.setTemperature(temperatureInCelsius);
    }

    @Override
    public double getTemperatureInFahrenheit(){
        return celsiusToFahrenheit(celciusInformation.getTemperature());
    }

    @Override
    public void setTemperatureInFahrenheit(double temperatureInFahrenheit){
        celciusInformation.setTemperature(fahrenheitToCelsius(temperatureInFahrenheit));
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    private double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9 / 5) + 32);
    }

}
