package com.paulo.AAetec.tudoweb;

public class Atividade_Facultativa_Tabuada {
	
	/*
	 * Giovanna adora usar computador, navegar na internet e matemática. Ela decidiu
	 * estudar tabuada devido a sua dificuldade durante o período de aula (ela
	 * apenas sabe as tabuadas dos números 0 até 05).
	 * 
	 * Ao navegar na internet, aprendeu a desenvolver alguns algoritmos e decidiu
	 * desenvolver algo para ajudá-la em seus estudos com tabuada.
	 * 
	 * Escreva para Giovanna um Programa em Java da Tabuada dos números 6 até 10.
	 * 
	 */

	public static void main(String[] args) {
		
		 // Loop para as tabuadas de 6 até 10
        for (int numero = 6; numero <= 10; numero++) {
            System.out.println("Tabuada do " + numero + ":");

            // Loop para calcular e imprimir a tabuada
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            System.out.println(); // Imprime uma linha em branco para separar as tabuadas
        }
	}

}
