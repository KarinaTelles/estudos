package main

import "fmt"

// Função para calcular a série de Fibonacci até n termos
func fibonacci(n int) []int {
    fib := make([]int, n)
    fib[0], fib[1] = 0, 1
    for i := 2; i < n; i++ {
        fib[i] = fib[i-1] + fib[i-2]
    }
    return fib
}

func main() {
    n := 10 // Número de termos da série de Fibonacci que queremos calcular
    resultado := fibonacci(n)
    fmt.Printf("Série de Fibonacci com %d termos: %v\n", n, resultado)
}
