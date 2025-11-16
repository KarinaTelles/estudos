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
        public void ImprimeNumeros()
        {
            List<int> numeros = new List<int> { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
            List<int> numerosPares;
            numerosPares = BuscarNumerosQueSaoPares(numeros);
            if (numerosPares is null || numerosPares.Count == 0)
            {
                Console.WriteLine("Nenhum número par encontrado.");
                return;
            }
            else
            {
                String a = StringBuilderAssistance(numerosPares);
                Console.WriteLine($"Números pares: {a}");
            }
            String b = StringBuilderAssistance(numeros);
            Console.WriteLine($"Números originais: {b}");
        }
        public String StringBuilderAssistance(List<int> numeros)
        {
            var sb = new StringBuilder();
            foreach (var num in numeros)
            {
                if (sb.Length > 0)
                {
                    sb.Append(", ");
                }
                sb.Append(num);
            }
            return sb.ToString();
        }
    }
}
