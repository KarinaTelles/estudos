using ScreenSound;
public class Program
{
    static void Main(string[] args)
    {
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

        musica1.ExibirNomeEArtista();
        musica2.ExibirNomeEArtista();
    }
}