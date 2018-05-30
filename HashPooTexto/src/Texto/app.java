package Texto;

import java.util.ArrayList;
import java.util.Scanner;



public class app {

	private static Scanner a;
	private static Scanner aa;

	public static void main(String[] args) {

		

		a = new Scanner(System.in);
		aa = new Scanner(System.in);
		int aux = 0;
		System.out.println(
				"Bonus, Defina uma lista de stopwords e retire-as antes de inserir nas estruturas escolhidas.");
		System.out.println("Digite o número de stopwords que você deseja");
		int a9;
		String a10;
		ArrayList<String> stopword = new ArrayList<String>();
		a9 = aa.nextInt();
		for (int i = 0; i < a9; i++) {
			System.out.println("Digite a " + (i + 1) + "ª" + " palavra");
			a10 = a.nextLine();
			a10 = a10.toLowerCase();
			stopword.add(a10);
		}

		lertexto.pegatexto(stopword);
		
		for (int i=1;i<11;i++) {
			listas.listartodas2().clear();
			for (int j =0;j<listas.listartodas(i).size();j++) {
		listas.adicionarpalavra(listas.listartodas(i).get(j));
					
		listas.adicionarmap(i, listas.clone(listas.listartodas2()));
		
		}
		}
		//for (int i=1;i<listas.listarmap().size()+1;i++) {
		//	System.out.print(i);
		//System.out.println(listas.listarmap().get(i));
		//}
		//for (int i =1;i<11;i++) {
		//	System.out.println("Texto "+i+": "+listas.listartodas(i));
	//	}
		System.out.println("Qual o número da questão que você quer fazer?");
		System.out.println("1)Dada uma palavra qualquer, em quais arquivos esta palavra aparece?\r\n"
				+ "2)Dadas duas palavras quaisquer, quais são os arquivos que contém as duas palavras? E três palavras?\r\n"
				+ "3)Dado um arquivo qualquer mostrar quais as palavras que aparecem neste arquivo com suas frequencias.\r\n"
				+ "4)Dados dois arquivos, quais as palavras que aparecem em ambos os arquivos?");
		String a0;
		a0 = a.nextLine();

		if (a0.equals("1")) {

			System.out.println(
					"1) Dada uma palavra qualquer, em quais arquivos esta palavra aparece?\n Digite a Palavra:\n");
			String a1;
			a1 = a.nextLine();
			a1 = a1.toLowerCase();
			for (int j = 1; j < 11; j++) {

				if (listas.procurasetem(a1, j) == true) {
					System.out.println("Esta no arquivo " + j);
					aux = aux + 1;

				}

			}
			if (aux == 0) {
				System.out.println("Palavra não encontrada em nenhum texto");
			}
		}

		if (a0.equals("2")) {
			System.out.print(
					"2) Dadas duas palavras quaisquer, quais são os arquivos que contém as duas palavras? E três palavras?\n Quantas palavras você vai usar? 2 ou 3?:\n");
			String a2;
			a2 = a.nextLine();
			if (a2.equals("2")) {
				System.out.println("Digite a primeira palavra");
				String a3;
				a3 = a.nextLine();
				a3 = a3.toLowerCase();
				System.out.println("Digite a segunda palavra");
				String a4;
				a4 = a.nextLine();
				a4 = a4.toLowerCase();
				for (int j = 1; j < 11; j++) {
					if (listas.procurasetem(a3, j) == true && listas.procurasetem(a4, j) == true) {
						System.out.println("O arquivo " + j + " contém as 2 palavras");
						aux = aux + 1;
					}
				}
			}
			if (a2.equals("3")) {
				System.out.println("Digite a primeira palavra");
				String a3;
				a3 = a.nextLine();
				a3 = a3.toLowerCase();
				System.out.println("Digite a segunda palavra");
				String a4;
				a4 = a.nextLine();
				a4 = a4.toLowerCase();
				System.out.println("Digite a terceira palavra");
				String a5;
				a5 = a.nextLine();
				a5 = a5.toLowerCase();
				for (int j = 1; j < 11; j++) {
					if (listas.procurasetem(a3, j) == true && listas.procurasetem(a4, j) == true
							&& listas.procurasetem(a5, j) == true) {
						System.out.println("O arquivo " + j + " contém as 3 palavras");
						aux = aux + 1;
					}
				}
			}
			if (aux == 0) {
				System.out.println("Nenhum texto contém as palavras simultaneamente");
			}
		}

		if (a0.equals("3")) {
			System.out.println(
					"3) Dado um arquivo qualquer mostrar quais as palavras que aparecem neste arquivo com suas frequencias.");
			System.out.println("Digite qual arquivo você quer");
			int a6;
			a6 = aa.nextInt();
			System.out.println("No texto " + a6);
			System.out.println(listas.frequencia(a6));

		}
		if (a0.equals("4")) {
			System.out.println("4) Dados dois arquivos, quais as palavras que aparecem em ambos os arquivos?");
			System.out.println("Digite o número do primeiro arquivo:");
			int a7;
			a7 = aa.nextInt();
			System.out.println("Digite o número do segundo arquivo:");
			int a8;
			a8 = aa.nextInt();
			System.out.println(listas.temnos2(a7, a8));
		}

	}

}
