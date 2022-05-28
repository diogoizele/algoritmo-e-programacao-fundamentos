""" Exercício 5:
Crie um programa que solicita o time 
de 10 usuários pelo teclado. Ao final, 
imprima quantos torcedores torcem para 
o Grêmio.
"""
sofredores = 0

i = 0
while i < 10:
    time = input("Qual seu time? ")
    sofredores += 1 if time == "Grêmio" else False
    i += 1

print(f"Existem {sofredores} sofredores que torcem para o grêmio")
