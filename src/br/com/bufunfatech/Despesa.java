package br.com.bufunfatech;

public class Despesa {
	int idDespesa;
	String descricao;
	double valor;
	
	public int getIdDespesa() {
		return idDespesa;
	}
	public void setIdDespesa(int idDespesa) {
		this.idDespesa = idDespesa;
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
		return "Despesa [idDespesa=" + idDespesa + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
}
