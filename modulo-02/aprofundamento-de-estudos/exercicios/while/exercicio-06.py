""" Exercício 6:
Crie um programa que pede para o usuário 
digitar 20 números com ponto flutuante 
pelo teclado. Ao final, seu programa 
deve imprimir todos os números digitados. 
Dica: armazene-os em uma string e 
concatene os valores digitados. No final, 
imprima a string.
"""
quantidade = 0
stringNumeros = ''

while quantidade < 20:
    # Não há necessidade de pegar float e transformar em string depois
    numero = input("Digite um número com ponto flutuante: ")
    stringNumeros += numero + ', '
    quantidade += 1

print(f"Números digitados {stringNumeros}")
