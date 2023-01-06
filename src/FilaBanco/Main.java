package FilaBanco;

/*DESAFIO:
 * Elabore um programa que simule uma fila de atendimento bancário. 
 * O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
 
IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.
*/

import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
 
            String[] nomesFila = new String[3]; 
            Scanner nome = new Scanner(System.in); 
        
        int i = 0;
        
        while (i<3){
            nomesFila[i] = nome.next();
            System.out.println(nomesFila[i]+ " - esta na posicao: "+ (i+1));  
            i++;
        }
        nome.close();
        
    }
    
}