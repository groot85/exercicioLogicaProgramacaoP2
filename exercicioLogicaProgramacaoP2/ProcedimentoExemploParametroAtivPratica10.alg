Algoritmo "ProcedimentoExemploParametro"
// Disciplina : Lógica de Programação | Criação e Aplicação de Sistemas
// Professor : Lucy Mari
// Descrição : MULTIPLICACAO como uso de Procedimento (Parâmetro)
// Orientação: Com os conhecimentos adquiridos até agora, desenvolva um algoritmo em pseudocódigo que multiplique 2 números digitados pelo usuário (utilize parâmetro para o cálculo).
// Objetivos: Praticar lógica de programação e desenvolvimento de algoritmos.
// Materiais, Métodos e Ferramentas: Para realizar este exercício, vamos utilizar Visualg para testar o algoritmo proposto no desenvolvimento da prática em questão.
// Autor(a) : Ana Laura Avila Queiroz
// Data atual : 07/12/2024

procedimento multiplicacao (x,y: inteiro)
var
    aux: inteiro
inicio
    aux <- x * y
    res <- aux
fimprocedimento

Var
//seção de declaração das variáveis
//variaveis globais - evitar usar variaves globais!!!
res, abacate, banana: inteiro

Inicio
//seção de comandos
    escreva("Informe a quantidade de abacates:" )
    leia (abacate)
    escreva("Informe a quantidade de bananas:" )
    leia (banana)  
    multiplicacao(abacate,banana)
    escreval("O total dessa multiplicação de abacates e bananas é:", res)

Fimalgoritmo