# Sistema de Transações Bancárias

Este projeto em Java permite ao usuário realizar transações bancárias básicas, como depósitos, saques e transferências, com a possibilidade de continuar realizando transações ou inserir um novo titular. A aplicação utiliza a classe `Scanner` para interagir com o usuário através do console.

## Pilares POO utilizados

O projeto faz uso dos conceitos fundamentais da Programação Orientada a Objetos (POO), tais como:

- **Abstração:**
  - Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

- **Encapsulamento:**
  - Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

- **Herança:**
  - Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

- **Polimorfismo:**
  - Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

## Funcionalidades

- Entrada do nome do titular.
- Criação de contas (corrente e poupança).
- Depósito inicial na conta corrente.
- Menu de operações:
  - Saque
  - Transferência
  - Sair
- Opção para realizar nova transação ou inserir novo titular.
- Impressão dos extratos das contas.

## Passos do Procedimento

1. **Inicialização do Scanner:**
   - Utiliza `Scanner` para receber entradas do usuário, configurado para utilizar o `Locale.US`.

2. **Loop Principal:**
   - O loop principal (`while (true)`) mantém o programa em execução até que o usuário escolha sair.

3. **Entrada do Nome do Titular:**
   - Solicita ao usuário que digite o nome do titular.
   - Cria uma instância da classe `Cliente` e define o nome do titular.

4. **Criação das Contas:**
   - Cria uma instância de `ContaCorrente` e `ContaPoupanca` associadas ao titular.

5. **Depósito Inicial:**
   - Solicita ao usuário que digite o valor a ser depositado na conta.
   - O valor é lido e depositado na conta corrente (`cc`).

6. **Menu de Operações:**
   - Apresenta um menu para o usuário escolher entre sacar, transferir ou sair.
   - Com base na escolha do usuário:
     - **Saque:** Solicita o valor a ser sacado e realiza a operação.
     - **Transferência:** Solicita o valor a ser transferido e realiza a operação entre a conta corrente e a conta poupança.
     - **Sair:** Imprime os extratos das contas e encerra o programa.

7. **Nova Transação ou Novo Titular:**
   - Após uma operação, pergunta ao usuário se deseja realizar uma nova transação ou sair.
   - Se o usuário escolher continuar, permite realizar uma nova transação; caso contrário, imprime os extratos das contas e encerra o programa.

## Métodos Auxiliares

- **lerValorNumerico(Scanner scanner):**
  - Lê um valor numérico do usuário, garantindo que a entrada seja válida (apenas números).

- **lerOpcao(Scanner scanner):**
  - Lê a escolha do usuário para o menu de operações, garantindo que a entrada seja válida (1, 2 ou 3).
