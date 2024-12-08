Algoritmo "ProcedimentoExemploParametro"
// Disciplina : Lógica de Programação | Criação e Aplicação de Sistemas
// Professor : Lucy Mari
// Descrição : SOMA como uso de Procedimento (Parâmetro)
// Orientação: Com os conhecimentos adquiridos até agora, desenvolva um algoritmo em pseudocódigo que some 2 números
// Objetivos: Praticar lógica de programação e desenvolvimento de algoritmos.
// Materiais, Métodos e Ferramentas:
// Para realizar este exercício, vamos utilizar Visualg para testar o algoritmo proposto no desenvolvimento da prática em questão.
// Autor(a) : Ana Laura Avila Queiroz
// Data atual : 07/12/2024

procedimento soma (x,y: inteiro)
var
    aux: inteiro
inicio
    aux <- x + y
    res <- aux
fimprocedimento

Var
//seção de declaração das variáveis
//variaveis globais - evitar usar variaves globais!!!
res, n, m: inteiro

Inicio
//seção de comandos
    n <- 4
    m <- -9  
    soma(n,m)
    escreval("A soma dos números é: ", res)

Fimalgoritmo