package com.cristianm.ar;

public class Meta  {

    private int metrosArecorrer;

    private int metaAsignada;

    public void carreraFinalizada(){
if( metrosArecorrer == metaAsignada){
    System.out.println("LLegada");

    }else {

    System.out.println("Se quedo a mitad de camino");

}


    }

    public Meta(){

    }

    public Meta(int metrosArecorrer, int metaAsignada) {
        this.metrosArecorrer = metrosArecorrer;
        this.metaAsignada = metaAsignada;
    }

    public int getMetrosArecorrer() {
        return metrosArecorrer;
    }

    public void setMetrosArecorrer(int metrosArecorrer) {
        metrosArecorrer = metrosArecorrer;
    }
}
