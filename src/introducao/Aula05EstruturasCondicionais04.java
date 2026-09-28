package introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxaImposto = 0;

        if (salarioAnual <= 34712){

            taxaImposto = salarioAnual * (9.7/100);
            System.out.printf("Você terá que pagar €%.2f%n",taxaImposto);
            
        }else if (salarioAnual <= 68507) {

            taxaImposto = salarioAnual * (37.35/100);
            System.out.printf("Você terá que pagar €%.2f%n",taxaImposto);

        }else{

            taxaImposto = salarioAnual * (49.50/100);
            System.out.printf("Você terá que pagar €%.2f%n",taxaImposto);

        }
    }
}
