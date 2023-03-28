enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel = Nivel.BASICO) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
     inscritos.add(usuario) //Faz a adição de um Usuario na MutableList de Inscritos
    }
}

fun main() {
    val user1 = Usuario("Johan")
    val user2 = Usuario("Johanna")
    
    var content1 = ConteudoEducacional("Introdução a Programação", 15)
    var content2 = ConteudoEducacional("Programação OO", 35)
    
    var formacao1 = Formacao("Desenvolvimento de Software", listOf(content1, content2), Nivel.BASICO)
    
    
    formacao1.matricular(user2)
    formacao1.matricular(user1)
    
    println("O usuario ${user1} está na formação: ${formacao1}")
    
}
