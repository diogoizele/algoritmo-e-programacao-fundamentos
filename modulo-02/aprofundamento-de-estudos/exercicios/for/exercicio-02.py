""" Exercício 2:
Crie um programa que imprime na tela
todos os valores entre dois valores 
digitados pelo teclado.
"""
val1 = int(input("Digite um valor: "))
val2 = int(input("Digite outro valor: "))

maior = val1 if val1 > val2 else val2
menor = val1 if val1 < val2 else val2

for numero in range(menor, maior + 1):
  print(numero)