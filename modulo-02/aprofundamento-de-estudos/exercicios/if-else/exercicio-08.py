""" Exercício 8:
  Crie um programa que exibe um menu
  de calculadora na tela. O menu 
  exibido deve ser o seguinte:

  * Digite 1 para somar dois valores
  * Digite 2 para subtrair dois valores
  * Digite 3 para multiplicar dois valores
  * Digite 4 para dividir dois valores
  * Digite 5 para realizar uma potência entre dois valores
  * Digite 6 para realizar uma radiciação entre dois valores
  * Digite qualquer outro número para sair
  
  De acordo com a opção informada pelo
  usuário, solicite os valores necessários
  para o usuário e imprima na tela o 
  resultado da operação realizada.
"""


operacao = int(input("* Digite 1 para somar dois valores\n* Digite 2 para subtrair dois valores\n* Digite 3 para multiplicar dois valores\n* Digite 4 para dividir dois valores\n* Digite 5 para realizar uma potência entre dois valores\n* Digite 6 para realizar uma radiciação entre dois valores\n* Digite qualquer outro número para sair\n\nValor escolhido: "))


def switch(operacao):
    if operacao < 1 or operacao > 6:
        return "Saiu da calculadora..."
    else:
        match operacao:
            case 1:
                valor1 = float(input("Digite o primeiro valor: "))
                valor2 = float(input("Digite o segundo valor: "))
                return valor1 + valor2
            case 2:
                valor1 = float(input("Digite o primeiro valor: "))
                valor2 = float(input("Digite o segundo valor: "))
                return valor1 - valor2
            case 3:
                valor1 = float(input("Digite o primeiro valor: "))
                valor2 = float(input("Digite o segundo valor: "))
                return valor1 * valor2
            case 4:
                valor1 = float(input("Digite o primeiro valor: "))
                valor2 = float(input("Digite o segundo valor: "))
                return valor1 / valor2
            case 5:
                base = float(input("Digite o valor da base: "))
                expoente = float(input("Digite o valor do expoente: "))
                return base ** expoente
            case 6:
                radical = float(input("Digite o valor do radical: "))
                indice = float(input("Digite o valor do indice: "))
                return radical ** (1/indice)


print(switch(operacao))


"""
  Tentativa de implementação de um switch
  statment em Python.
  
  https://www.geeksforgeeks.org/switch-case-in-python-replacement
"""
