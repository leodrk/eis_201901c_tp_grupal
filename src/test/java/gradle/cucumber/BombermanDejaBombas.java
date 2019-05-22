package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.cuerposEnCeldas.Bomberman;
import gradle.cucumber.cuerposEnCeldas.Melamina;

import static junit.framework.TestCase.assertTrue;

public class BombermanDejaBombas {
    private Celda celdaAnterior = new Celda();
    private Celda celdaNueva = new Celda();
    private Melamina melamina;
    private Bomberman bomberman;


    @Given("^una Celda Con un Bomberman y una celda con una pared de melamina al \"([^\"]*)\"$")
    public void un_Bomberman_con_una_pared_de_melamina_al(String dir) {
		 bomberman = new Bomberman(celdaAnterior);
    	 melamina = new Melamina(celdaNueva);
    	 celdaAnterior.setCeldaAl(dir, celdaNueva);
    }

    @When("^bomberman deja una bomba de \"([^\"]*)\"$")
    public void bomberman_deja_una_bomba_de(String tiempo) {
    	bomberman.dejarBomba(Integer.parseInt(tiempo));
    }

    @Then("^la bomba explota y rompe la pared$")
    public void bomba_explota_y_rompe_pared() {
    	
    	assertTrue(celdaNueva.getCuerpoActual().getClass() == Melamina.class);
    	//Por ahora esta es mi unica forma de hacer explotar una bomba
    	for (int i =2; i >= 0; i--) {
    		celdaAnterior.tick();
    	}
    	
    	assertTrue (celdaNueva.getCuerpoActual() == null);
    	assertTrue (celdaAnterior.getBombaActual() == null);
    }
}
