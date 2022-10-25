package br.com.bufunfatech;

public class Categoria {
	int idCategoria;
	String descricao;
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", descricao=" + descricao + "]";
	}
}
