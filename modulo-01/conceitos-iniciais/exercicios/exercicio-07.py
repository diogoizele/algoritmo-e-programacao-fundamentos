notaTrabalho = int(input("Digite sua nota do trabalho: "))
notaProva = int(input("Digite sua nota da prova: "))
notaTeste = int(input("Digite sua nota do teste: "))

notaFinal = (notaTrabalho * 10 + notaProva *
             60 + notaTeste * 30) / (10 + 30 + 60)

print("Sua nota final é: {}".format(notaFinal))
