#Estudando Python
"""
Hello World multi idiomas

O script exibe o idioma configurado no ambiente

Tenha a variável LANG devidamente configurada. Exemplo:

    export LANG=pt_BR

    Execução:

    python3 hello.py
    ou
    ./hello.py
    
"""
__version__ = "0.0.1"
__author__ = "Karina Cardoso Telles"
__license__ = "Unlicense"

import os
"""
O Python tem uma biblioteca que busca dados do sistema operacional. 
Se for buscado algo como os.getenv("LANG") o resultado vai ser uma variável de ambiente 
como essa vai ser retornado:  en_US.UTF-8 
O objetivo era apenas buscar o idioma, então é possível trazer apenas os caracteres que se quer 
ou fazer um split e retornar a primeira posição do array.

***********************************************************************************************
Exemplo buscando apenas os caracteres:
(Trás apenas os 5 primeiros caracteres da string)

os.getenv("LANG")[:5]

***********************************************************************************************
Exemplo usando o split e retornando apenas a posição zero do agora array de 2 posições:
(A string foi "partida" onde tinha um ponto e cada metade virou uma posição no array)

os.getenv("LANG").split(".")[0]

***********************************************************************************************
É uma boa prática definir um valor defaut caso não exista a variável de ambiente "LANG".
Exemplos com valores default:

os.getenv("LANG","en_US")[:5]
os.getenv("LANG", "en_US").split(".")[0]

**********************************************************************************************
"""

#current_language = "en_US"
current_language = os.getenv("LANG","en_US")[:5]
msg = "Hello, World"

if current_language == "pt_BR":
    msg = "Olá, mundo"
    
elif current_language == "it_IT":
    msg = "Ciao, mondo!"


print('karina'.upper())
print(57+8)
print(msg)
