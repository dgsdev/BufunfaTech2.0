package br.com.bufunfatech;

public class Receita {
	int idReceita;
	String descricao;
	double valor;
	
	public int getIdReceita() {
		return idReceita;
	}
	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Receita [idReceita=" + idReceita + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
}
