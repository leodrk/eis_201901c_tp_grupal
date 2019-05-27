package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.cuerposEnCeldas.Acero;
import gradle.cucumber.cuerposEnCeldas.Bagulaa;
import gradle.cucumber.cuerposEnCeldas.Bomberman;
import gradle.cucumber.cuerposEnCeldas.LanzarBombas;

import static junit.framework.TestCase.assertTrue;

public class BombermanObtienePoderDeBagulaaSteps {
    private Bomberman bomberman;
    private Bagulaa bagulaa;
    private Celda celdaSegura = new Celda();
    private Acero acero;
    private Celda celdaCentral = new Celda();
    private Celda celdaAlNorte3 = new Celda();
    private Celda celdaAlNorte2 = new Celda();
    private Celda celdaAlNorte1 = new Celda();

    @Given("^un bomberman que tiene a un enemigo Bagulaa en una celda contigua al \"([^\"]*)\"$")
    public void un_bomberman_que_tiene_a_un_enemigo_Bagulaa_en_una_celda_contigua_al(String dir) {
        bagulaa = new Bagulaa(celdaAlNorte1);
        celdaCentral.setCeldaAl(dir, celdaAlNorte1);

        bomberman = new Bomberman(celdaCentral);
        bomberman.dejarBomba(1);
        acero = new Acero(celdaAlNorte2);
        celdaAlNorte2.setCuerpoActual(acero);
        celdaAlNorte1.setCeldaAl("Norte", celdaAlNorte2);
        celdaAlNorte2.setCeldaAl("Norte", celdaAlNorte3);
    }

    @When("^bomberman suelta una bomba que destruye a Bagulaa$")
    public void bomberman_suelta_una_bomba_que_destruye_a_Bagulaa() {
        bomberman.setCeldaActual(celdaSegura);
        celdaCentral.tick();
    }

    @Then("^bomberman se mueve a la celda del norte y obtiene el poder de Lanzar Bombas$")
    public void bomberman_se_mueve_a_la_celda_del_norte_y_obtiene_el_poder_de_Lanzar_Bombas() {
        bomberman.setCeldaActual(celdaCentral);
        bomberman.moverAl("Norte");
        assertTrue(bomberman.getPoder().getClass().equals(LanzarBombas.class));
    }
}
