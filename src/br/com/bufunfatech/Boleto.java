package br.com.bufunfatech;

public class Boleto {
	int idBoleto;
	String vencimento;
	String codigoBoleto;
	
	public int getIdBoleto() {
		return idBoleto;
	}
	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	public String getCodigoBoleto() {
		return codigoBoleto;
	}
	public void setCodigoBoleto(String codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}
	
	@Override
	public String toString() {
		return "Boleto [idBoleto=" + idBoleto + ", vencimento=" + vencimento + ", codigoBoleto=" + codigoBoleto + "]";
	}
}
