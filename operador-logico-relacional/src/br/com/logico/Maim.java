package br.com.logico;
/**
 * Operadores Lógicos e relacionais, controle de fluxo e blocos
 * */
public class Maim {

    public  static  void  main(String[] args){

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // Junção
        System.out.println("b1 && b2 "+ (b1 && b2));
        System.out.println("b1 && b3 "+ (b1 && b3));

        // Disjunção
        System.out.println("b1 && b3 "+ (b2 || b3));
        System.out.println("b2 && b4 "+ (b2 || b4));

        // xor
        System.out.println("b1 ^ b3 "+ (b1 ^ b3));
        System.out.println("b4 ^ b1 "+ (b4 ^ b1));

        //Negação
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2)< (f2 - f1)) && true "+ (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) "+ ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;
        //Exemplos de otimização nos codigos abaixo.
        //Exemplo: 1
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        //Exemplo: 2
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        System.out.println((salarioBaixo) && (muitosDependentes));

        //Exemplo: 3
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio "+ recebeAuxilio);




    }
}
