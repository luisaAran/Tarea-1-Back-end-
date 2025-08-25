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

        boolean[] encontrado = new boolean[10];

        System.out.println("Números sin repetir:");
        for (char c : entrada.toCharArray()) {
            if (Character.isDigit(c)) {
                int digito = c - '0';
                if (!encontrado[digito]) {
                    System.out.println(digito);
                    encontrado[digito] = true;
                }
            }
        }
    }
}