package aplication;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		PartidaXadrez partida = new PartidaXadrez();
		UI.printTabuleiro(partida.getPecas());
	}

}
