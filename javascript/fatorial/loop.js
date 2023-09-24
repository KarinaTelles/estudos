function calcularFatorial(n) {
  if (n === 0 || n === 1) {
    return 1;
  } else {
    let resultado = 1;
    for (let i = 2; i <= n; i++) {
      resultado *= i;
    }
    return resultado;
  }
}

// Exemplo de uso
const numero = 5;
const fatorial = calcularFatorial(numero);
console.log(`O fatorial de ${numero} é ${fatorial}`);
