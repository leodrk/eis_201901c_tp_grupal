package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

import java.util.List;

public class Bomberman extends Cuerpo{
	//private Celda celdaActual;
    
	public Bomberman(Celda celdaActual) {
		this.setCeldaActual(celdaActual);
		this.getCeldaActual().setCuerpoActual(this);
	}

	public void setPosicionActual(Celda unaCelda) {
        this.setCeldaActual(unaCelda);
    }

    public void moverAl(String dir) {
		if (puedeMoverAl(dir))
		{
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
    	}}

    }

	private boolean puedeMoverAl(String dir) {
		boolean result = false;

		switch(dir) {
			case "Sur":
				result = this.getCeldaActual().getCeldaAlSur().sePuedeMoverAca();
				break;
			case "Norte":
				result = this.getCeldaActual().getCeldaAlNorte().sePuedeMoverAca();
				break;
			case "Este":
				result = this.getCeldaActual().getCeldaAlEste().sePuedeMoverAca();
				break;
			case "Oeste":
				result = this.getCeldaActual().getCeldaAlOeste().sePuedeMoverAca();
				break;}
		return result;
	}

	public void dejarBomba(int ticks) {
		
		this.getCeldaActual().setBombaActual(new Bomba(ticks, this.getCeldaActual()));
	}


	@Override
	public boolean sePuedeAtravezar() {
		return true;
	}
}
