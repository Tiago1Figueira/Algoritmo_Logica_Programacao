#variáveis
vetor = []

#entradas
for i in range(0, 10):
    num = int (input("Informe o valor do número:"))
    vetor.append(num)
# processamento
vetor.reverse() # inverte a lista 
for i in vetor:
    print(i)

