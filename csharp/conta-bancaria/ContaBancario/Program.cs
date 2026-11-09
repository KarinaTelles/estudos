using ContaBancario;

public class Program
{
    static void Main(string[] args)
    {
        Conta conta = new Conta();
        conta.SetNumIndicador(12345);
        conta.SetTitular("João Silva");
        conta.SetSaldo(1000.0f);
        conta.ExibirDados();
    }
}