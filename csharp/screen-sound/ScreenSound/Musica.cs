using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScreenSound
{
    public class Musica
    {
        public string Nome { get; set; } = string.Empty;
        public string Artista { get; set; } = string.Empty;
        public int Duracao { get; set; }
        public bool Disponivel { get; set; }
        public string NomeComArtista => $"{Nome} - {Artista}";
        public void ExibirFichaTecnica()
        {
            Console.WriteLine(NomeComArtista);
            Console.WriteLine($"Nome da música: {Nome}");
            Console.WriteLine($"Artista: {Artista}");
            Console.WriteLine($"Duração: {Duracao} segundos");

            if (Disponivel)
            {
                Console.WriteLine("Disponível para streaming");
            }
            else
            {
                Console.Write("Indisponível para streamings");
            }
            Console.WriteLine("\n");
        }

        public List<int> BuscarNumerosQueSaoPares(List<int> numero)
        {
            return numero.Where(n => n % 2 == 0).ToList();
        }
    }
}
