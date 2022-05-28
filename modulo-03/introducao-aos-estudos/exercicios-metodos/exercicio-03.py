""" Exercício 3:
Crie um método que recebe dois valores 
val1 e val2 (assuma que serão inteiros). 
O método deve retornar verdadeiro se val1
for divisível por val2 e falso caso 
contrário."""


def ehDivisivel(val1, val2):
    return True if (val1 % val2 == 0) else False


print(ehDivisivel(4, 2))
print(ehDivisivel(5, 3))
