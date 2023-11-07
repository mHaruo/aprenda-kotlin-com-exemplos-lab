class Usuario {
    val inscritos: MutableList<String> = mutableListOf()

    val listaUsuarios: MutableList<String> = inscritos

    var mat: Int = 0
    var por: Int = 0
    var ing: Int = 0
    var prog: Int = 0

    fun matricular(usuario: String, conteudo: String) {

            if(inscritos.contains(usuario)) {
                println("Usuario $usuario ja esta matriculado")
            } else {
                when (conteudo) {

                    "Matematica" -> {
                        inscritos.add(usuario)
                        println("Cadastro de $usuario no curso de $conteudo feito com sucesso")
                        mat++
                    }

                    "Portugues" -> {
                        inscritos.add(usuario)
                        println("Cadastro de $usuario no curso de $conteudo feito com sucesso")
                        por++
                    }

                    "Ingles" -> {
                        inscritos.add(usuario)
                        println("Cadastro de $usuario no curso de $conteudo feito com sucesso")
                        ing++
                    }

                    "Programacao" -> {
                        inscritos.add(usuario)
                        println("Cadastro de $usuario no curso de $conteudo feito com sucesso")
                        prog++
                    }

                    else -> println("Aluno $usuario nao cadastrado: Conteudo $conteudo inexistente")
                }
        }
    }
    fun totalUsuarios(): MutableList<String> {
        return listaUsuarios
    }
}

data class ConteudoEducacional(
    val nome: List<String> = listOf(
        "Matematica",
        "Portugues",
        "Ingles",
        "Programacao"
    ), val duracao: Int = 60) {
}

fun main() {
    //Retorna todos cursos disponiveis
    val cursos = ConteudoEducacional()
    println(
        "Cursos disponiveis ${cursos.nome}" + " " +
                "Duracao das aulas: ${cursos.duracao} minutos"
    )
    //Adicionando alunos
    val matricula = Usuario()
    matricula.matricular("Mauricio", "Matematica")
    matricula.matricular("Joana", "Programacao")
    matricula.matricular("Joana", "Programacao")    //Verificando se ja existe aluno matriculado
    matricula.matricular("Paulo", "Ingles")
    matricula.matricular("Patricia", "Matematica")
    matricula.matricular("Jessica", "Programacao")
    matricula.matricular("Carlos", "Programaca")    //Verificando cursos com o nome correto

    //Retorna total de alunos
    println("Total de alunos em Matematica: ${matricula.mat}")      //Total Matematica
    println("Total de alunos em Portugues: ${matricula.por}")       //Total Portugues
    println("Total de alunos em Ingles: ${matricula.ing}")          //Total Ingles
    println("Total de alunos em Programacao: ${matricula.prog}")    //Total Programaçao

    println("Total de alunos: ${matricula.totalUsuarios().size}")
}