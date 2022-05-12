print("CADASTRO DE ENDEREÇO")
rua = input("Informe o nome da rua: ")
numero = input("Informe o número da casa: ")
bairro = input("Informe o nome do bairro: ")
cidade = input("Informe o nome da cidade: ")
estado = input("Informe a sigla da UF: ")
cep = input("Informe o número do CEP: ")

print("Endereço cadastrado: \n{}, {}, {} - {}-{}. {}".format(
    rua, numero, bairro, cidade, estado, cep))
