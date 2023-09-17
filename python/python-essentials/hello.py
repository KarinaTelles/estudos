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

current_language = "en_US"
msg = "Hello, World"

if current_language == "pt_BR":
    msg = "Olá, mundo"
    
elif current_language == "it_IT":
    msg = "Ciao, mondo!"


print('karina'.upper())
print(57+8)
print(msg)
