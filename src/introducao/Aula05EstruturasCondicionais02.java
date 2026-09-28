package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 19;
        String categoria;

        // if (idade < 15){
        //    categoria = "O atleta está na categoria infantil";
        //}else if(idade >= 15 && idade < 18){
        //    categoria = "O atleta está na categoria juvenil";
        //}else{
        //    categoria = "O atleta está na categoria adulto";
        //}
        categoria = idade < 15 ? "O atleta está na categoria infantil" : idade >= 15 && idade < 18 ? "O atleta está na categoria juvenil" : "O atleta está na categoria adulto";
        System.out.println(categoria);
    }
    
}
