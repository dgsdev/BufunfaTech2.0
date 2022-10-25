package br.com.bufunfatech;

public class Transacao {
	int idTransacao ;
	String descricao;        
    String dataTransacao;
    double saldo;
    
    public Transacao() {
    	
    }
    
    public Transacao(
    		int idTransacao, 
    		String descricao, 
    		String dataTransacao, 
    		double saldo) {    	
    	super();
    	this.idTransacao = idTransacao;
    	this.descricao = descricao;
    	this.dataTransacao = dataTransacao;
    	this.saldo = saldo;
    }
    
    public int getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
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
		return "Transacao [idTransacao=" + idTransacao + ", descricao=" + descricao + ", dataTransacao=" + dataTransacao
				+ ", saldo=" + saldo + "]";
	}		
}
