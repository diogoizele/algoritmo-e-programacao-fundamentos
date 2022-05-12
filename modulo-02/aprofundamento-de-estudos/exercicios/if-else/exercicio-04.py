""" Exercício 4:
  Crie um programa que recebe três
  valores inteiros pelo teclado e 
  imprime qual dos três é menor.
"""

primeiroValor = int(input("Digite o primeiro valor: "))
segundoValor = int(input("Digite o segundo valor: "))
terceiroValor = int(input("Digite o terceiro valor: "))

valores = [primeiroValor, segundoValor, terceiroValor]

maior = primeiroValor if primeiroValor > segundoValor else segundoValor
maior = maior if maior > terceiroValor else terceiroValor

print(f"O maior valor entre {valores} é {maior}")
