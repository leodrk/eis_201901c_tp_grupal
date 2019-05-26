package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProtoMaxUnits extends Enemigo {

    private List<Poder> poderesADropear= new ArrayList();

    public ProtoMaxUnits(Celda celdaActual, List<Poder> poderes ) {
        super(celdaActual);
        poderesADropear = poderes;
    }


    @Override
    public void serDestruido() {
        celdaActual.setCuerpoActual(null);
        dropearItemRandom();
    }

    public void dropearItemRandom(){
        Random rand = new Random();
        Poder randomPoder = poderesADropear.get(rand.nextInt(poderesADropear.size()));

        celdaActual.setCuerpoActual(randomPoder);
    }
}
