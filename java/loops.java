package java;

public class loops{
    public static void main(String[] args){
        //Loop for
        for(int i = 0; i < 5; i++){
            System.out.println("Valor de i: " + i);//exibe o valor de i
        }
        
        //Loop for executa um número determinado de vezes (no caso acima, 5 vezes)
        
        //Loop while
        int contador = 0;//inicia a variável contador(veja variaveis.java)
        while(contador < 5){
            System.out.println("Valor do contador: " + contador);//exibe o valor do contador
            contador++;//soma 1 no contador
        }
        
        //Loop while executa enquanto uma condição for verdadeira (no caso acima, enquanto contador for menor que 5)

       //Loop do while
        int contador2 = 0;//inicia a variável contador2(veja variaveis.java)
        do{
            System.out.println("Valor do contador2: " + contador2);
            contador2++;
        }while(contador2 < 5);
        
        //Loop do while executa pelo menos uma vez, e então executa enquanto uma condição for verdadeira 
        //(no caso acima, enquanto contador2 for menor que 5)


    }
}