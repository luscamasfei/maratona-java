package introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // A condição é que valorParcela >= 1000

        double valorCarro = 75000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000){
                break;
            }
            System.out.println("numero de parcelas: "+parcela+" e o valor é R$ "+valorParcela);
        }
        

    }
    
}
