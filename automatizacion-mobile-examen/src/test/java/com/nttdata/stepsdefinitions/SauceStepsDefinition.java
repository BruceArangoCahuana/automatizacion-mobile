package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SauceLabsSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;

public class SauceStepsDefinition {

    @Steps
    SauceLabsSteps sauceLabsSteps;
    @Dado("que me encuentro en la app de SauceApp")
    public void queMeEncuentroEnLaAppDeSauceApp() {
    }

    @Cuando("Ingrese el usuario {string} y la contraseña {string}")
    public void ingreseElUsuarioYLaContraseña(String user, String pass) {
        sauceLabsSteps.Logeo(user,pass);
    }

    @Entonces("valido quedeberia aparecer el titulo {string}")
    public void valido_quedeberia_aparecer_el_titulo(String titulo) {
        String TitleValidate = sauceLabsSteps.validarTextto();
        TitleValidate.equals(titulo);
    }

    @Y("valido que exista al menos un producto")
    public void valido_que_exista_al_menos_un_producto() {
        int itemListSize = sauceLabsSteps.ValidarProducto();
        if(itemListSize >0){
            System.out.print("El tamaño de la lista es: " + itemListSize);
        }
    }
}
