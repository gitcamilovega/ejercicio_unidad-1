public class Cadena extends Numero {
    private String entrada;

    public Cadena(String entrada) {
        super(entrada);
        this.entrada = Espacio.eliminarInicioFin(entrada);
    }

    public void verCadena() {

        String[] cadena = entrada.split("\\s+");

        for (String item : cadena) {
            if (!Numero.esNumeroEntero(item)) {
                System.err.printf("\"%s\" no es un número\n", item);
            }
        }
    }
}
