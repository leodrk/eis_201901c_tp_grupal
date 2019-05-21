package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuerpo {
    protected Celda celdaActual;
    protected List<Celda> celdasAlNorte= new ArrayList<>();
    protected List<Celda> celdasAlSur = new ArrayList<>();
    protected List<Celda> celdasAlEste = new ArrayList<>();
    protected List<Celda> celdasAlOeste = new ArrayList<>();

    public Celda getCeldaActual() {
        return celdaActual;
    }

    public void setCeldaActual(Celda celdaActual) {
        this.celdaActual = celdaActual;
    }

    public List<Celda> getCeldasAlNorte() {
        return celdasAlNorte;
    }

    public void setCeldasAlNorte(List<Celda> celdasAlNorte) {
        this.celdasAlNorte = celdasAlNorte;
    }

    public List<Celda> getCeldasAlSur() {
        return celdasAlSur;
    }

    public void setCeldasAlSur(List<Celda> celdasAlSur) {
        this.celdasAlSur = celdasAlSur;
    }

    public List<Celda> getCeldasAlEste() {
        return celdasAlEste;
    }

    public void setCeldasAlEste(List<Celda> celdasAlEste) {
        this.celdasAlEste = celdasAlEste;
    }

    public List<Celda> getCeldasAlOeste() {
        return celdasAlOeste;
    }

    public void setCeldasAlOeste(List<Celda> celdasAlOeste) {
        this.celdasAlOeste = celdasAlOeste;
    }
}
