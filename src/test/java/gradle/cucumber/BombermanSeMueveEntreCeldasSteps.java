package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.cuerposEnCeldas.Bomberman;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BombermanSeMueveEntreCeldasSteps {
    private Celda celdsAnterior = new Celda();
    private Celda nuevaCelda = new Celda();
    private List<Celda> celdas = new ArrayList<>();
    private Bomberman bomberman = new Bomberman();


    @Given("^un Bomberman con una celda vacia al \"([^\"]*)\"$")
    public void un_Bomberman_con_una_celda_vacia_al(String dir) {
        bomberman.setPosicionActual(celdsAnterior);
        celdsAnterior.setCuerpoActual(bomberman);
        celdas.add(nuevaCelda);
        bomberman.setCeldasAl(celdas, dir);
    }

    @When("^Bomberman se mueve al \"([^\"]*)\"$")
    public void bomberman_se_mueve_al(String dir) {
        bomberman.moverAl(dir);
    }

    @Then("^Bomberman cambia su posicion$")
    public void bomberman_cambia_su_posicion() {

        assertTrue(celdsAnterior.isEmpty());
        assertTrue(bomberman.getCeldaActual().equals(nuevaCelda));

        //assertTrue(celdas.get(0).getCuerpoActual().equals(bomberman));
        //assertTrue(bomberman.getCeldasAlNorte().getCuerpoActual().equals(bomberman));


        //assertTrue(true);
       // assertEquals(bomberman.getCeldaActual() , nuevaCelda);
       // assertEquals(bomberman.getCeldaActual(),celdaAnterior);
        //   assertEquals(bomberman.getCeldaActual() , nuevaCelda);
     //   assertNotEquals(bomberman.getCeldaActual(),celdaAnterior);


       //bomberman.getPosicionActual().equals(nuevaCelda);
        //bomberman.getPosicionActual().notEquals(celdaAnterior);
    }



/*    @Given("^un Bomberman posicionado en \"([^\"]*)\"$")
    public void un_Bomberman_posicionado_en(String nombreCelda) {
        celdaAnterior.setName(nombreCelda);
        bomberman.setPosicionActual(celdaAnterior);
        celdaAnterior.setCuerpoActual(bomberman);
    }

    @Given("^hay una \"([^\"]*)\" al \"([^\"]*)\"$")
    public void hay_una_al(String nombreCelda, String dir) {
        nuevaCelda.setName(nombreCelda);
        bomberman.setCeldaAl(nuevaCelda, dir);
    }
    @When("^Bomberman se mueve al \"([^\"]*)\"$")
    public void bomberman_se_mueve_al(String dir) {
        bomberman.moverAl(dir);
    }
    @Then("^Bomberman se posiciona en la \"([^\"]*)\"$")
    public void bomberman_se_posiciona_en_la(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^la \"([^\"]*)\" esta vacia$")
    public void la_esta_vacia(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
