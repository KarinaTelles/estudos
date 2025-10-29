using ScreenSound;
public class Program
{
    static void Main(string[] args)
    {
        Musica musica1 = new Musica();
        musica1.Nome = "Imagine";
        musica1.Artista = "John Lennon";
        musica1.Duracao = 183;
        musica1.Disponivel = true;


        Musica musica2 = new Musica();
        musica2.Nome = "Bohemian Rhapsody";
        musica2.Artista = "Queen";
        musica2.Duracao = 354;
        musica2.Disponivel = false;

        musica1.ExibirFichaTecnica();
        musica2.ExibirFichaTecnica();

        //musica1.ExibirNomeEArtista();
        //musica2.ExibirNomeEArtista();
    }
}