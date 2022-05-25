""" Exercício 4:
Sabendo que uma string é uma lista de 
letras, peça para o usuário digitar um
texto e imprima na tela a quantidade de
vogais que existem no texto.
"""

texto = input("Digite um texto: ")
vogais = ['a', 'e', 'i', 'o', 'u']
quant = 0

for i in range(0, len(texto)):
    letra = texto[i]

    if (letra.lower() in vogais):
        quant += 1

print(f"A palavra {texto} possui {quant} vogais")
