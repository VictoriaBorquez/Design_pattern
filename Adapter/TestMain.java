//Client
public class TestMain{
    public static void main(String[] args) {

        System.out.println("*************************");
        System.out.println("Ejemplo de Patrón Adapter");
        System.out.println("*************************");
        InformationTemperature infoTemperatura = new Adapter();

        infoTemperatura.setTemperatureInCelsius(0);
        System.out.println("Temperatura en grados Celsius:" + infoTemperatura.getTemperatureInCelsius());
        System.out.println("Temperatura en grados Fahrenheit:" + infoTemperatura.getTemperatureInFahrenheit());

        infoTemperatura.setTemperatureInFahrenheit(64);
        System.out.println("Temperatura en grados Fahrenheit:" + infoTemperatura.getTemperatureInFahrenheit());
        System.out.println("Temperatura en grados Celsius:" + infoTemperatura.getTemperatureInCelsius());

    }
}
