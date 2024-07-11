/*Anotações 
 * Todo arquivo ,java devera começar com letra maiuscula, por exemplo: MinhaClasse.java / Cliente.java /
 * 
 * Caso seja uma palavra composta a segunda palavra tambem devra seguir essa regra.
 * 
 * A classe devera ter o mesmo nome do arquivo, caso nao seja dara erro de escrita.
 * 
 * VARIAVEL deve ser escrita com letra minuscula, mas caso seja composta, a segunda palavra devra ser maiscula.
 Para criar uma variavel que o valor nao seja alterado use (final), por exemplo:
  final String BR= "Brasil";
  String é usado como texto, para que BR receba Brasil.
  Outro exemplo, uma variavel de ano:
  esse tipo de variavel pode sofrer alterações, fazemos isso usando int, para especificar que podera ter alteração, fazemos assim: 
 int ano = 2023;
 ano = 2024;

 * 
*/

public class MinhaClasse {
    public static void main (String []args){
       String primeiroNome = "Ruan";
       String segundoNome = "Borré";
String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
