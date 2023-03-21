package java;

//importando método Java Scanner
import java.util.Scanner;
//o Scanner é usado para receber o input do usuário

public class variaveis{
    public static void main(String[] args){
        
        //puxando o método para dentro de uma variável
        Scanner ler = new Scanner(System.in);//ler recebe o poder do método


        System.out.println("digite um número");//pede pro usuário inserir um número

        //aqui a variável ler chama o método Scanner(System.in) e pede para ele ler
        //o próximo número inteiro com .nextInt()
        int num = ler.nextInt();//arquiva na variável num o valor que o usuário digitar
        
        //podemos fazer isso também com outros tipos de variável:
        String frase = ler.nextLine();//lê uma frase
        char letra = ler.next().charAt(1)//lê a primeira letra digitada com o método charAt();

        //double e float servem basicamente para a mesma coisa, porém
        //o double guarda só até duas casas depois da vírgula,
        //já o float guarda quantas você quiser.
        double decimal = ler.nextDouble();//lê um decimal
        float comvirgula = ler.nextFloat();//Lê um número com vírgula


        //pare por aqui e vá para a linha 50 para entender mais sobre como criar seu método.

        //usando o método que você criou:
        int numUm=5, numDois=7, numTrês=9; //declarando variáveis

        float mediaResposta = media(numUm, numDois, numTres);//recebendo o valor que o método retornou em uma variável
        //aqui numUm vai ser o a no método, numDois o b e numTres o c
        //mediaResposta vai receber o valor do cálculo feito no método


        //podemos exibir os resultados de duas maneiras:

        //com a variável que recebeu o método
        System.out.println("Media dos números: "+mediaResposta);//imprime na tela o valor de media resposta

        //com o próprio método
        System.out.println("Media dos números: "+media(numUm, numDois, numTres));//imprime na tela aresposta do método media
    }

    //criando um método:

    //fora do escopo do método main, mas ainda dentro da public class você pode criar
    //seus próprios métodos e reutilizálos no main.
    //por exemplo:

    //método que faz uma média entre 3 números inteiros:

    //float é o tipo de variável que o método vai retornar
    //media é o nome do método
    //(int a, b, c) vão ser as variáveis que o metodo vai precisar
    public static float media(int a, b, c){//cria o método média que recebe 3 variáveis int: a, b e c
        int media = (a+b+c)/3;//pega as 3 variáveis requeridas e faz a média

        return media;//retorna a variável media como valor

        //vamos voltar agora para o programa principal
        //vápara a linha 33
    }



}