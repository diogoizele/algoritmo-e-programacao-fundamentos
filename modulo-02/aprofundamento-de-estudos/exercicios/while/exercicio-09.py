""" Exercício 9:
Crie um programa que pede para o usuário
digitar 2 valores inteiros via Teclado 
(val1 e val2). Se nenhum dos valores for
negativo, escreva os números pares entre 
o menor e o maior valor.
"""
val1 = int(input("Digite um valor: "))
val2 = int(input("Digite outro valor: "))

if (val1 < 0 or val2 < 0):
    print("Erro: um dos números é negativo")
else:
    maior = val1 if val1 > val2 else val2
    menor = val1 if val1 < val2 else val2

    menor = menor + 1 if menor % 2 != 0 else menor

    while menor <= maior:
        print(menor)
        menor += 2
