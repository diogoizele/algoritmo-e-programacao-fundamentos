""" Exercício 14:
Crie um programa que diga se o número
informado pelo usuário é primo ou não.
"""

numero = int(input("Digite um número: "))
i = 1
divisores = 0

while i <= numero:
    if numero % i == 0:
        divisores += 1
    i += 1

if (divisores > 2):
    print(f"{numero} não é primo")
else:
    print(f"{numero} é primo")
