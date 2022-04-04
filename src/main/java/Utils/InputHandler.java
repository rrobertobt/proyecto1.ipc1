package Utils;

import java.util.Scanner;

public class InputHandler {
    static Scanner input = new Scanner(System.in);

    public static int askNumberRange(int lMin, int lMax) {
        int enteredNumber = 0;
        boolean inputError;

        do {
            try {
                enteredNumber = input.nextInt();
                if ((enteredNumber >= lMin) && (enteredNumber <= lMax)) {
                    inputError = false;
                } else {
                    inputError = true;
                    System.out.println("El valor ingresado debe ser entre " + lMin + " y " + lMax);
                    System.out.println("Intenta de nuevo");
                }

            } catch (Exception ex) {
                inputError = true;
                System.out.println("El valor ingresado no es valido, intenta de nuevo");
                input.next();

            }

        } while (inputError);
        return enteredNumber;
    }

    public static int askNumber(String message) {
        int enteredNumber = 0;
        boolean inputError;

        do {
            try {
                System.out.print(message);
                enteredNumber = input.nextInt();
                inputError = false;

            } catch (Exception ex) {
                inputError = true;
                System.out.println("El valor ingresado no es valido, intenta de nuevo");
                input.next();

            }

        } while (inputError);
        return enteredNumber;
    }

}
