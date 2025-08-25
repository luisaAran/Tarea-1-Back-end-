/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.Scanner;
/**
 *
 * @author LUISA ARANGO
 */
public class Tarea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una secuencia de números:");
        String entrada = scanner.nextLine();

        int[] numeros = new int[10]; // Para dígitos 0-9

        for (char c : entrada.toCharArray()) {
            if (Character.isDigit(c)) {
                numeros[c - '0']++;
            }
        }

        System.out.println("Conteo de números:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println("'" + i + "' aparece " + numeros[i] + " veces.");
            }
        }
    }
}
    

