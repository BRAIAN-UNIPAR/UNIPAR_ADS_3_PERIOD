fun declaracaoVariaveis() {

    var nome: String = "Braia";
    var idade: Int = 19;
    var salarioBruto: Double = 2.500;
    var qtdMesesTrabalhados: Int = 4;
    var qtdProdutosComprados: Int = 6;

    var valorGastoComProdutos: Double = 2.000;

    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário Bruto: $salarioBruto")
    println("Quantidade de Meses Trabalhados: $qtdMesesTrabalhados")
    println("Quantidade de Produtos Comprados: $qtdProdutosComprados")
    println("Valor Gasto com Produtos: $valorGastoComProdutos")
    calculaSalarioPorMeses(salarioBruto, qtdMesesTrabalhados)
    calculaMediaValorGasto(valorGastoComProdutos, qtdProdutosComprados)

}

fun calculaSalarioPorMeses(altura: Double, qtdMesesTrabalhados: Int) {
    var totalSalarioAnualBruto: Double = (altura * qtdMesesTrabalhados)
    println("O salario bruto anual é $totalSalarioAnualBruto")

    var totalSalarioAnualLiquido: Double = (totalSalarioAnualBruto - 2000)
    println("O salario liquido anual é $totalSalarioAnualLiquido")

}

fun calculaMediaValorGasto(valorGastoComProdutos: Double, qtdProdutosComprados: Int) {
    var totalPorProduto: Double = (valorGastoComProdutos / qtdProdutosComprados)
    println("O valor por produto é: $totalPorProduto")
}