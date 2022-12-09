import lista_encadeada.Lista

fun main(){
    val l = Lista<Int>()

    l.add(3)
    l.add(5)
    l.add(3452)
    l.add(22, 2)
    println(l.find(2))
    l.find(5)
}