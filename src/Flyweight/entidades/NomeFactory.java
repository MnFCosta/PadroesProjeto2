package Flyweight.entidades;

import java.util.HashMap;
import java.util.Map;

public class NomeFactory {
    private static Map<String, Pessoa> chars;

    private static void init() {
        chars = new HashMap<String, Pessoa>();
    }

    public static Pessoa get(String c) {
        if (chars == null)
            init();
        Pessoa result = chars.get(c);
        if(result == null)
            chars.put(c, new Nome(c));
        return chars.get(c);
    }
}