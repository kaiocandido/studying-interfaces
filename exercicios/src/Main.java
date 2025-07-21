import java.util.Scanner;

public class Main {
    private static final  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        GeometricArea geometricForm = null;
        while (true){
            System.out.println("Escolha a figura geometrica");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Circulo");
            System.out.println("3 - Retangulo");
            System.out.println("4 - Fechar Programa");
            option = scanner.nextInt();
            if(option == 1){
                geometricForm = createSquare();
            }else if(option == 2){
                geometricForm = createCircle();
            }else if(option == 3){
                geometricForm  = createRectangle();
            }else if (option == 4){
                System.out.println("Encerrado!!");
                break;
            }else{
                continue;
            }
            System.out.println("O resultado do calculo da area de foi de " + geometricForm.getArea());
        }


    }
    private static GeometricArea createSquare(){
        System.out.println("Informe os tamanhos dos lados:");
        var side = scanner.nextInt();
        return new Square(side);
    }

    private static GeometricArea createCircle(){
        System.out.println("Informe o valor do raio:");
        var radius = scanner.nextInt();
        return new Circle(radius);
    }

    private static GeometricArea createRectangle(){
        System.out.println("Informe o valor da altura:");
        var heigth = scanner.nextDouble();
        System.out.println("Informe o valor da base:");
        var base = scanner.nextDouble();
        return new Rectangle(heigth, base);
    }

}
