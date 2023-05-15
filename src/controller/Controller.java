/*
RESUMO      : Classe de leitura e análise do arquivo solicitado
PROGRAMADORA: Luiza Felix
DATA        : 15/05/2023
 */

package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
	
	public static void fruta() throws IOException {
		File arquivo = new File("C:\\sistemas operacionais i\\generic_food.csv");
		
		FileInputStream fluxo = new FileInputStream(arquivo);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		linha = buffer.readLine();
		System.out.println("FOOD NAME \t SCIENTIFIC NAME \t FRUIT SUBGROUP");
		
		while(linha!=null) {
			String[] alimento = linha.split(",");
			if (alimento[2].equals("Fruits")) {
				System.out.println(alimento[0]+ " \t " + alimento[1] + " \t " + alimento[3]);
			}
			linha = buffer.readLine();
		}
		buffer.close();
		leitor.close();
		fluxo.close();
		
		
	}
	
}
