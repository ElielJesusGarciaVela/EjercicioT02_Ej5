public class App {
    public static void main(String[] args) throws Exception {
        double pesetas = 166.386;
        double valordeeuros = 0.006;

        System.out.printf("%.2f pesetas son %.2f euros",(float)pesetas, (pesetas * valordeeuros) );
    }
}
