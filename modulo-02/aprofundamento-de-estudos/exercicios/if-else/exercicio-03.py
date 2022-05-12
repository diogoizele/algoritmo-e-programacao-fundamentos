""" Exercício 3:
  Crie um programa que recebe dois 
  valores inteiros A e B pelo teclado
  e imprime o valor de A dividido por
  B. Entretanto, se o valor de B for 
  0, imprima uma mensagem de erro e
  não faça a divisão.
"""

A = int(input("Digite um número para A: "))
B = int(input("Digite um número para B: "))

divisaoEhPossivel = A / B if B != 0 else "Não é possível dividir por zero!"
divisao = f"{A} / {B} = {divisaoEhPossivel}"

print(f"{divisao if B != 0 else 'Erro: Divisão por 0'}")
