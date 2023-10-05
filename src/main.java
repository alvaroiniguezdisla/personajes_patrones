import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        PersonajesFactoryMethod factoria = new PersonajeFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la fuerza del personaje");
        int fuerza = sc.nextInt();
        System.out.println("Dime la inteligencia del personaje");
        int inteligencia = sc.nextInt();
        System.out.println("Dime el peso del personaje");
        int peso = sc.nextInt();
        System.out.println("Dime la vida del personaje");
        int vida = sc.nextInt();
        Personaje personaje= factoria.createPersonaje(fuerza, inteligencia, peso, vida);
        System.out.println(personaje.getDescripcion());
        PersonajesPrototype factoria2 = new PersonajesPrototype();

    }
}
