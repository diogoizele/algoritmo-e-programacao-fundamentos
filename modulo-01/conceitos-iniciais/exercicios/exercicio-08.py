pesoGrauA = 1/3 * 100
pesoGrauB = 2/3 * 100

print(f"O peso do GA é {int(pesoGrauA)} e do GB é {int(pesoGrauB)}")

grauAPratica = int(
    input("Digite a nota tirada na atividade prática do grau A: "))
grauATeorica = int(
    input("Digite a nota tirada na atividade teórica do grau A: "))
grauBProva = int(input("Digite a nota tirada na prova do grau B: "))
grauBTesteTeorico = int(
    input("Digite a nota tirada no teste teórico do grau B: "))
grauBTrabalhoExtraClasse = int(
    input("Digite a nota tirada no trabalho extra da classe do grau B: "))

mediaGrauA = (grauAPratica * 45 + grauATeorica * 55) / (45 + 55)
mediaGrauB = (grauBProva * 60 + grauBTesteTeorico * 20 +
              grauBTrabalhoExtraClasse * 20) / (60 + 20 + 20)


mediaFinal = (mediaGrauA * pesoGrauA + mediaGrauB *
              pesoGrauB) / (pesoGrauA + pesoGrauB)


print(
    f"A média final tirada em todos os trabalhos do Bimestre foi: {mediaFinal:.1f}")
