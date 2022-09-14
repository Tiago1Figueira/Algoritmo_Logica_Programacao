#entrada
vetor = []
pares = []

#processamento
for i in range(0, 16):
    vetor.append(i)
    if (i>0):
        if(i % 2 == 0):
            pares.append(i)
for i in pares:
    print(i)
    