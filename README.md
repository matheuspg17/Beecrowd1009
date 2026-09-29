# Resolução exercício Beecrowd1009
## Descrição do problema
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
## Como Funciona
1. O usuário insere o nome do vendedor (`nomef`) como texto.
2. O usuário insere o salário fixo (`salario`) e o total de vendas (`vendas`) como números de ponto flutuante.
3. O código calcula o montante final somando o salário fixo com 15% das vendas: `salario + (vendas * 0.15)`.
4. O programa imprime o valor total acumulado formatado via `System.out.printf`.
