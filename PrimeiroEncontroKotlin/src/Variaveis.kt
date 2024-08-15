fun declaraVariaveis() {

    var idade: Int = 19;
    var altura: Double = 1.90;
    var nome: String = "Braia";
    var eEstudante: Boolean = false;

    println("Meu nome é $nome, minha idade é $idade, minha altura é, $altura")

    if (eEstudante) {
        println("Sim, sou estudante")
    } else {
        println("Não, ainda não sou estudante")
    }

    multiplicaAltura(altura)

}

fun multiplicaAltura(altura: Double) {
    val total = altura * 2
    println("A altura multiplicada por 2 é: $total")
}


fun calculaIdades(idade1: Int, idade2: Int) {
    var total: Int = (idade1 + idade2)
    var nome = "Braia";
    println("Olá, $nome");
    println("A idade é $total")
}


fun main(args: Array<String>) {
    declaraVariaveis()
    calculaIdades(19, 21)
}
