using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ContaBancario
{
    public class Conta
    {
        int numIndicador;
        string titular;
        float saldo;
        int senha;

        public Conta()
        {
            numIndicador = 0;
            titular = "";
            saldo = 0;
            senha = 0;
        }
        public int GetNumIndicador()
        {
            return numIndicador;
        }
        public void SetNumIndicador(int num)
        {
            numIndicador = num;
        }
        public string GetTitular()
        {
            return titular;
        }
        public void SetTitular(string nome)
        {
            titular = nome;
        }
        public float GetSaldo()
        {
            return saldo;
        }
        public void SetSaldo(float valor)
        {
            saldo = valor;
        }
        public int GetSenha()
        {
            return senha;
        }
        public void SetSenha(int valor)
        {
            senha = valor;
        }
        public void Depositar(float valor)
        {
            saldo += valor;
        }
        public bool Sacar(float valor)
        {
            if (valor > saldo)
            {
                return false;
            }
            else
            {
                saldo -= valor;
                return true;
            }
        }
        public void ExibirDados()
        {
            Console.WriteLine($"Número do Indicador: {numIndicador}");
            Console.WriteLine($"Titular: {titular}");
            Console.WriteLine($"Saldo: {saldo}");
        }
    }
}
