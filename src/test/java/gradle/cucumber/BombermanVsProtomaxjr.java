package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.ProtoMaxJr;
import gradle.cucumber.cuerposEnCeldas.Bomberman;

import static junit.framework.TestCase.assertTrue;

public class BombermanVsProtomaxjr<poder> {
    private Bomberman bomberman;
    private ProtoMaxJr protomaxjr;
    private poder poder;


    @Given("un Bomberman y un Proto Max Jr")
    public void un_bomberman_y_un_proto_max_jr(String dir) {
        bomberman = new Bomberman(new Celda());
        protomaxjr = new ProtoMaxJr();
    }

    @When("Bomberman suelta una bomba")
    public void bomberman_suelta_una_bomba(String tiempo) {
        bomberman.dejarBomba(Integer.parseInt(tiempo));
    }

    @Then("Proto Max Jr muere y suelta un poder")
    public void proto_max_jr_muere_y_suelta_un_poder() {

        Celda celdaActual = new Celda();
        assertTrue(celdaActual.getCuerpoActual().getClass() == poder);

    }
}
