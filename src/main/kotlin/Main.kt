import lista_encadeada.Lista

fun main(){
    val l = Lista<Int>()

    l.add(3)
    l.add(5)
    l.add(3452)
    l.add(22, 2)
    l.imprimir()
    println("\n${l.lenght()}")
    l.remove(2)
    l.imprimir()
    println("\n${l.lenght()}")
    l.add(24)
    l.imprimir()
    println("\n${l.lenght()}")
    l.clean()
    l.imprimir()
}