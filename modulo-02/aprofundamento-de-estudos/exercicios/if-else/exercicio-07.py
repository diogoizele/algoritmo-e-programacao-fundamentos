""" Exercício 7:
  Crie um programa que recebe
  um valor inteiro referente a
  um determinado ano. Imprima 
  na tela se o ano informado é
  bissexto ou não.
"""

# 1 - Par
# 2 - Divisível por 4
# 3 - Não divisível por 100

numero = int(input("Digite um número inteiro: "))

if (numero % 4 == 0 and numero % 100 != 0) or numero % 400 == 0:
    print("O ano é bissexto!")
else:
    print('O ano não é bissexto!')
