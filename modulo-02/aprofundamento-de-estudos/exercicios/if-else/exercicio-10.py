""" Exercício 10:
  Crie um programa que solicita que
  o usuário digite uma letra e 
  imprime na tela se a letra é uma
  vogal ou uma consoante.
"""


letra = input("Digite uma letra: ")

vogaisMaiusculas = ["A", "E", "I", "O", "U"]
vogaisMinusculas = ["a", "e", "i", "o", "u"]

if (letra in vogaisMaiusculas or letra in vogaisMinusculas):
    print("É uma vogal")
else:
    print("É uma consoante")
