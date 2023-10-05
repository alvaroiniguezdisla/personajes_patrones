public  class Bot extends Personaje{
    public Bot(int fuerza, int inteligencia, int peso, int vida) {
        super(fuerza, inteligencia, peso, vida);
    }
    public  String getDescripcion(){
        return "Soy un Bot ";
    }

}
