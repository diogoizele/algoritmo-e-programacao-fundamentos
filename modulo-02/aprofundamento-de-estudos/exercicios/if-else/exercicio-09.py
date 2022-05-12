""" Exercício 9:
  Crie um programa que recebe a nota
  do Grau A e a nota do Grau B pelo 
  teclado e imprime na tela se será
  necessário ou não realizar o Grau 
  C (considere o sistema de avaliação
  da Unisinos). Caso algum valor informado
  seja negativo, informe uma mensagem
  de erro e não realize o cálculo.
"""

grauA = float(input("Digite a nota do Grau A: "))
grauB = float(input("Digite a nota do Grau B: "))

resposta = ''

if grauA < 0 or grauB < 0:
    resposta = "Erro: Valor negativo"
else:
    calcula = ((grauA * 3) + (grauB * 7))/(3 + 7)
    if calcula >= 6:
        resposta = f"Com a nota {calcula} não há necessidade de realizar o Grau C"
    else:
        resposta = f"Com a nota {calcula} é necessário realizar o Grau C"

print(resposta)
