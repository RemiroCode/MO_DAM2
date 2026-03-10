public class SumaEnv {
    public static void main(String[] args) {
        // Leemos las variables de entorno NUM1 y NUM2
        String val1 = System.getenv("NUM1");
        String val2 = System.getenv("NUM2");

        if (val1 == null || val2 == null) {
            System.out.println("Error: Debes pasar las variables de entorno NUM1 y NUM2.");
            return;
        }

        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);
        System.out.println("La suma calculada desde variables de entorno es: " + (num1 + num2));
    }
}
