package aplication;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		Posicao posicao = new Posicao(3, 5);
		Tabuleiro tabuleiro = new Tabuleiro(8, 8);
		System.out.println(posicao.toString());
	}

}
