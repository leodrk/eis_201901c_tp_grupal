package gradle.cucumber;

import cucumber.api.PendingException;
import gradle.cucumber.cuerposEnCeldas.Bagulaa;
import gradle.cucumber.cuerposEnCeldas.Bomberman;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BombermanMataABagulaa {
    Celda celdaAlSur = new Celda();
    Celda celdaAnterior = new Celda();
    Celda celdaNueva = new Celda();
    Bomberman bomberman;
    Bagulaa bagulaa;

    @Given("^un Bomberman suelta una bomba para matar a bagulaa que se encuentre al \"([^\"]*)\"$")
    public void unBombermanSueltaUnaBombaParaMatarABagulaaQueSeEncuentreAl(String arg0) {

        bomberman = new Bomberman(celdaAnterior);
        bagulaa = new Bagulaa(celdaNueva);
        celdaAnterior.setCeldaAl(arg0, celdaNueva);

    }

    @When("^Cuando suelta la bomba de \"([^\"]*)\" ticks , se mueve al \"([^\"]*)\" y explota la bomba$")
    public void cuando_Bagulaa_se_encuentra_en_la_celda(String tiempo, String dir) {
        bomberman.dejarBomba(Integer.parseInt(tiempo));
        celdaAnterior.setCeldaAl(dir, celdaAlSur);
        bomberman.moverAl(dir);
    }


    @Then("^Bagulaa muere$")
    public void bagulaa_muere() {

        assertTrue(celdaNueva.getCuerpoActual().getClass() == Bagulaa.class);
        //Por ahora esta es mi unica forma de hacer explotar una bomba
        for (int i = 2; i >= 0; i--) {
            celdaAnterior.tick();
        }

        assertTrue(celdaNueva.getCuerpoActual() == null);
        assertTrue(celdaAnterior.getBombaActual() == null);
    }

    @Given("^Bomberman suelta una bomba para matar a bagulaa que se encuentra al \"([^\"]*)\"$")
    public void bombermanSueltaUnaBombaParaMatarABagulaaQueSeEncuentraAl(String arg0) {
        bomberman = new Bomberman(celdaAnterior);
        bagulaa = new Bagulaa(celdaNueva);
        celdaAnterior.setCeldaAl(arg0, celdaNueva);
    }

    @When("^se mueve al \"([^\"]*)\" y la bomba explota luego de \"([^\"]*)\"ticks\" y mata a bagulaa$")
    public void seMueveAlYLaBombaExplotaLuegoDeTicksYMataABagulaa(String dir, String tiempo)  {
        bomberman.dejarBomba(Integer.parseInt(tiempo));
        celdaAnterior.setCeldaAl(dir, celdaAlSur);
        bomberman.moverAl(dir);
        //Por ahora esta es mi unica forma de hacer explotar una bomba
        for (int i = 2; i >= 0; i--) {
            celdaAnterior.tick();
        }


    }

    @Then("^Bomberman obtiene poder$")
    public void bombermanObtienePoder() {
        assertTrue(celdaNueva.getCuerpoActual() == null);
        assertTrue(celdaAnterior.getBombaActual() == null);
        assertTrue (bomberman.puedeObtenerPoderLanzarBombas(bagulaa));

    }
}





