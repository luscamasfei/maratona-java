package introducao;


/*
    Crie váriaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>
    Confirmo que recebi o salario <salario>, na data <data>

*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Lucas Maffei";
        String endereco = "Rua Osvaldo Rogério Braga";
        double salarioDouble = 1200;
        String dataRecebimentoSalario = "02/12/2026";

        System.out.println("Eu " + nome +", morando no endereço " + endereco);
        System.out.println("Confirmo que recebi o salario de R$" + salarioDouble + ", na data " + dataRecebimentoSalario);
    }
    
}
