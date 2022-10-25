package br.com.bufunfatech;

public class Investimento {
	int idInvestimento;
	String descricao;
	String dataTransacao;
	double saldo;
	
	public int getIdInvestimento() {
		return idInvestimento;
	}
	public void setIdInvestimento(int idInvestimento) {
		this.idInvestimento = idInvestimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Investimento [idInvestimento=" + idInvestimento + ", descricao=" + descricao + ", dataTransacao="
				+ dataTransacao + ", saldo=" + saldo + "]";
	}
}
