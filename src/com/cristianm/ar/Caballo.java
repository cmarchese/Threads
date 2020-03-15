package com.cristianm.ar;

public class Caballo {

    private String nombreCaballo;

    public void detener() {
        System.out.println("Se detuvo el caballo");
    }

    public void avanzar() {
        System.out.println("El caballo comenzo a avanzar");
        Meta metaFinalizada = new Meta();
        if (metaFinalizada.equals(true)) {
            detener();
        }
    }

    public Caballo() {

    }

    public Caballo(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    public String getNombreCaballo() {
        return nombreCaballo;
    }

    public void setNombreCaballo(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "nombreCaballo='" + nombreCaballo + '\'' +
                '}';
    }
}
