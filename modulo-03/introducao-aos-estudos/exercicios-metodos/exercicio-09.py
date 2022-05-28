""" Exercício 9:
Crie um método que recebe dois parâmetros,
que serão um inteiro N e uma string S 
(nesta ordem). O método deve imprimir na 
tela N vezes a string S.
"""

def imprimeInteiro(N, S):
  for _ in range(0, N):
    print(S)
    
imprimeInteiro(6, 'Diogo é lindão')