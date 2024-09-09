public class Operadores {
    public static void main(String[] args) {
       /*//repetição numerica de incrementação
       int numero = 5;
       numero = numero + 2;
       numero ++;
       System.out.println(++ numero );
       System.out.println(numero);

       boolean variavel = true;
       System.out.println(variavel);
       variavel = !variavel;
       System.out.println(variavel);



       int a, b;

       a = 5;
       b = 6;
*/
      // String resultado = "";

       /*if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);

        //operador ternario
         
        String resultado = a!=b ? "verdadeiro" : "falso";
        System.out.println(resultado);*/
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");

        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        if(condicao1 && (7 > 3)){
            System.out.println("Essa também é uma condição é verdadeira");
        }


    }
}
