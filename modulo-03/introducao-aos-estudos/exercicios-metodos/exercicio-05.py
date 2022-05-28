""" Exercício 5:
Crie um método que recebe um valor por
parâmetro (assuma que será inteiro) e 
retorna a soma de todos os valores entre
0 e o valor recebido. Caso o valor seja
negativo, o método deve retornar -1.
"""


def somaDosValoresAte(numero):
    soma = 0
    if (numero < 0):
        return -1
    else:
      for i in range(1, numero + 1):
        soma += i
      return soma
    
print(somaDosValoresAte(2))
print(somaDosValoresAte(3))
print(somaDosValoresAte(5))