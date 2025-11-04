// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val altura: Double, val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Aluno ${usuario.nome} foi matriculado")
    }
    
    fun listarMatriculados() {
        println("Lista dos alunos matriculados\n")
        for (inscrito in inscritos) {
            println("- Nome: ${inscrito.nome}")
        }
    }
}

fun main() {
    val conteudos = listOf(ConteudoEducacional(nome = "Introdução a Física"))
    val usuarios = listOf(Usuario(nome = "John Doe", altura = 1.73, idade = 27))
    val formacao = Formacao(nome = "Capoeira", conteudos = conteudos)
    
    for (usuario in usuarios) {
        formacao.matricular(usuario)
    }
    
    println()
    
    formacao.listarMatriculados()
}
