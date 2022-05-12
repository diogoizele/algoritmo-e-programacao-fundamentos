""" Exercício 6:
  Crie um programa que aplica uma
  taxa de juros em um determinado 
  preço digitado pelo teclado. A 
  taxa aplicada deve ser:

  > Aumento de 10% caso o valor seja 
  menor do que 100;
 
  > Aumento de 20% caso o valor esteja
  entre 100 (inclusive) e 300;
 
  > Aumento de 50% caso o valor esteja
  entre 300 (inclusive) e 1000;
  
  > Imprima uma mensagem de erro se o 
  valor for negativo;

  >Ao final, seu programa deve imprimir
  o novo valor, já com a taxa aplicada.
"""
preco = float(input("Digite um preço: "))

taxaDeJuros = 0
temErro = False

if (preco < 100 and preco >= 0):
    taxaDeJuros = 1.1
elif (preco >= 100 and preco < 300):
    taxaDeJuros = 1.2
elif (preco >= 300 and preco < 1000):
    taxaDeJuros = 1.5
elif (preco < 0):
    temErro = True

precoComJuros = preco * taxaDeJuros

print(f"{precoComJuros if temErro == False else 'Erro: Valor negativo'} ")
