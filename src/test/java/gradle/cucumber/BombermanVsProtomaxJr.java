package gradle.cucumber;

import gradle.cucumber.cuerposEnCeldas.Bomberman;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.cuerposEnCeldas.Melamina;
import gradle.cucumber.cuerposEnCeldas.Ninguno;
import gradle.cucumber.cuerposEnCeldas.ProtoMaxJr;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BombermanVsProtomaxJr<poder, tiempo> {

    private Bomberman bomberman;
    private ProtoMaxJr protoMaxJr;
    private poder poder;
    private tiempo tiempo;
    private Celda celdaAnterior = new Celda();
    private Celda celdaNueva = new Celda();
    private Melamina melamina;
    private Celda celdaCentral = new Celda();
    private Celda celdaAlEste3 = new Celda();
    private Celda celdaAlOeste3 = new Celda();
    private Celda celdaAlSur3 = new Celda();
    private Celda celdaAlNorte3 = new Celda();
    private Celda celdaAlNorte = new Celda();
    private Celda celdaAlNorte2 = new Celda();
    private Celda celdaAlNorte1 = new Celda();

    @Given("^Bomberman suelta bomba y alcanza a Proto Max Jr$")
    public void bomberman_suelta_bomba_y_alcanza_a_proto_max_jr() {
        bomberman = new Bomberman(new Celda());
        protoMaxJr = new ProtoMaxJr(new Celda());
        bomberman.dejarBomba();
    }

    @When("Proto Max Jr suelta un poder")
    public void proto_max_jr_suelta_un_poder(){
        protoMaxJr.dejarPoder();
    }


    @Then("Bomberman puede saltar todo tipo de poder")
    public void bomberman_puede_saltar_todo_tipo_de_poder() {
        bomberman.saltarPared();
    }

}


