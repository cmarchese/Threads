package com.cristianm.ar;

public class Hipodromo {

    private int cantidadCaballos;

    public void iniciarCarrera(Meta meta, Caballo caballo) {
        caballo.avanzar();
        meta.carreraFinalizada();
    }

    public Hipodromo(int cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }

    public Hipodromo() {

    }

    public int getCantidadCaballos() {
        return cantidadCaballos;
    }

    public void setCantidadCaballos(int cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }

    @Override
    public String toString() {
        return "Hipodromo{" +
                "cantidadCaballos=" + cantidadCaballos +
                '}';
    }
}
