package br.com.retornos;

public class Main {
    public  static void main(String[] args){

        //Quadrilatero

        System.out.println("Exercício quadrilatero");
      double areaQuadrado = Quadrilatero.area(3);
      System.out.println("Área do quadrado: " + areaQuadrado);

      double areaRetangulo = Quadrilatero.area(5 ,5);
      System.out.println("Área do Retângulo: " + areaRetangulo);

      double areaTrapezio =  Quadrilatero.area(7, 8, 9);
       System.out.println("Área do Trapézio: " + areaTrapezio);

    }
}
