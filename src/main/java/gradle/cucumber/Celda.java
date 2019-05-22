package gradle.cucumber;

import gradle.cucumber.cuerposEnCeldas.Bomba;
import gradle.cucumber.cuerposEnCeldas.Cuerpo;

public class Celda {
    private Cuerpo cuerpoActual;
    private Bomba bombaActual;
    private Celda celdaAlNorte;
    private Celda celdaAlSur;
    private Celda celdaAlEste;
    private Celda celdaAlOeste;

	public Celda getCeldaAlSur() {
		return celdaAlSur;
	}

	public void setCeldaAlSur(Celda celdaAlSur) {
		this.celdaAlSur = celdaAlSur;
	}


	public Celda getCeldaAlEste() {
		return celdaAlEste;
	}


	public void setCeldaAlEste(Celda celdaAlEste) {
		this.celdaAlEste = celdaAlEste;
	}


	public Celda getCeldaAlNorte() {
		return celdaAlNorte;
	}


	public void setCeldaAlNorte(Celda celdaAlNorte) {
		this.celdaAlNorte = celdaAlNorte;
	}


	public Celda getCeldaAlOeste() {
		return celdaAlOeste;
	}


	public void setCeldaAlOeste(Celda celdaAlOeste) {
		this.celdaAlOeste = celdaAlOeste;
	}
	
	public void setCeldaAl(String dir, Celda celda) {
		switch(dir) {
  	  case "Sur":
  		  this.setCeldaAlSur(celda);
  		  celda.setCeldaAlNorte(this);
  	    break;
  	  case "Norte":
  		  this.setCeldaAlNorte(celda);
  		  celda.setCeldaAlSur(this);
  	    break;
  	  case "Este":
  		  this.setCeldaAlEste(celda);
  		  celda.setCeldaAlOeste(this);
    	    break;
  	  case "Oeste":
  		  this.setCeldaAlOeste(celda);
  		  celda.setCeldaAlEste(this);
    	    break;
  	}
	}


	public Cuerpo getCuerpoActual() {
		return cuerpoActual;
	}


	public void setCuerpoActual(Cuerpo cuerpoActual) {
		this.cuerpoActual = cuerpoActual;
	}


	public Bomba getBombaActual() {
		return bombaActual;
	}


	public void setBombaActual(Bomba bombaActual) {
		this.bombaActual = bombaActual;
	}


	public void tick() {
		this.bombaActual.restarTick();
	}


	public void destruirObjeto() {
		this.getCuerpoActual().serDestruido();
	}
}
