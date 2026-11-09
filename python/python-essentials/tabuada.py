"""
Imprime a tabuada do 1 ao 100
"""
__version__ = "0.1.0"
__author__ = "Karina Cardoso Telles"

#Numeros base
range10 = list(range(1,11))

#Iterable (percorríveis)

#Para cada número em números:

for fatorMultiplicando in range10:
    print("Multiplication table, 1 to 10: ",fatorMultiplicando)
    for fatorMultiplicador in range10:
        print(fatorMultiplicando,"*",fatorMultiplicador,"=", fatorMultiplicando * fatorMultiplicador)
        print("-----------")


