""" Exercício 8:
Crie um método que recebe uma lista 
por parâmetro (assuma que será uma 
lista de string) e retorna a menor 
string da lista (com menos caracteres).
"""


def menorString(lista):
    menor = lista[0]

    for item in lista:
        if (len(item) < len(menor)):
            menor = item

    return menor


lista = ["Diogo", "Bianca", 'Ana', "Claudete", "Jimmy"]

print(menorString(lista))
