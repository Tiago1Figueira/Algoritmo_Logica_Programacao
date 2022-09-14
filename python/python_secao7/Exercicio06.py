#entradas
numero = int (input("Informe um número entre 1 e 10:"))

#processamento
while (numero < 1 or numero > 10):
    numero = int (input("Informe um número entre 1 e 10:"))
    
print("Tabuada do {0}:".format(numero))
for i in range(1,11):
    print("{0} X {1} = {2}". format(numero, i, numero * i ))