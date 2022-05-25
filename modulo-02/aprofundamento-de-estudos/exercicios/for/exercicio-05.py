""" Exercício 5:
Crie um programa que permita que o 
usuário crie sua lista de compras. 
Primeiramente, solicite que ele 
informe quantos produtos serão 
adicionados na lista. Depois disto,
peça para que o usuário digite os
produtos que ele vai comprar, e 
armazene em uma lista. Ao final, 
imprima a lista de compras do usuário.
"""
quant = int(input("Quanto produtos você deseja comprar? "))
produtos = []

for item in range(0, quant):
    produto = input("Digite o produto: ")
    produtos.append(produto)

print("Sua lista de compra tem os seguintes itens: ")
print(produtos)
