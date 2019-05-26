package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public abstract class Cuerpo {

	public  Cuerpo (Celda celdaActual) {
		this.setCeldaActual(celdaActual);
		this.getCeldaActual().setCuerpoActual(this);
	}

	public Celda celdaActual;

	public Celda getCeldaActual() {
		return celdaActual;
	}

	public void setCeldaActual(Celda celdaActual) {
		this.celdaActual = celdaActual;
		celdaActual.setCuerpoActual(this);
	}

	public abstract void serDestruido();

	public abstract boolean sePuedeAtravezar(Bomberman bomberman);



}
