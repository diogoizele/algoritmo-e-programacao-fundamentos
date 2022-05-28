""" Exercício 3:
Crie um programa que imprime a tabuada 
de um número qualquer digitado 
pelo usuário.
"""

numero = int(input("Digite um número: "))

for n in range(1, (numero + 1)):
    print(f"{n} * {numero} = {n * numero}")
