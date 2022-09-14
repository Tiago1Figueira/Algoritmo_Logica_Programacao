#variáveis
vetor = []

#entradas
codigo = int(input("Informe um código de 0 a 2:"))

#processamento
 
if (codigo != 0):
    for n in range(0, 5):
        num = float(input("Informe um número:{0}/5".format(n+1)))
        vetor.append(num)
    
    if (codigo == 1):
        for n in vetor:
            print(n)
        
    if (codigo == 2):
        vetor.reverse()
        for n in vetor:
            print(n)
            
#teste    if (codigo < 0):
#        print("Fornecer número entre 0 e 2")
        
#   if (codigo > 2):
#      print("Fornecer número entre 0 e 2")
else: 
    print("Programa finalizado!")
    

        

        
    