""" Exercício 7:
Crie um programa que solicita ao usuário
que ele defina sua senha. A senha deve
ser um texto (string) composto apenas 
por dígitos e deve ter entre 5 e 10 
valores. O usuário tem apenas 6 chances
de definir corretamente a senha. Caso 
ele defina corretamente a senha nas 
tentativas que ele tem, imprima uma 
mensagem de sucesso. Caso ele não defina
a senha corretamente, imprima uma 
mensagem de insucesso. Dica: na aula 
aprendemos a ver se uma string é formada
apenas por dígitos e aprendemos a 
descobrir o tamanho do texto digitado.
"""

from getpass import getpass  # Para esconder o input
from pwinput import pwinput  # Para transformar o input em *

print("\nSua senha deve ter entre 5 e 10 caracteres...\n")
senha = pwinput("Digite uma senha: ")

erro = False

for chance in range(0, 5):
    if (senha.isdigit() == False or len(senha) < 5 or len(senha) > 10):
        print("\nSenha inválida!")
        senha = pwinput("Digite novamente sua senha: ")
        if chance == 4:
            erro = True
    else:
        print("Senha definida com sucesso!")
        break


if (erro):
    print("Você não tem mais chances de definir uma senha e sua conta foi bloqueada!")
