package com.company;

public class EjemploWrapperClases {

    public void ejemplo() {

        float fPrimitivo = 10;
        Float fWrapper = fPrimitivo;
        fPrimitivo = fWrapper * 2;

        String valorNumerico = "10";

        //int x = fPrimitivo;
        int y = fWrapper.intValue();
    }
}
