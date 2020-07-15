public class Espacio {

    public static String eliminarInicioFin(String cadena) {
        return cadena.trim();
    }

    public static String[] dividirPorEspacios(String cadena) {
        return cadena.split("\\s+");
    }
}
