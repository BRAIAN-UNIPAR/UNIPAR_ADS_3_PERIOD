var version = 56565

fun main(args: Array<String>) {

    // Variaveis mutaveis
    // para isso uso a palavra chave var

    var idade = 30;
    idade = 31;

    //var nome_variavel: tipo = valor
    var nome: String ="Gui"
    var valor: Double = 5.5
    var peso: Int = 90
    var ePessoa: Boolean = true

    println("Minha idade é $idade e meu peso é $peso")


    //Variaveis imutaveis mesmo querendo mudar o valor, pelo fato de ser "val" ela mão muda se fosse "var" mudaria
    //para isso uso o
    val pi: Double = 3.14
    val percentualIcms: Int = 19
    val nomeEmpresa: String = "UNIPAR"

    println("version ${version}")
    mudarVersion(50)
    println("version ${version}")

   var tot = somarValores(10,20)
    println("Total é $tot")



}


//void
// fun nome_funcao(parametros)
fun mudarVersion(versionChange: Int){
    version = versionChange
}

//Funções com retorno
fun somarValores(valorA: Int, valorB: Int): Int{
    return valorA + valorB
}