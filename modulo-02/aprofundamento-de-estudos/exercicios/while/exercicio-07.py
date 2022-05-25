""" Exercício 7:
Crie um programa que solicita para o
usuário que ele digite 10 valores 
inteiros. Ao final, imprima a soma de
todos os valores digitados.
"""
soma = 0

i = 0
while i < 10:
    soma += int(input("Digite um valor inteiro: "))
    i += 1

print(f"A soma dos números é {soma}")