Estudando Python
"""
******* Hello World multi idiomas*******

O script exibe o idioma configurado no ambiente.

Tenha a variável LANG devidamente configurada. Exemplo:

    export LANG=pt_BR (ou seu idioma de preferência).

    Execução:
    python3 hello.py
    ou
    ./hello.py (exige que o compilador default esteja configurado)
    
"""
__version__ = "0.0.1"
__author__ = "Karina Cardoso Telles"
__license__ = "Unlicense"

import os
"""
O Python tem uma biblioteca que busca dados do sistema operacional. 
Se for buscado algo como os.getenv("LANG") uma variável de ambiente parecida com essa vai ser retornada:  en_US.UTF-8 
Como o objetivo era apenas buscar o idioma, então será necessário trazer apenas os caracteres antes do ".UTF-8"

***********************************************************************************************
Exemplo buscando apenas os 5 primeiros caracteres da String:

os.getenv("LANG")[:5]

***********************************************************************************************
Exemplo usando o split e retornando apenas a posição zero:
(A String foi "partida" onde tinha um ponto e cada metade virou uma posição no array("0" e "1"))

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
