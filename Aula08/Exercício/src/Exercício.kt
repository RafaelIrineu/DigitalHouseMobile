import kotlin.random.Random

var banco = Banco()

fun main() {
    /*val cc1 = ContaCorrente(123, 1000.0, 5.0)
    val cc2 = ContaCorrente(321, 1000.0, 5.0)

    val cp1 = ContaPoupança(100, 1000.0, 50.0)
    val cp2 = ContaPoupança(101, 1000.0, 50.0)

    val relatório = GerarRelatório()

    cc1.depositar(50.0)
    cc2.depositar(5.0)
    cp1.depositar(75.0)
    cp2.depositar(5.0)

    cc1.sacar(2.0)
    cc2.sacar(75.0)
    cp1.sacar(1500.0)
    cp2.sacar(5000.0)

    relatório.gerarRelatorio(cp1)
    relatório.gerarRelatorio(cp2)
    relatório.gerarRelatorio(cc1)
    relatório.gerarRelatorio(cc2)*/



    do {

        val opcaoPrincipal = menuPrincipal()

        when (opcaoPrincipal) {

            1 -> menu1()
            2 -> menu2()
            3 -> menu3()
            4 -> menu4()
        }
    } while (opcaoPrincipal < 5)

    println("Operação finalizada, volte sempre $$$")
}

fun menuPrincipal(): Int {

    println("$$$$$ BANCO $$$$$")
    println("1 - Criar Conta")
    println("2 - Selecionar Conta")
    println("3 - Remover Conta")
    println("4 - Gerar Relatório")
    println("5 - Finalizar")

    return readLine()!!.toInt()
}

fun menu1() {
    println("$$$$$ BANCO $$$$$")
    println("Informe a opção de conta que você deseja criar:")
    println("1 - Corrente")
    println("2 - Poupança")

    var opcaoConta = readLine()!!.toInt()
    var contaCriada: ContaBancaria? = null

    when (opcaoConta) {

        1 -> {
            contaCriada = ContaCorrente(Random.nextInt(100, 499), 0.0, 0.05)
        }
        2 -> {
            contaCriada = ContaPoupanca(Random.nextInt(500, 999), 0.0, 1000.0)
        }
    }
    banco.adicionarConta(contaCriada!!)
}

fun menu2() {

    println("$$$$$ BANCO $$$$$")
    print("Informe o número da sua conta: ")

    var numeroConta = readLine()!!.toInt()
    var contaEncontrada = banco.procurarConta(numeroConta)

    if (contaEncontrada != null) {

        println("$$$$$ BANCO $$$$$")
        println("$$$$$ BANCO $$$$$")
        println("Informe a opção desejada: ")
        println("1 - Depositar")
        println("2 - Sacar")
        println("3 - Transferir")
        println("4 - Gerar Relatório")
        println("5 - Retornar ao menu anterior")

        var opcao2 = readLine()!!.toInt()

        when (opcao2) {
            1 -> {
                var valor = deposito()
                banco.contas[numeroConta].depositar(valor)
            }

            2 -> {
                var valor = saque()
                banco.contas[numeroConta].sacar(valor)
            }

            /*3 -> {
                print("Informe o valor que deseja transferir: R$ ")
                var valor = readLine()!!.toDouble()
                println()
                print("Informe a conta para qual deseja transferir: ")
                var contaInformada = readLine()!!.toInt()
                banco.contas[numeroConta].transferir(valor, banco.contas[contaInformada])
            }*/

            4 -> {
                banco.mostrarDados()
            }

            5 -> menuPrincipal()

        }
    }

}

fun menu3() {

}

fun menu4() {
    banco.mostrarDados()
}

fun deposito():Double{
    print("Informe o valor do depósito: R$ ")
    return readLine()!!.toDouble()
}

fun saque():Double{
    print("Informe o valor do saque: R$ ")
    return readLine()!!.toDouble()
}


/*while (true) {
    println("=============================================")
    println("Menu do Banco, informe a opção desejada:")
    println("1 - Criar conta")
    println("2 - Selecionar conta")
    println("3 - Remover conta")
    println("4 - Gerar relatório")
    println("5 - Finalizar")

    var opcao1 = readLine()!!.toInt()

    when (opcao1) {
        1 -> {
            println("Digite o número da opção correspondente a conta que você quer criar: ")
            println("1 - Conta Poupança")
            println("2 - Conta Corrente")

            var opcaoConta = readLine()!!.toInt()

            when (opcaoConta) {
                1 -> {
                    var cc = ContaCorrente(1, 0.0, 0.05)
                    banco.adicionarConta(cc)
                }
                2 -> {
                    var cp = ContaPoupança(2, 0.0, 100.0)
                    banco.adicionarConta(cp)
                }
                else -> {
                    println("Opção inválida")
                }
            }
        }
        2 -> {
            print("Informe o número da conta: ")
            var nconta: Int = readLine()!!.toInt()

            if ((nconta - 1) <= banco.contas.size) {
                println("Informe a opção desejada: ")
                println("1 - Depositar: ")
                println("2 - Sacar: ")
                println("3 - Transferir: ")
                println("4 - Gerar relatório")
                println("5 - Retornar ao menu anterior")
                var opcao2 = readLine()!!.toInt()

                when (opcao2) {
                    1 -> {
                        print("Informe o valor do depósito: R$")
                        var valor = readLine()!!.toDouble()
                        banco.contas[nconta].depositar(valor)
                    }
                    2 -> {
                        print("Informe o valor do saque: R$")
                        var valor = readLine()!!.toDouble()
                        banco.contas[nconta].sacar(valor)
                    }
                    3 -> {
                        print("Informe o valor da transferência: R$")
                        var valor = readLine()!!.toDouble()
                        print("Informe a conta para qual irá a transferência: ")
                        var contaDestino = readLine()!!.toInt()
                        banco.contas[nconta].transferir(valor, banco.contas[contaDestino])
                    }
                    4 -> {
                        println("Relatório")
                        var contaRelatorio = banco.contas[nconta]
                        contaRelatorio.mostrarDados()
                    }
                    else -> {
                        println("Retornando ao menu anterior")
                    }
                }
            } else {
                println("Conta inexistente")
            }
        }
        3 -> {
            print("Informe o número da conta: ")
            var nconta = readLine()!!.toInt()
            banco.removerConta(banco.contas[nconta])
        }
        4 -> {
            println("Relatório")
            banco.mostrarDados()
        }
        5 -> {
            println("Aplicação encerrada")
            break
        }
        else -> {
            println("Opção inválida")
        }
    }
}*/

