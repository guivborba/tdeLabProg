public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.base = 5;
        triangulo.altura = 10;
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 10;
        Trapezio trapezio = new Trapezio ();
        trapezio.baseMaior = 10;
        trapezio.baseMenor = 5;
        trapezio.altura = 2;
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.pi = 3.14;
        circunferencia.raio = 4;

        double areaTriangulo = triangulo.calcularArea();
        double areaQuadrado = quadrado.calcularArea();
        double areaTrapezio = trapezio.calcularArea();
        double areaCircunferencia = circunferencia.calcularArea();

        System.out.println("Área do triângulo: " + areaTriangulo);
        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do trapezio "  + areaTrapezio);
        System.out.println("Área da circunferencia " + areaCircunferencia);
    }
}
