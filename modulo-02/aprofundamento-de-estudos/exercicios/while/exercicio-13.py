""" Exercício 13:
Crie um programa que calcule o fatorial
de um número informado pelo usuário 
(não permita números negativos).
"""

numero = int(input("Digite um número: "))

if (numero < 0):
    print("Número inválido")
else:
    i = 1
    fatorial = 1
    while i <= numero:
        fatorial *= i
        i += 1

    print(f"O fatorial de {numero} é {fatorial}")
