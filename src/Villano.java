public  class Villano extends Personaje{
    public Villano(int fuerza, int inteligencia, int peso, int vida) {
        super(fuerza, inteligencia, peso, vida);
    }
    public  String getDescripcion(){
        return "Soy un Villano y os voy a matar";
    }



}