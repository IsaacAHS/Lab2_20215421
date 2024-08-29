package controller;


public class Configuracion {
    private int longitud;
    private int intentos;

    private String tema;

    public Configuracion (Integer longitud, Integer intentos, String tema){
        this.longitud= longitud;
        this.intentos= intentos;
        this.tema=tema;
    }
    public Configuracion(){
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
