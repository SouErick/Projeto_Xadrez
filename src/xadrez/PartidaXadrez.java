package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicioJogo();
	}
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for(int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	private void lugarPecaNova(char coluna, Integer linha, PecaXadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	private void inicioJogo() {
		lugarPecaNova('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		lugarPecaNova('e', 8, new Rei(tabuleiro, Cor.PRETO));
		lugarPecaNova('e', 1, new Torre(tabuleiro, Cor.BRANCO));
	}
}
