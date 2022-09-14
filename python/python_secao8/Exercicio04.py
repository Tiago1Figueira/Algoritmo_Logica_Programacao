#variáveis
vetor = []
soma = 0

#entradas
for i in range(0, 20):
    num = int (input("Informe um número:{0}/20".format(i+1)))
    vetor.append(num)
    
#processamento
    soma = soma + num
#saída
print("{0}".format(soma))

