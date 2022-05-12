""" Exercício 2:
  Crie um programa que recebe dois 
  valores inteiros pelo teclado e 
  imprime qual dos dois é maior.
"""

primeiroInteiro = int(input("Digite o primeiro número inteiro: "))
segundoInteiro = int(input("Digite o segundo número inteiro: "))

maior = primeiroInteiro if primeiroInteiro > segundoInteiro else segundoInteiro

print(f"O maior inteiro digitado é {maior}")
