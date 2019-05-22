package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.cuerposEnCeldas.Bomberman;
import gradle.cucumber.cuerposEnCeldas.Melamina;
import gradle.cucumber.cuerposEnCeldas.Pared;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BombermanSeMueveEntreCeldasSteps {
    private Celda celdaAnterior = new Celda();
    private Celda nuevaCelda = new Celda();
    private Celda celdaPared = new Celda();
    private Pared paredMelamina = new Melamina(celdaPared);
    private Bomberman bomberman = new Bomberman(celdaAnterior);

    @Given("^un Bomberman con una celda vacia al \"([^\"]*)\"$")
    public void un_Bomberman_con_una_celda_vacia_al(String dir) {
        celdaAnterior.setCeldaAl(dir,nuevaCelda);
    	//bomberman = new Bomberman(celdaAnterior);
    }

    @When("^Bomberman se mueve al \"([^\"]*)\"$")
    public void bomberman_se_mueve_al(String dir) {
        bomberman.moverAl(dir);
    }

    @Then("^Bomberman cambia su posicion$")
    public void bomberman_cambia_su_posicion() {
		
        assertTrue(celdaAnterior.getCuerpoActual() == null);
        assertTrue(nuevaCelda.getCuerpoActual() != null);

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


    @Given("^un bomberman con una celda ocupada por una pared ubicada al \"([^\"]*)\"$")
    public void un_bomberman_con_una_celda_ocupada_por_una_pared_ubicada_al(String dir) {
        celdaAnterior.setCeldaAl(dir,celdaPared);
    }

    @Then("^Bomberman no cambia de celda$")
    public void bomberman_no_cambia_de_celda() {
        assertTrue(celdaAnterior.getCuerpoActual() != null);
        assertTrue(nuevaCelda.getCuerpoActual() == null);
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
