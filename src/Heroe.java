public  class Heroe extends Personaje {
    public Heroe(int fuerza, int inteligencia, int peso, int vida) {
        super(fuerza, inteligencia, peso, vida);
    }
    public  String getDescripcion(){
        return "Soy un Heroe y os voy a salvar";
    }

}
