
public class Pessoa {
    // Atributos da classe pessoa
    double salarioAnual;
    double servicosAnual;
    double ganhoCapitalAnual;
    double gastosMedicos;
    double gastosEducacionais;

    // Calcula imposto sobre salario
    public double calcularImpostoSalario() {
        double salarioMensal = salarioAnual / 12;
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return salarioAnual * 0.10;
        } else {
            return salarioAnual * 0.20;
        }
    }

    // Calcula imposto sobre serviços
    public double calcularImpostoServicos() {
        return servicosAnual * 0.15;
    }

    // Calcula imposto sobre ganho capital
    public double calcularImpostoGanhoCapital() {
        return ganhoCapitalAnual * 0.20;
    }

    // Calcula dedução do imposto
    public double calcularDeducoes(double impostoBruto) {
        double maxDeducao = impostoBruto * 0.30;
        double gastosDedutiveis = gastosMedicos + gastosEducacionais;

        if (maxDeducao < gastosDedutiveis){
            return maxDeducao;
        } else {
            return gastosDedutiveis;
        }
    }

    // Metodo para gerar relatorio na tela
    public void gerarRelatorio() {
        double impostoSalario = calcularImpostoSalario();
        double impostoServicos = calcularImpostoServicos();
        double impostoGanhoCapital = calcularImpostoGanhoCapital();
        double impostoBrutoTotal = impostoSalario + impostoServicos + impostoGanhoCapital;
        double deducoes = calcularDeducoes(impostoBrutoTotal);
        double impostoDevido = impostoBrutoTotal - deducoes;
        double maximoDeduzir = impostoBrutoTotal * 0.30;


        System.out.println("==========================================");
        System.out.println("#### RELATÓRIO DE IMPOSTO DE RENDA ####===");
        System.out.println("==========================================\n");
        System.out.println("***********CONSOLIDADO DE RENDA***********");
        System.out.printf("Imposto sobre salário: R$ %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: R$ %.2f\n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: R$ %.2f\n", impostoGanhoCapital);
        System.out.println("*****************DEDUÇÕES*****************");
        System.out.printf("Máximo dedutível: R$ %.2f\n", maximoDeduzir);
        System.out.printf("Gastos dedutíveis: R$ %.2f\n", gastosEducacionais+gastosMedicos);
        System.out.println("\"*****************RESUMO******************");
        System.out.printf("Imposto bruto total: R$ %.2f\n", impostoBrutoTotal);
        System.out.printf("Abatimento: R$ %.2f\n", deducoes);
        System.out.printf("Imposto devido: R$ %.2f\n", impostoDevido);
    }

}




