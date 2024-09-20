package com.paulo.AAetec.tudoweb;

import java.util.Scanner;

public class Pesquisa_de_Opinião {
    
    /*
     * Crie um programa em Java utilizando a estrutura de repetição FOR (PARA)
     * para exibir o retorno de uma pesquisa de atendimento ao cliente. Para isso:
     * O programa deve solicitar  a digitação do nome, idade e opinião do entrevistado sobre o atendimento prestado,
     * sendo: 1-EXCELENTE, 2-BOM ou 3-RUIM. A pesquisa deve ser feita com 50 entrevistados
     *
     * e o no final, o programa deverá exibir na tela:
     * a. quantidade de respostas “EXCELENTE”
     * b. quantidade de respostas “RUIM
     *
     * Observações: utilizar a estrutura de decisão para verificação da opinião e realizar testes com 10 entrevistados.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        int opiniao;
        int quantEX = 0; // Contador para respostas "EXCELENTE"
        int quantR = 0; // Contador para respostas "RUIM"

        // Loop para realizar 10 entrevistas (testes)
        for (int i = 0; i < 10; i++) {

            System.out.println("Entre com o nome do Cliente:");
            nome = scan.next();

            System.out.println("Entre com a idade nome do Cliente:");
            idade = scan.nextInt();

            System.out.println("Qual a opnião do Cliente referente ao atendimento?  \n" +
                    "1- Exelente \n" +
                    "2- Bom \n" +
                    "3- Ruim");

            opiniao = scan.nextInt(); // Lê a opinião do cliente

            // Verifica a opinião e incrementa o contador correspondente
            if (opiniao == 1) {
                quantEX++;
            } else if (opiniao == 3) {
                quantR++;
            }
        }

        // Exibe os resultados da pesquisa
        System.out.println("A quantidade de Avaliações Exelentes foi de: " + quantEX + "\n" +
                "E a quantidade de Avaliações Ruins foi de: " + quantR);

    }
}