# PRIMEIRA SOLUÇÃO

# A = float(input("Digite um número para A: "))
# B = float(input("Digite um número para B: "))

# print(f'A multiplicado por B é {A * B}')
# print(f'A divido por b é ${A / B}')
# print(f'A mais B é {A + B} e A menos B é {A - B}')
# print(f'A elevado a B é {A ** B}')


# SEGUNDA SOLUÇÃO
operacoes = [
    {
        'operacao': "soma",
        'sinal': '+',
        'verbo': "mais"
    },
    {
        'operacao': "subtração",
        'sinal': '-',
        "verbo": "menos"
    },
    {
        'operacao': "multiplicação",
        'sinal': '*',
        "verbo": "vezes"
    },
    {
        'operacao': "divisão",
        'sinal': '/',
        "verbo": "dividido por"
    },
    {
        'operacao': "exponenciação",
        'sinal': '**',
        'verbo': 'elevado a'
    }
]


def introduzirCalculo(num1, num2, operacao):
    return f"{num1} {operacao} {num2} é "


A = float(input("Digite um número para A: "))
B = float(input("Digite um número para B: "))

for operacao in operacoes:
    print(f"\n{operacao['operacao'].upper()}:\n")
    print(introduzirCalculo(A, B, operacao['verbo']), eval(
        f"{A} {operacao['sinal']} {B}"))
    print('\n-------------------------------------\n')
