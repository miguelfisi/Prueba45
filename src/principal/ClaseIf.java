/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class ClaseIf {

    public static void main(String[] args) {
        String nom;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre ");
        nom = scanner.nextLine();

        if (nom.equals("miguel")) {
            System.out.println("Es un buen programdor");
        } else {

            System.out.println("no es un buen programador");
        }

    }

}
