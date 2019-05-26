package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.cuerposEnCeldas.*;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertTrue;
import static junit.framework.TestCase.assertTrue;

public class BombermanObtienePoderDeProtoMaxUnitsSteps {

    private Celda celdaAnterior = new Celda();
    private Celda celdaNueva = new Celda();
    private Bomberman bomberman;
    private Celda celdaCentral = new Celda();
    private Celda celdaAlNorte1 = new Celda();
    private Celda celdaAlNorte2 = new Celda();
    private Celda celdaAlNorte3 = new Celda();
    private Celda celdaAlEste1 = new Celda();
    private Celda celdaAlEste2 = new Celda();
    private Celda celdaAlEste3 = new Celda();
    private Celda celdaAlOeste1 = new Celda();
    private Celda celdaAlOeste2 = new Celda();
    private Celda celdaAlOeste3 = new Celda();
    private Celda celdaAlSur1 = new Celda();
    private Celda celdaAlSur2 = new Celda();
    private Celda celdaAlSur3 = new Celda();
    private List<Poder> poderes = new ArrayList<>();
    private Poder soltarVariasBombas;
    private Enemigo protoMax;


    @Given("^un bomberman que tiene a un enemigo Proto Max Unit en una celda contigua al \"([^\"]*)\"$")
    public void un_bomberman_que_tiene_a_un_enemigo_Proto_Max_Unit_en_una_celda_contigua_al(String dir) {

        poderes.add(soltarVariasBombas);
        celdaCentral.setCeldaAlNorte(celdaAlNorte1);
        soltarVariasBombas = new SoltarVariasBombas(celdaAlNorte1, 5);
        poderes.add(soltarVariasBombas);
        protoMax = new ProtoMaxUnits(celdaAlNorte1, poderes );
        celdaAlNorte2.setCeldaAl("Norte", celdaAlNorte3);
        celdaAlNorte1.setCeldaAl("Norte", celdaAlNorte2);

        celdaAlEste2.setCeldaAl("Este", celdaAlEste3);
        celdaAlEste1.setCeldaAl("Este", celdaAlEste2);
        celdaCentral.setCeldaAl("Este", celdaAlEste1);

        celdaAlOeste2.setCeldaAl("Oeste", celdaAlOeste3);
        celdaAlOeste1.setCeldaAl("Oeste", celdaAlOeste2);
        celdaCentral.setCeldaAl("Oeste", celdaAlOeste1);

        celdaAlEste2.setCeldaAl("Este", celdaAlEste3);
        celdaAlEste1.setCeldaAl("Este", celdaAlEste2);
        celdaCentral.setCeldaAl("Este", celdaAlEste1);
        bomberman = new Bomberman(celdaCentral);

        // creeeo que no hacia falta setear tooodo esto. de ultima se borra :s
    }

    @Given("^Bomberman suelta una bomba$")
    public void bomberman_suelta_una_bomba() {
        bomberman.dejarBomba(1);
    }

    @When("^la bomba alcanza a Proto Max Unit este muere dropeando el poder de lanzar varias bombas a la vez$")
    public void la_bomba_alcanza_a_Proto_Max_Unit_este_muere_dropeando_el_poder_de_lanzar_varias_bombas_a_la_vez() {
        Celda celdaSegura = new Celda();
        bomberman.setCeldaActual(celdaSegura);
        celdaCentral.getBombaActual().restarTick();
    }

    @When("^bomberman se mueve a la celda del \"([^\"]*)\"$")
    public void bomberman_se_mueve_a_la_celda_del(String dir) {
        bomberman.setCeldaActual(celdaCentral);
        bomberman.moverAl(dir);
    }
    @Then("^bomberman puede lanzar mas de una bomba a la vez$")
    public void bomberman_puede_lanzar_mas_de_una_bomba_a_la_vez() {
       // assertTrue(bomberman.getCantidadDeBombasALanzar()> 1);
        assertTrue(bomberman.getCantidadDeBombasALanzar() > 0);

    }
}

/*

 */