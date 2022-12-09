package lista_encadeada

/*
* A lista encadeada se dá quando se quer armazenar vários dados, mas não se tem noção de quantos
*
* DESVANTAGENS:
* - Para encontrar um elemento, o pior caso é O(n), visto que pode ser o último
* -
*
* */

class Lista <T> {
    private var header: No<T>? = null

    fun add(valor: T, posicao: Int? = null){
        if(header == null){
            header = No(valor)
        } else if(posicao != null){
            var k = 0
            var p = header
            var q: No<T>? = null
            var novo: No<T>?
            while (k != posicao){
                q = p
                p = p!!.prox
                k++
            }
            novo = No(valor)
            q!!.prox = novo
            novo.prox = p
        } else {
            var p = header
            while(p!!.prox != null){
                p = p.prox
            }
            p.prox = No(valor)
        }
    }

    fun remove(posicao: Int){
        var k = 0
        var p = header
        var q: No<T>? = null
        while (k != posicao){
            q = p
            p = p!!.prox
            k++
        }
        q!!.prox = p!!.prox
    }

    fun lenght():Int{
        var p = header
        var k = 0
        while (p != null){
            p = p.prox
            k++
        }
        return k
    }

    fun clean(){
        header = null
    }

    fun imprimir(){
        var aux = header

        print("[")
        while(aux != null){
            print("${aux.valor},")
            aux = aux.prox
        }
        print("]")
    }

}