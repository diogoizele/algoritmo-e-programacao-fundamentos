""" Exercício 1:
  Crie um programa que recebe um
  inteiro pelo teclado e imprime 
  se ele é par ou ímpar.
"""

numero = int(input("Digite um número: "))
print(f"O número {numero} é {'par' if numero % 2 == 0 else 'ímpar'}")


"""
  Fiz uma pesquisa e encontrei
  a expressão condicional inline
  no python, por isso já estou 
  usando-a.
  
  "resultado True" if <condicao> else "resultado False"  

  https://www.adamsmith.haus/python/answers/how-to-write-an-inline-if-else-statement-in-python
"""
