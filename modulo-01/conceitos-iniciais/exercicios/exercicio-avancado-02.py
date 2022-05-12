from math import sqrt


coeficienteA = float(input("Digite o coeficiente A: "))
coeficienteB = float(input("Digite o coeficiente B: "))
coeficienteC = float(input("Digite o coeficiente C: "))

delta = ((coeficienteB ** 2) - (4 * coeficienteA * coeficienteC))

raiz1 = 'Raiz inválida'
raiz2 = 'Raiz inválida'


if (delta > 0 and coeficienteA != 0 and sqrt(delta) is not complex):
    raiz1 = (-coeficienteB + sqrt(delta)) / (2 * coeficienteA)
    raiz2 = (-coeficienteB - sqrt(delta)) / (2 * coeficienteA)

print(f"X1: {raiz1}")
print(f"X2: {raiz2}")
