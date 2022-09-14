#variáveis
vetor1 = []
vetor2 = []
soma = []

# entradas 
for i in range (0, 10):
    num1 = int (input("Informe o 1o número:"))
    vetor1.append(num1)
    num2 = int (input("Informe o 2o número:"))
    vetor2.append(num2)
    soma.append(num1 + num2)
for i in soma:
    print(i)
