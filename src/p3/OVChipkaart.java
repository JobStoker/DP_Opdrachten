package p3;

import java.util.Date;

public class OVChipkaart {
	private int nummer;
	private Date geldigTot;
	private int klasse;
	private double saldo;
	private int id;
	
	public void setKaartNummer(int nr) {
		nummer = nr;
	}
	
	public int getKaartNummer() {
		return nummer;
	}
	
	public void setGeldigTot(Date geldigTot) {
		geldigTot = geldigTot;
	}
	
	public Date getGeldigTot() {
		return geldigTot;
	}
	
	public void setKlasse(int klasse) {
		klasse = klasse;
	}
	
	public int getKlasse() {
		return klasse;
	}
	
	public void setSaldo(double sld) {
		saldo = sld;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setId(int reizigerid) {
		id = reizigerid;
	}
	
	public int getId() {
		return id;
	}
}