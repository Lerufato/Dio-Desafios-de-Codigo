package PercentualDesconto;

/*DESAFIO:
 * O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! 
 * A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 
 
IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  
*/

import java.util.*;
 
public class Main{

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

    int M = input.nextInt();
    int D = input.nextInt();  

    double diferenca = M-D;
    double desconto = diferenca/M;
    double porcentagem = desconto*100;

    System.out.println("O desconto foi de "+ (int)porcentagem + "%");

    input.close();

    }

}