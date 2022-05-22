menu = "\n\nOlá Fulano.\nDigite a opção desejada:\n1) Verificar triângulo\n2) Calcular equação do segundo grau\n3) Conferir data\n4) Verificar tamanho do texto\n5) Analisar CPF\n6) Contar caracteres\n7) Sair"
acaoValida = True


def verificarTriangulo():
    lado1 = int(input("Digite o valor do primeiro lado: "))
    lado2 = int(input("Digite o valor do segundo lado: "))
    lado3 = int(input("Digite o valor do terceiro lado: "))

    if (abs(lado2 - lado3) < lado1 < (lado2 + lado3) and
        abs(lado1 - lado3) < lado2 < (lado1 + lado3) and
            abs(lado1 - lado2) < lado3 < (lado1 + lado2)):
        if (lado1 == lado2 and lado2 == lado3):
            print("É um triângulo equilátero")
        elif (lado1 == lado2 or lado2 == lado3 or lado1 == lado3):
            print("É um triângulo isósceles")
        else:
            print("é um triângulo escaleno")

    else:
        print("Não é um triângulo")


def calcularEquacaoSegundoGrau():
    a = float(input("Digite o valor para (a): "))

    if (a == 0):
        print("A equação não é do segundo grau")
        return

    b = float(input("Digite o valor para (b): "))
    c = float(input("Digite o valor para (c): "))

    delta = (b**2) - (4 * a * c)
    print('\n')

    if delta < 0:
        print("Delta negativo, não é possuível encontrar as raízes reais")
        return
    elif delta == 0:
        x = -b / (2 * a)
        print(
            f"O delta é igual a 0, por isso só há uma raiz real, sendo ela {x}")
    else:
        x1 = (-b + (delta ** (1 / 2))) / (2 * a)
        x2 = (-b - (delta ** (1 / 2))) / (2 * a)
        print(f"As duas raízes são x1: {x1} e x2: {x2}")


def conferirData():
    dia = int(input("Digite um dia: "))
    mes = int(input("Digite um mês: "))
    ano = int(input("Digite um ano: "))

    dataValida = True

    if (mes >= 1 and mes <= 12):
        if mes in [1, 3, 5, 7, 8, 10, 12]:
            if (dia < 1 or dia > 31):
                dataValida = False
        elif mes in [4, 6, 9, 11]:
            if (dia < 1 or dia > 30):
                dataValida = False
        elif (mes == 2):
            if (dia < 1 or dia > 28):
                dataValida = False
    else:
        dataValida = False

    print("Data inválida") if not dataValida else print("Data válida")


def verificarTamanhoTexto():
    texto = input("Digite um texto: ")
    tamanho = len(texto)

    if tamanho < 5:
        print("O texto é muito pequeno")
    elif tamanho >= 5 and tamanho < 15:
        print("O texto é de tamanho médio")
    elif tamanho >= 15 and tamanho < 20:
        print("O texto é grande")
    else:
        print("O texto é inválido")


def analisarCpf():
    cpf = input("Digite um CPF (apenas números): ")

    if len(cpf) != 11:
        print("CPF inválido")
        return

    if cpf.isdigit():
        print("CPF válido")
    else:
        print("CPF inválido")


def contarCaracteres():
    vogaisExemplos = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']

    vogais = 0
    espacos = 0
    outrosCaracteres = 0  # Consoantes ou caractéres especiais
    texto = input("Digite um texto qualquer: ")

    for (i, letra) in enumerate(texto):
        vogais += vogaisExemplos.count(letra)

    espacos = texto.count(' ')

    outrosCaracteres = len(texto) - vogais - espacos

    print(
        f"\nO texto possui:\n{vogais} vogais\n{espacos} espaços em branco\n{outrosCaracteres} outros caracteres (consoantes e caractéres especiais)")


def opcaoEscolhida(opcao):
    return print(f"\nVocê escolheu a opção\n>>>{opcao}<<<\n")


while acaoValida:
    print(menu)
    acao = acao = int(input("Escolha uma ação para continuar: "))

    if acao == 1:
        opcaoEscolhida("Verificar triângulo")
        verificarTriangulo()
    elif acao == 2:
        opcaoEscolhida("Calcular equação do segundo grau")
        calcularEquacaoSegundoGrau()
    elif acao == 3:
        opcaoEscolhida("Conferir data")
        conferirData()
    elif acao == 4:
        opcaoEscolhida('Verificar tamanho do texto')
        verificarTamanhoTexto()
    elif acao == 5:
        opcaoEscolhida('Analisar CPF')
        analisarCpf()
    elif acao == 6:
        opcaoEscolhida('Contar caracteres')
        contarCaracteres()
    elif acao == 7:
        print("\nObrigado por utilizar nosso sistema.")
        acaoValida = False
    else:
        print("Erro: a ação escolhida é inválida.")
        acaoValida = False
