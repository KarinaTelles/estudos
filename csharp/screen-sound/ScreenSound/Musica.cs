using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScreenSound
{
    public class Musica
    {
        public string Nome { get; set; }
        public string Artista { get; set; }
        public int Duracao { get; set; }
        public bool Disponivel { get; set; }
        public void ExibirFichaTecnica()
        {
            Console.WriteLine($"Nome: {Nome}");
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
        public void ExibirNomeEArtista()
        {
            Console.WriteLine($"Nome: {Nome} - Artista: {Artista}");
        }

    }
}
