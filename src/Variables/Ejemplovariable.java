package Variables;

public class Ejemplovariable {
    public static void main(String[] args) {

        String saludar = "Hola Mundo";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase(): " + saludar.toUpperCase());

        int numero = 10;
        int numero2 = 5;
        boolean valor = true;
        if (valor) {
            System.out.println("numero: " + numero);
            numero2 = 10;
        }
        System.out.println("numero: " + numero2);

        var numero3 = "15";
    }
}
