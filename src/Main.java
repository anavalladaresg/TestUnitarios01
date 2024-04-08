import librerias.Entrada;
import librerias.Salida;

public class Main {

    public static void main(String[] args) {

        final int operacion = Entrada.Seleccion_entrada("Elija la operación a realizar: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n", 1);
        int a;
        int b;

        /*Menú de opciones para el usuario*/
        switch (operacion) {
            case 1:
                Suma suma = new Suma();
                a = Entrada.Seleccion_entrada("Primer número a sumar: ", 1);
                b = Entrada.Seleccion_entrada("Segundo número a sumar: ", 1);
                Entrada.datos = suma.sumar(a, b);
                Salida.Seleccion_salida(1);
                break;
            case 2:
                Resta resta = new Resta();
                a = Entrada.Seleccion_entrada("Primer número a restar: ", 1);
                b = Entrada.Seleccion_entrada("Segundo número a restar: ", 1);
                Entrada.datos = resta.restar(a, b);
                Salida.Seleccion_salida(1);
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                a = Entrada.Seleccion_entrada("Primer número a multiplicar: ", 1);
                b = Entrada.Seleccion_entrada("Segundo número a multiplicar: ", 1);
                Entrada.datos = multiplicacion.multiplicar(a, b);
                Salida.Seleccion_salida(1);
                break;
            case 4:
                Division division = new Division();
                a = Entrada.Seleccion_entrada("Primer número a dividir: ", 2);
                b = Entrada.Seleccion_entrada("Segundo número a dividir: ", 2);
                Entrada.datos = division.dividir(a, b);
                Salida.Seleccion_salida(1);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}