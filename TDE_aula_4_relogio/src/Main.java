
public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio(4,23,34);
        System.out.println(relogio.lerHora() + "h");
        System.out.println(relogio.lerMinuto() + "min");
        System.out.println(relogio.lerSegundo() + "s");
    }
}