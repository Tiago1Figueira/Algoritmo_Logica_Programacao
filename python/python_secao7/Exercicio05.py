#entradas
nome = input("Informe o nome:")
senha = input("Informe a senha:")

#processamento
while senha == nome: 
    print("A senha do usuário e o seu nome devem ser diferentes.")
    nome = input("Informe o nome:")
    senha = input("Informe a senha")
