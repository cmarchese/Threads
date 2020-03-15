package com.cristianm.ar;

public class Main {
    public static void main(String[] args) {
        Hipodromo h = new Hipodromo(12);
        Meta m = new Meta(50, 100);
        Caballo c = new Caballo("Pedrito");
        h.iniciarCarrera(m, c);
        System.out.println(h.toString() + c.toString());
    }
}
