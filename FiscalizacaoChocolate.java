import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double teorDeCacau;
        String tipoDeChocolate;
        int gramasDeAcucar;
        double preco;
        double notaDePureza;

        System.out.println("Bem vindo ao Sistema de Fiscalização \"Chocolate Real\"!!!");
        System.out.println("Aqui vamos auxiliar a classificar os produtos coletados em uma fábrica de doces.");
        
    
        System.out.println("\n1ª Situação: Classificação por Teor de Cacau");
        System.out.println("Informe o Teor de Cacau (apenas números):");
        teorDeCacau = sc.nextDouble();

        if (teorDeCacau < 25) {
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'");
        } else if (teorDeCacau >= 25 && teorDeCacau < 35) {
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        } else {
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        }
        // aq se teor for menor que 25 vai dar caso 1, se for maior ou igual 25 e ao msm tempo for < 35, vai dar caso2, ai se nao for nenhum dos dois, vai ocorrer o caso 3 o famoso senão

       
        sc.nextLine(); 

        
        System.out.println("\nComputado! Agora vamos para a segunda situação");
        System.out.println("2ª Situação: Verificação de Categoria e Rótulo");
        System.out.println("Informe o tipo (AO_LEITE ou AMARGO):");
        tipoDeChocolate = sc.nextLine(); 
        
        System.out.println("Informe a quantidade de açúcar (gramas):");
        gramasDeAcucar = sc.nextInt();

        if (tipoDeChocolate.equalsIgnoreCase("AO_LEITE") && gramasDeAcucar > 15) {
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
        } else {
            
            System.out.println("Classificação: Chocolate balanceado");
        }
        // se tipo de chocolate for aoleite e as gramas forem menores q 15, ai cai no caso 1, senao, ou seja se for qualquer coisa, vai dar caso2

        
        System.out.println("\nComputado!! Agora vamos seguir para etapa 3.");
        System.out.println("3ª Situação: Precificação de Exportação");
        System.out.println("Escreva o preço do ovo de Páscoa e a nota de pureza (0 a 10):");
        preco = sc.nextDouble();
        notaDePureza = sc.nextDouble();

        if (preco > 100 || notaDePureza < 5) {
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        } else {
            System.out.println("APROVADO: Produto competitivo para o mercado externo");
        }
        // se preco for maior q 100 e a nota de pureza < 5, vai dar o caso 1, caso contrario da o caso2

        sc.close(); 
    }
}