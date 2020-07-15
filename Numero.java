public class Numero {
    private String[] cadenaDividida;
    private int sumaCadena = 0;


    public Numero(String cadena) {
        this.cadenaDividida = Espacio.dividirPorEspacios(cadena);
    }

    public void sumarCadena() {
        for (String item : cadenaDividida) {
            if (esNumeroEntero(item)) {
                sumaCadena += pasarAEntero(item);
            }
        }
    }

    public int getSumaCadena() {
        sumarCadena();
        return sumaCadena;
    }

    private int pasarAEntero(String caracter) {
        int numero = 0;
        try {
            String caracterSinEspacio = Espacio.eliminarInicioFin(caracter);
            numero = Integer.parseInt(caracterSinEspacio);
        } catch (NumberFormatException excepcion) {
            System.err.println(excepcion.getMessage());
            System.exit(0);
        }
        return numero;
    }


    public static boolean esNumeroEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }


}
