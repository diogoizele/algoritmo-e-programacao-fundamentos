""" Exercício 8:
Crie um programa que pergunta para o 
usuário (via Teclado) quantos números 
ele irá digitar e armazena em uma 
variável chamada quant. Logo após, 
faça com que o usuário digite quant 
números inteiros, e para cada número 
digitado imprima na tela se o número 
é negativo, positivo ou zero.
"""

quant = int(input("Quantos números você quer digitar? "))
i = 0
while i < quant:
  numero = int(input("Digite um número: ")) 
  if numero < 0:
    print(f"{numero} é negativo")
  elif numero > 0:
    print(f"{numero} é positivo")
  else:
    print('Zero')