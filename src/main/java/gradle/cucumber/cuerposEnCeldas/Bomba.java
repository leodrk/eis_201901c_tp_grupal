package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class Bomba{
	
	private int ticks;
	private Celda celdaActual;

	private int getTicks() {
		return ticks;
	}

	private void setTicks(int ticks) {
		this.ticks = ticks;
	}
	
	public Bomba (int ticks, Celda celda) {
		this.ticks = ticks;
		this.celdaActual = celda;
	}

	public void restarTick() {
		this.ticks--;
		if (this.ticks <= 0) {
			this.explotar();
		}
	}

	private void explotar() {
		this.getCeldaActual().setBombaActual(null);
		//por ahora hardcodeado, solo destruye lo que esta en la celda inmediata hacia el norte de la actual
		this.getCeldaActual().getCeldaAlNorte().destruirObjeto();
	}

	public Celda getCeldaActual() {
		return celdaActual;
	}

	public void setCeldaActual(Celda celdaActual) {
		this.celdaActual = celdaActual;
	}
}
