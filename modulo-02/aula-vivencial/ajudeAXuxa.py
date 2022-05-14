quantidadeDePatinhos = int(input(">>> Ajude a Xuxa <<<\nQuantos patinhos foram passear? "))

for patinho in  range(0, quantidadeDePatinhos):
    numeroPatinhos = quantidadeDePatinhos - patinho

    existemMuitosPatinhos = numeroPatinhos > 1
    formataPrimeiraLinha = f"{numeroPatinhos} patinhos\nForam passear"  
    formataSetimaLinha = f"Mas só {numeroPatinhos - 1} {'patinho' if numeroPatinhos - 1 == 1 else 'patinhos'}"
    formataOitavaLinha = f"{'Voltou' if numeroPatinhos - 1 == 1 else 'Voltaram'} de lá"
    if (numeroPatinhos == 1):
        formataSetimaLinha = 'Mas nenhum patinho'
        formataOitavaLinha = "Voltou de lá"

    print('\n')
    print(f"{formataPrimeiraLinha if existemMuitosPatinhos else '1 patinho foi passear'}")
    print("Além das montanhas\nPara brincar\nA mamãe gritou\nQuack quack quack")
    print(formataSetimaLinha)
    print(formataOitavaLinha)


print("\n\nA mamãe patinha\nFoi procurar\nAlém das montanhas\nNa beira do mar\nA mamãe gritou\nQuack quack quack")
print(f"E os {quantidadeDePatinhos}")
print("Voltaram de lá\n")

print("Ufaaa! o programa acabou!")