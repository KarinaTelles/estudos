Musica musica1 = new Musica();
musica1.nome = "Imagine";
musica1.artista = "John Lennon";
musica1.duracao = 183;
musica1.disponivel = true;


Musica musica2 = new Musica();
musica2.nome = "Bohemian Rhapsody";
musica2.artista = "Queen";
musica2.duracao = 354;
musica2.disponivel = false;
musica1.ExibirFichaTecnica();
musica2.ExibirFichaTecnica();
Console.WriteLine(musica1 + "\n");
Console.WriteLine(musica2);

Console.WriteLine($"Nome da música 2: {musica2.nome}");