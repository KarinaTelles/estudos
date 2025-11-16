using System;
using System.Collections.Generic;
using System.Text;
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

        //Teste de lambda 
        //posso passar esse processamento pra classe ao invés de fazer isso na main
        List<int> numeros = new List<int> { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        List<int> numerosPares;
        numerosPares = musica1.BuscarNumerosQueSaoPares(numeros);
        if (numerosPares is null || numerosPares.Count == 0)
        {
            Console.WriteLine("Nenhum número par encontrado.");
            return;
        }
        else 
        {
            // Percorrer a lista e construir a saída sem imprimir item a item
            var sbp = new StringBuilder();
            foreach (var num in numerosPares)
            {
                if (sbp.Length > 0)
                {
                    sbp.Append(", ");
                }
                sbp.Append(num);
            }

            Console.WriteLine($"Números pares: {sbp}");
        }
        var sbi = new StringBuilder();
        foreach (var num in numeros)
        {
            if (sbi.Length > 0)
            {
                sbi.Append(", ");
            }
            sbi.Append(num);
        }
        Console.WriteLine($"Números originais: {sbi}");
        //musica2.ExibirNomeEArtista();
    }
}