package com.nttdata.steps;

import com.nttdata.screens.SauceScreen;

public class SauceLabsSteps {

    SauceScreen sauceScreen;

    public void Logeo (String user, String pass){
        sauceScreen.typeUserAndPass(user, pass);
    }

    public  String validarTextto(){
       return  sauceScreen.validarText();
    }

    public  int ValidarProducto(){
        return  sauceScreen.getItemSize();
    }
}
