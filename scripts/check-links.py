"""Confere se os links e recursos locais das páginas de _site/ existem.

Links externos (http, https, mailto) não são verificados. Links quebrados que
já vieram assim do exercício original ficam em IGNORADOS, com o motivo.
"""
import glob
import os
import re
import sys
import urllib.parse

IGNORADOS = {
    # No exercício original o link foi escrito sem "https://".
    ("exercise-site-01/index.html", "www.alura.com.br"),
}

raiz = sys.argv[1] if len(sys.argv) > 1 else "_site"
quebrados = 0
for arquivo in glob.glob("**/*.html", root_dir=raiz, recursive=True):
    with open(os.path.join(raiz, arquivo), encoding="utf-8") as f:
        html = f.read()
    for url in re.findall(r'(?:href|src)="([^"]*)"', html):
        if not url or re.match(r"^(https?:|mailto:|tel:|#|//|data:|javascript:)", url):
            continue
        if (arquivo, url) in IGNORADOS:
            continue
        caminho = urllib.parse.unquote(url.split("#")[0].split("?")[0])
        alvo = os.path.normpath(os.path.join(raiz, os.path.dirname(arquivo), caminho))
        if not (os.path.isfile(alvo) or os.path.isfile(os.path.join(alvo, "index.html"))):
            print(f"{arquivo}: link quebrado -> {url}")
            quebrados += 1

print(f"{quebrados} link(s) local(is) quebrado(s)")
sys.exit(1 if quebrados else 0)
