package com.generation;
import java.util.Scanner; // Importa la clase Scanner para usarla

public class Ejercicio4 {
	//El siguiente codigo es para un juego de piedra, papel y tijera entre dos jugadores
    public static void main(String[] args) { // Agrega el método main porque el codigo no contaba con uno
    
        Scanner s = new Scanner(System.in); // Se corrige la instancia del scanner
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine(); 
        
        if (j1.equals(j2)) { // Usa .equals() para comparar cadenas en lugar de == ya que en Java no se pueden comparar directamente dos Strings
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) { //Se comparan las entradar de los jugadores para establecer a un ganador
                case "piedra":
                    if (j2.equals("tijeras")) { // Cambia == por .equals() para comparar cadenas
                        g = 1;
                    }
                    break; 
                case "papel":
                    if (j2.equals("piedra")) { 
                        g = 1;
                    }
                    break; 
                case "tijeras":
                    if (j2.equals("papel")) { 
                        g = 1;
                    }
                    break; 
                default:
                    break; 
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}
