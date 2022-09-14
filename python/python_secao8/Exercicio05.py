#variáveis
vetor = []
maior_que_50= False

#entradas
for n in range(0, 10):
    num = int(input("Informe um número: {0}/10".format(n+1)))
    vetor.append(num)
    
#processamento
for n in vetor:
    if (n > 50):
        print("Número {0} e Posição {1}". format(n, vetor.index(n)))
        maior_que_50 = True
        
if maior_que_50 == False:
    print("Não existem valores maiores que 50!!")