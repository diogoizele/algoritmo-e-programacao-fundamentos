print("\n>>> RÁDIO PETRÔNIO <<<\n")

audienciaInicial = 0
somaAudiencias = 0
crescente = True
fluxoContinuo = True

while fluxoContinuo:
    repetirFluxo = False
    quantidadeValoresAudiencia = int(input("\nDigite quantos valores de audiência você deseja analisar: "))
    
    print('\n--------------------------------------------------\n')
    for i in range(0, quantidadeValoresAudiencia):
        audiencia = float(input("\nDigite um valor para audiência: "))
    
        somaAudiencias += audiencia
    
        if ( audienciaInicial > audiencia ):
            crescente = False
        
        audienciaInicial = audiencia
    
    print('\n')
    print(f"{'AUDIÊNCIA SEMPRE CRESCENTE' if crescente else 'AUDIÊNCIA NEM SEMPRE CRESCENTE'}")
    print(f"A média das audiências é {round((somaAudiencias / quantidadeValoresAudiencia), 1)}")
 
    repetirFluxo = input("\nDeseja continuar (Y/n): ")
    
    if (repetirFluxo.lower() == 'n'):
        fluxoContinuo = False