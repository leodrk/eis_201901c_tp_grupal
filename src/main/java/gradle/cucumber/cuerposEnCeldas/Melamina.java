package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class Melamina extends Pared{

	public Melamina(Celda celdaActual) {
		this.setCeldaActual(celdaActual);
		this.getCeldaActual().setCuerpoActual(this);
	}

	@Override
	public void serDestruido() {
		this.getCeldaActual().setCuerpoActual(null);
	}
}
