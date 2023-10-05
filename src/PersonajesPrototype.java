import java.util.HashMap;
public class PersonajesPrototype {
    private HashMap<String, Personaje> clones = new HashMap<String, Personaje>();
    public PersonajesPrototype() {
        clones.put("Bot", new Bot(4, 2, 10, 10));
    }
    public Object getPersonaje(String tipo) throws CloneNotSupportedException{
        return (Personaje) clones.get(tipo).clone();
    }

}
