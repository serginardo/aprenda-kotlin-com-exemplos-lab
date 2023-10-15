data class Aluno(val nome : String, val email: String)

val aluno: MutableList<Aluno> = mutableListOf()
val lista2 : List<Aluno> = aluno

fun addAluno(novo_aluno : Aluno)
{
    aluno.add(novo_aluno)
}

fun getItensLista2() : List<Aluno> {
    return lista2
}

data class Formacao(var nome_formacao : String, var nivel : String, var conteudo : String)

val formacao : MutableList<Formacao> = mutableListOf()
val lista3 : List<Formacao> = formacao

fun addFormacao(nova_formacao : Formacao)
{
   formacao.add(nova_formacao)
}

fun getItensLista3() : List<Formacao> {
    return lista3 
}


fun main() {
  
    val a = Aluno("zezin","zezin@bol")
    addAluno(a)
  
    val b = Aluno("chiquin","chiquin@gmail")
    addAluno(b)
    getItensLista2().forEach {                                     
        i -> println("$i")
    }
  
    val f = Formacao("Java para iniciantes", "basico","conceitos iniciais")
    addFormacao(f)
   
    val g = Formacao ("C","intermediario","estrutura de dados")
    addFormacao(g)
    getItensLista3().forEach {                                     
        i -> println("$i")
    }
 }
