#variáveis
vetor = []

#entradas
for i in range(0, 10):
    num = int (input("Informe o valor para o vetor:"))
    vetor.append(num)
#processamento
vetor.reverse()#reverte a lista que está em vetor!
for i in vetor:
    print(i)