print("\n>>> NÚMEROS PERFEITOS <<<\n")

numeroPerfeito = int(input("Digite um número perfeito: "))

while numeroPerfeito > -1:
    divisores = []
    
    for i in range(0, numeroPerfeito):
        multiplo = i + 1
        
        if numeroPerfeito % multiplo == 0:
            divisores.append(multiplo)
    
    soma = 0
    
    formataSomas = ""
    formataDivisores = ""
    for j in range(0, len(divisores) - 1):
        divisor = divisores[j]
        
        soma += divisor
        
        if (j + 1 != len(divisores) - 1):
            formataDivisores += f"{divisor}, "
            formataSomas += f"{divisor}+"
        else:
            formataDivisores = formataDivisores[0: len(formataDivisores) - 2]
            formataDivisores += f" e {divisor}"
            formataSomas += f"{divisor}"
        

        
    print(f"{numeroPerfeito} >> divisores {formataDivisores} >> {formataSomas} = {soma}. Logo, {numeroPerfeito} {'é um número perfeito.' if numeroPerfeito == soma else 'não é um número perfeito.'}")
    
    numeroPerfeito = int(input("\nDigite um número perfeito: "))
    
    