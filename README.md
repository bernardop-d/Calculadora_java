# Calculadora Console em Java

Esse é um projeto de uma **calculadora simples** feita em Java para rodar no terminal. Ela permite fazer operações de adição, subtração, multiplicação e divisão.

## Como Funciona

1. O programa pede para você informar dois números.
2. Escolha uma operação matemática: `+`, `-`, `*`, `/`.
3. O resultado é mostrado no console.
4. O valor do resultado vira o novo valor inicial (como uma calculadora contínua).
5. Para sair, digite `X`.

## Como Rodar

### Pré-requisitos

- Ter o **Java** instalado no seu computador (Java 8 ou superior).

### Passos

1. Clone ou baixe o projeto:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-console-java.git
   
2. Acesse a pasta do projeto:

cd calculadora-console-java


3. Compile o código:

javac CalculadoraConsole.java


4. Execute o programa:

java CalculadoraConsole

### Exemplo de Uso
╔════════════════════════════════╗
║                              0 ║
╠════════════════════════════════╣
║ [7] [8] [9]   /                ║
║ [4] [5] [6]   *                ║
║ [1] [2] [3]   -                ║
║ [0] [.] [=]   +                ║
╚════════════════════════════════╝
          (X para sair)

Informe o primeiro número: 10
Operação (+ - * / ou X para sair): +
Informe o segundo número: 5

╔════════════════════════════════╗
║  10,00 + 5,00                  ║
╠════════════════════════════════╣
║ [7] [8] [9]   /                ║
║ [4] [5] [6]   *                ║
║ [1] [2] [3]   -                ║
║ [0] [.] [=]   +                ║
╚════════════════════════════════╝

Resultado: 15,00

Pressione ENTER para continuar...
