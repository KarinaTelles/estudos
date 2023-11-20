"""
Imprime a tabuada do 1 ao 100
"""
__version__ = "0.1.0"
__author__ = "Karina Cardoso Telles"

#Numeros base
numeros = list(range(1,11))
numeros_1_a_100 = list(range(1,101))

#Iterable (percorríveis)

#Para cada número em números:

for numero in numeros:
    print("Tabuada de 1 a 10 do ", numero)
    for outro_numero in numeros:
        print(numero,"*",outro_numero,"=", numero * outro_numero)
        print("-----------")

