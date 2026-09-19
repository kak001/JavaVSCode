package Java.src.ejercicios_java.exception_ejercicios;
public class TemperatureChecker {
    // Metodos
    public void temperatureChecker(double temp) throws CustomException {
        if (temp < -50 || temp > 50) {
            throw new CustomException("Temperatura no valida.");
        }
    }
}
