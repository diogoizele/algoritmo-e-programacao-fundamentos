A = int(input("Digite um número para A: "))
B = int(input("Digite um número para B: "))
C = int(input("Digite um número para C: "))
D = int(input("Digite um número para D: "))
E = int(input("Digite um número para E: "))

areaTriangulo = B * C
perimetroDoRetangulo = A + B + C + D
areaDoCirculo = 3.1415* E ** 2

print("A área do triângulo com base {} e altura {} é: {}".format(B, C, areaTriangulo))
print("O perímetro do retângulo A B C D E é: {}".format(perimetroDoRetangulo))
print("A área do círculo é {}".format(areaDoCirculo))
