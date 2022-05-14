quantidadeAtletas = int(input("Digite a quantidade de atletas: "))

nomeAtletaMaisVelho = ''
nomeAtletaMaisBaixo = ''
somaAlturaDosAtletas = 0

maiorIdadeInicial = 0


for atleta in range(0, quantidadeAtletas):
    nome = input(f"\n\nNome do atleta {atleta + 1}: ")
    idade = int(input(f"Idade do atleta {atleta + 1}: "))
    altura = float(input(f"Altura do atleta {atleta + 1}: "))
    
    somaAlturaDosAtletas += altura
    
    if (idade > maiorIdadeInicial):
        maiorIdadeInicial = idade
        nomeAtletaMaisVelho = nome
        
    


print(f"\n\nA média da altura dos atletas é {somaAlturaDosAtletas / quantidadeAtletas}")    
print(f"\n{nomeAtletaMaisVelho} é o atleta mais velho")
        
        