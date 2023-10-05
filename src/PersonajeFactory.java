public   class PersonajeFactory implements PersonajesFactoryMethod{
    public Personaje createPersonaje(int fuerza,int inteligencia,int peso,int vida){
        if(inteligencia>10){
            return new Heroe(fuerza,inteligencia,peso,vida);
        }else if(inteligencia<5){
            return new Villano(fuerza,inteligencia,peso,vida);

        }else {
            return new Aprendiz(fuerza,inteligencia,peso,vida);
        }
    }
}
