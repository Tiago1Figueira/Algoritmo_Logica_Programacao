#entradas
quantidade_minima = float (input("Informe a quantidade mínima:"))
quantidade_maxima = float (input("Informe a quantidade maxíma:"))


#processamento
estoque_medio = (quantidade_minima + quantidade_maxima)/2

# saída 
print("O valor do estoque médio é {0}".format(estoque_medio))