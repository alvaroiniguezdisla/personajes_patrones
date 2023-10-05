public abstract class Personaje {
    private int fuerza;
    private int inteligencia;
    private int peso;
    private int vida;
    public Personaje(int fuerza, int inteligencia, int peso, int vida) {
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.peso = peso;
        this.vida = vida;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public abstract String getDescripcion() ;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
