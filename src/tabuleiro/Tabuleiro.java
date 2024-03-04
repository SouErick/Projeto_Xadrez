package tabuleiro;

public class Tabuleiro {
	private Integer linhas;
	private Integer colunas;
	private Peca[][] pecas;
	public Tabuleiro(Integer linhas, Integer colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro na ciração do tabuleiro: Deve ter ao menos 1 linha e 1 coluna.");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	public Integer getLinhas() {
		return linhas;
	}
	public Integer getColunas() {
		return colunas;
	}
	public Peca peca(Integer linha, Integer coluna) {
		if(!ExistePosicao(linha, coluna)) {
			throw new TabuleiroException("Posição não está no tabuleiro.");
		}
		return pecas[linha][coluna];
	}
	public Peca peca(Posicao posicao) {
		if(!ExistePosicao(posicao)) {
			throw new TabuleiroException("Posição não está no tabuleiro.");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	public void lugarPeca(Peca peca, Posicao posicao) {
		if(ExistePeca(posicao)) {
			throw new TabuleiroException("Já existe uma peça na posição. " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	private boolean ExistePosicao(Integer linha, Integer coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	public boolean ExistePosicao(Posicao posicao) {
		return ExistePosicao(posicao.getLinha(), posicao.getColuna());
	}
	public boolean ExistePeca(Posicao posicao) {
		if(!ExistePosicao(posicao)) {
			throw new TabuleiroException("Posição não está no tabuleiro.");
		}
		return peca(posicao) != null;
	}
	
}
