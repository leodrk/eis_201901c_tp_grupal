package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

import java.util.List;

public class Bomberman extends Cuerpo{
	private Celda celdaActual;
    
	public Bomberman(Celda celdaActual) {
		this.setCeldaActual(celdaActual);
		this.getCeldaActual().setCuerpoActual(this);
	}

	public void setPosicionActual(Celda unaCelda) {
        this.setCeldaActual(unaCelda);
    }

    public void moverAl(String dir) {
    	this.getCeldaActual().setCuerpoActual(null);
    	switch(dir) {
    	  case "Sur":
    	    this.setCeldaActual(this.getCeldaActual().getCeldaAlSur());
    	    break;
    	  case "Norte":
		  this.setCeldaActual(this.getCeldaActual().getCeldaAlNorte());
    	    break;
    	  case "Este":
		  this.setCeldaActual(this.getCeldaActual().getCeldaAlEste());
      	    break;
    	  case "Oeste":
		  this.setCeldaActual(this.getCeldaActual().getCeldaAlOeste());
      	    break;
    	}
    }

	public void dejarBomba(int ticks) {
		
		this.getCeldaActual().setBombaActual(new Bomba(ticks, this.getCeldaActual()));
	}


}
