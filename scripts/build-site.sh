#!/usr/bin/env bash
# Monta o site do GitHub Pages em _site/ a partir das pastas de estudo.
# Os arquivos não são duplicados no repositório: são copiados só na hora do build.
set -euo pipefail
cd "$(dirname "$0")/.."
rm -rf _site
mkdir -p _site
cp -r site/. _site/

# destino no site  <-  pasta no repositório
demos=(
  "rpg-dragon-repeller:jogos/rpg-dragon-repeller"
  "personal-page:web/freecodecamp-personal-page"
  "exercise-site-01:web/exercise-site-01"
  "front-01:web/front-01"
  "front-02:web/front-02"
  "heart-animation:web/heart-animation"
  "registration-form:web/registration-form"
  "alura-mobile-first:web/alura-mobile-first"
  "html-and-css-2:web/html-and-css-2"
  "gustavo:web/gustavo"
  "bootstrap-css:web/bootstrap-css"
  "numero-secreto:javascript/numero-secreto"
)
for d in "${demos[@]}"; do
  cp -r "${d#*:}" "_site/${d%%:*}"
done

# Pong: o pong.js original não tem HTML; site/pong/index.html carrega o p5.js.
# O código chama loadSound("trilha.mp3"), então os sons vão para a mesma pasta.
cp jogos/pong/pong.js _site/pong/
cp "jogos/pong/Pong - Sons/"*.mp3 _site/pong/
find _site -name README.md -delete
echo "Site montado em _site/"
