""" Exercício 4:
Crie um método chamado maiorValor que 
recebe 3 valores por parâmetro (assuma
que serão inteiros) e retorna o maior 
dos três valores.
"""

def maiorValor(val1, val2, val3):
  maior = val1 if val1 > val2 else val2
  maior = maior if maior > val3 else val3
  return maior

print(maiorValor(1, 4, 2))