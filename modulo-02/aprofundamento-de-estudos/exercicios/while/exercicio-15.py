""" Exercício 15:
Crie um programa que imprime os números
primos entre 0 e 200, imprimindo ao
final a soma destes números.
"""

i = 3
primos = 1  # já contamos o número 2 como primo
soma = 0

while i < 200:
    j = 1
    divisores = 0
    while (j <= i):
        if (i % j == 0):
            divisores += 1
        j += 1

    if divisores == 2:
        print(f"{i} é primo")
        primos += 1
        soma += i

    i += 1

print(f"A soma de todos os {primos} números primos é {soma}")
