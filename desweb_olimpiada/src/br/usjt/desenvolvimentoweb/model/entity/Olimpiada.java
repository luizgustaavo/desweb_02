package br.usjt.desenvolvimentoweb.model.entity;

public class Olimpiada {
	
	private int id;
	private int ouro;
	private int prata;
	private int bronze;
	
	
	
	
	public Olimpiada() {
		
	}


	public Olimpiada(int id, int ouro, int prata, int bronze) {
		super();
		this.id =id;
		this.ouro = ouro;
		this.prata = prata;
		this.bronze = bronze;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getOuro() {
		return ouro;
	}


	public void setOuro(int ouro) {
		this.ouro = ouro;
	}


	public int getPrata() {
		return prata;
	}


	public void setPrata(int prata) {
		this.prata = prata;
	}


	public int getBronze() {
		return bronze;
	}


	public void setBronze(int bronze) {
		this.bronze = bronze;
	}


	@Override
	public String toString() {
		return "Olimpiada [id=" + id + ", ouro=" + ouro + ", prata=" + prata + ", bronze=" + bronze + "]";
	}


	
	
	
	
	
	
	

}
