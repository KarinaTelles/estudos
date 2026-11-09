# Estudos

Aqui estão juntos os repositórios pequenos que fui criando enquanto estudava, de 2020 até 2025: exercícios de cursos (Alura, freeCodeCamp, dev.java), desafios do HackerRank, testes de linguagens e alguns sites e jogos simples. Antes cada um era um repositório separado no meu GitHub; agora cada um virou uma pasta.

O histórico de commits de cada projeto veio junto. Usei `git filter-repo --to-subdirectory-filter` para mover os arquivos para a pasta nova e depois juntei tudo com merge, então `git log -- java/oop` mostra os commits originais do repositório `oop`, com as datas de quando foram feitos.

Na importação tirei do estado atual o que não é código-fonte: `.class`, `.dll`, `.pdb`, `.exe`, pastas `bin/`, `obj/`, `.idea/`, `.vs/`, `node_modules/` e arquivos de backup `~`. Eles continuam no histórico, só não estão mais na versão atual.

É material de estudo: muita coisa está incompleta, tem código repetido e algumas pastas são só anotações. Deixei como estava.

## Sites e jogos no navegador

Parte das pastas roda direto no navegador e é publicada no GitHub Pages pelo workflow `.github/workflows/pages.yml`. O script `scripts/build-site.sh` monta o site em `_site/` copiando as pastas na hora do build, sem duplicar arquivos no repositório. A página inicial fica em `site/index.html`.

Para ver localmente:

```sh
./scripts/build-site.sh
python3 -m http.server 8000 --directory _site
```

Para publicar, em Settings > Pages do repositório escolha "GitHub Actions" como fonte.

## Índice

| Pasta | O que é | Repositório original |
|---|---|---|
| **desafios/** | | |
| `desafios/hackerrank/30-days-of-code` | Primeiros dias do 30 Days of Code do HackerRank, em Java. | 30DaysOfCodeHackerRank |
| `desafios/hackerrank/java-eof` | Exercício "Java End-of-file" do HackerRank. | HACKER_RANK__EOF |
| `desafios/hackerrank/java-datatypes` | Exercício "Java Datatypes" do HackerRank, feito com o JDK 23. | HACKER_RANK__EXERCISE_JAVA_DATATYPES__JDK_23 |
| `desafios/code-it` | Solução em Java de um desafio sobre voos (classe `Voo`). | code-it |
| **java/** | | |
| `java/adivinhador-e-conversor-de-temperatura` | Adivinhador de número e conversor de temperatura, do curso de Java da Alura. | AdivinhadorDeNumeroEConversorDeTemperatura |
| `java/agenda-de-contatos` | Projeto Spring Boot gerado para uma agenda de contatos; só o esqueleto inicial. | agendaDeContatos |
| `java/array` | Exercícios de arrays e ordenação, a partir do dev.java. | Array |
| `java/banco-online` | Simulação simples de conta bancária. | BancoOnline |
| `java/data-structure` | Implementações de array, array bidimensional, fila e pilha. | DataStructure |
| `java/desenvolvimento-real-de-software` | Analisador de extrato bancário em CSV, acompanhando o livro "Desenvolvimento Real de Software". | DESENVOLVIMENTO_REAL_DE_SOFTWARE |
| `java/gera-numero-aleatorio` | Jogo de adivinhar um número aleatório. | GeraNumeroAleatorio |
| `java/lista-de-exercicios` | Lista de exercícios com menus no console. | listaDeExercicios |
| `java/matematica` | Fatorial, Fibonacci, permutação, análise combinatória e outras ideias de matemática. | Matematica |
| `java/metodos-array` | Anotações sobre métodos de array em Java (só o README). | metodosArrayJava |
| `java/oop` | Exercício de orientação a objetos com bicicletas, a partir do dev.java. | oop |
| `java/ordena-strings` | Ordenação de uma lista de strings. | OrdenaStrings |
| **csharp/** | | |
| `csharp/conta-bancaria` | Classe de conta bancária em C#. | ContaBancario |
| `csharp/screen-sound` | Começo do ScreenSound: classe `Musica` com ficha técnica. | ScreenSound |
| `csharp/dotnet-framework-exercise` | Hello world de console em .NET Framework. | dotnet-framework-csharp-exercise |
| `csharp/razor-pages-movie` | Tutorial de Razor Pages da Microsoft (cadastro de filmes com Entity Framework). | razor-pages-start-exercise |
| **python/** | | |
| `python/bubble-sort` | Bubble sort em Python. | bubbleSortPython |
| `python/python-essentials` | Primeiros scripts em Python: hello world e tabuada. | pythonEssentials |
| `python/python-workout` | Exercícios de dicionários e funções. | python_workout |
| **go/**, **lua/**, **c/** | | |
| `go/go-essentials` | Fibonacci em Go. | GoEssentials |
| `lua/lua-essentials` | Hello world em Lua. | luaEssentials |
| `c/simulador-portas-logicas` | Simulador de portas lógicas em C, de uma aula de eletrônica. | SimuladorPortaLogic |
| **banco-de-dados/** | | |
| `banco-de-dados/agenda-de-contatos-sql` | Script SQL da agenda de contatos. | agendaDeContatosScript |
| `banco-de-dados/mongodb-essentials` | Anotações de primeiros passos com MongoDB (só o README). | MongoDBEssentials |
| **javascript/** | | |
| `javascript/fatorial` | Fatorial com laço e com recursão. | FatorialJavaScript |
| `javascript/front-logica` | Páginas HTML com exercícios de lógica em JavaScript (IMC, combustível, idades). | FrontLogica |
| `javascript/numero-secreto` | Jogo do número secreto, do curso de lógica da Alura. | ExerJS |
| **web/** | | |
| `web/alura-mobile-first` | AluraBooks, exercício de mobile first da Alura com SwiperJS. | ALURA__MOBILE_FIRST |
| `web/exercise-site-01` | Landing page "Alura Plus", exercício de HTML e CSS. | EXERCISE_SITE_01 |
| `web/freecodecamp-personal-page` | Página pessoal da certificação Responsive Web Design do freeCodeCamp. | FREECODECAMP__PERSONAL-PAGE |
| `web/front-01` | Primeira versão de um portfólio. | front_01 |
| `web/front-02` | Portfólio com página "Sobre mim". | front_02 |
| `web/gustavo` | Tarefa de HTML que fiz para ajudar um colega. | Gustavo |
| `web/html-and-css-2` | Exercício de HTML e CSS. | HTMLANDCSS2 |
| `web/heart-animation` | Coração pulsando com animação de CSS. | INSTA__EXERCISE_HEART_ANIMATION |
| `web/bootstrap-css` | Página curta de teste de CSS, com o Bootstrap instalado pelo npm. | js |
| `web/materializecss-mrcs-adv` | Exercício com o Materialize CSS. | materializecss-exercise-mrcs-adv |
| `web/registration-form` | Formulário de cadastro do freeCodeCamp. | RegistrationForm |
| `web/site-hugo-papermod` | Teste do gerador de sites Hugo com o tema PaperMod; o tema não veio junto. | siteHugo-PaperMod |
| **jogos/** | | |
| `jogos/rpg-dragon-repeller` | RPG em JavaScript do freeCodeCamp. | FREE_CODE_CAMP__EXERCISE_RPG_DRAGON_REPELLER |
| `jogos/pong` | Pong em p5.js do curso da Alura, com sons. | Pong |
| `jogos/oktagon-unity` | Oktagon, jogo em Unity controlado pelas setas. | game |
