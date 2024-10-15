import java.util.Scanner; // importa a biblioteca
public class Principal {
    public static void main(String[] args) {
        // Objeto classe scaner para ler entrada de dados
        Scanner leitura = new Scanner(System.in);
        // Criando objeto
        Pessoa pessoa = new Pessoa();

        // Leitura dos dados
        System.out.print("Renda anual com salário: ");
        pessoa.salarioAnual = leitura.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        pessoa.servicosAnual = leitura.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        pessoa.ganhoCapitalAnual = leitura.nextDouble();

        System.out.print("Gastos médicos: ");
        pessoa.gastosMedicos = leitura.nextDouble();

        System.out.print("Gastos educacionais: ");
        pessoa.gastosEducacionais = leitura.nextDouble();

        // Gerar o relatório
        pessoa.gerarRelatorio();

        leitura.close();
    }
}