#variáveis
vetor = []
soma = 0
#entradas
for i in range(0, 20):
    num = int (input("Informe um número: {0}/20".format(i+1)))
    vetor.append(num)
    soma = soma + num
for i in soma:
    print(i)