package porcentagem;
import java.util.Scanner;

public class Problema01 {

    static double tipo1 = 1.5, tipo2 = 3.0, tipo3 = 5.0;

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			int tipo, codigo, qtd0 = 0, qtd = 0, qtd1 = 0, qtdTotal = 0;
			double porcentagem = 0, consumido, custoTotal, soma0 = 0, soma = 0, soma1 = 0, media = 0;

			do {

			System.out.println("Digite o código do consumidor: ");
			        codigo = sc.nextInt();

			        System.out.println("Digite a quantidade consumida em KWh: ");
			        consumido = sc.nextInt();

			        System.out.println("Digite o tipo de consumidor: ");
			        tipo = sc.nextInt();

			        if (tipo == 1) {
			            qtd0 = qtd0 + 1;
			            custoTotal = tipo1 * consumido;
			            soma0 = soma0 + custoTotal;
			            System.out.println("Valor da conta do usuário " + codigo + " é: " + custoTotal);

			        } else if (tipo == 2) {
			            qtd = qtd + 1;
			            custoTotal = tipo2 * consumido;
			            soma = soma + custoTotal;
			            media = soma / qtd;
			            qtdTotal = qtd0 + qtd + qtd1;        
			            System.out.println("Valor da conta do usuário " + codigo + " é: " + custoTotal);
			        } else if (tipo == 3) {
			            qtd1 = qtd1 + 1;
			            custoTotal = tipo3 * consumido;
			            soma1 = soma1 + custoTotal;                                       
			            System.out.println("Valor da conta do usuário " + codigo + " é: " + custoTotal);
			        }

			        qtdTotal = qtd0 + qtd + qtd1;
			        porcentagem = qtd1 / qtdTotal * 100.0f;

			        System.out.println("Total tipo 1: " + soma0);
			        System.out.println("Total tipo 2: " + soma);
			        System.out.println("Total tipo 3: " + soma1);
			        System.out.println("Media custo tipo 2: " + media);
			        System.out.println("Tipo 3 (em porcentagem): " + porcentagem + "%");

			      }  while (codigo != 0);
		}        

        }

    }
