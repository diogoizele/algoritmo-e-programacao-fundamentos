""" Exercício 12:
Crie um programa que pede para o usuário
digitar números positivos via Teclado. 
Quando o usuário digitar um número 
negativo, informe a média de todos os 
números que ele informou.
"""
pararPrograma = 0
soma = 0
quant = 1

while pararPrograma >= 0:
    pararPrograma = int(input("Digite um número: "))
    if (pararPrograma >= 0):
        quant += 1
        soma += pararPrograma

media = soma / (quant - 1)

print(f"A média entre os números digitados é {media}")
