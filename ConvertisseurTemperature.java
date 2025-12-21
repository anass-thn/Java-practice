class ConvertisseurTemperature {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
       
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + kelvin + "K");

        double fahrenheit2 = 77;
        double celcius2 = (fahrenheit2 - 32) * 5/9;
        System.out.println(fahrenheit2 + "°F = " + celcius2 + "°C");
    }
}