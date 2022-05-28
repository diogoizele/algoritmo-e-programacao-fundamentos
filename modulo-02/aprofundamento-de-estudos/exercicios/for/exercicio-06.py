""" Exercício 6: 
Crie um programa que solicita o nome
e o estado civil de 20 pessoas pelo
teclado. Ao final, imprima apenas o
nome das pessoas separadas por estado
civil: solteiras, casadas, divorciadas
e viúvas (nesta ordem!)
"""
solteiros = []
casados = []
divorciados = []
viuvos = []

for individuo in range(0, 20):
    nome = input("Digite seu nome: ")
    estadoCivil = 0
    while(estadoCivil not in [1, 2, 3, 4]):
        print("1 - Solteiro(a)")
        print("2 - Casado(a)")
        print('3 - Divorciado(a)')
        print('4 - Viúvo(a)')
        estadoCivil = int(input("\nQual seu estado civil? "))

    if (estadoCivil == 1):
        solteiros.append(nome)
    elif (estadoCivil == 2):
        casados.append(nome)
    elif (estadoCivil == 3):
        divorciados.append(nome)
    elif (estadoCivil == 4):
        viuvos.append(nome)

print("\nNessa lista existem: \n")
print(f"Solteiros(as): {len(solteiros)}")
print(solteiros)
print(f"Casados(as): {len(casados)}")
print(casados)
print(f"Divorciados(as): {len(divorciados)}")
print(divorciados)
print(f"Viúvos(as): {len(viuvos)}")
print(viuvos)
