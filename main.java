public class main {

    public static void main(String[] args) {
        String entrada = "2      1 2            3         &14#        5y  u6   7text              ";
        Cadena Caracteres = new Cadena(entrada);
        Caracteres.verCadena();
        System.out.printf("suma:%d\n", Caracteres.getSumaCadena());
    }

}
