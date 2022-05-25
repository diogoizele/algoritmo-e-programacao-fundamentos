""" Exercício 11:
Crie um programa que imprima a soma 
dos valores pares e a soma dos valores
ímpares entre dois números quaisquer 
digitados pelo usuário.
"""
num1 = int(input("Digite um número: "))
num2 = int(input("Digite outro número: "))
soma = 0

maior = num1 if num1 > num2 else num2
menor = num1 if num1 < num2 else num2
menorInicial = menor
menor = menor + 1 if menor % 2 == 0 else menor


while menor <= maior:
    soma += menor
    menor += 2

print(f"A soma dos ímpares entre {menorInicial} e {maior} é {soma}")
