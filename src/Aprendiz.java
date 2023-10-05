public   class Aprendiz extends Personaje{
    public Aprendiz(int fuerza, int inteligencia, int peso, int vida) {
        super(fuerza, inteligencia, peso, vida);
    }
    public  String getDescripcion(){
        return "Soy un Aprendiz y tengo mucho que aprender";
    }
}
