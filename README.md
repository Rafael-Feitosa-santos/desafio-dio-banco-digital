# Desafio DIO - Banco Digital

Este projeto foi desenvolvido como parte do **Desafio DIO** (Digital Innovation One) de criação de um sistema bancário simulado. O sistema permite a criação de contas bancárias (Conta Corrente e Conta Poupança), realizando operações como **depósito**, **saque** e **transferência**, com a implementação de uma estrutura simples de contas, clientes e um banco para gerenciar as contas.

## Funcionalidades

- **Criar uma conta corrente ou poupança**
- **Depositar valores nas contas**
- **Sacar valores das contas**
- **Transferir valores entre contas**
- **Imprimir extrato de conta** (informações sobre saldo, agência, número da conta e cliente)

## Estrutura do Projeto

### **Classes e Funções**

1. **Cliente**:
   - A classe `Cliente` representa o cliente do banco, contendo apenas o atributo `nome` e um getter e setter para manipulação.
   
2. **Conta** (Abstrata):
   - Classe abstrata que implementa a interface `IConta`. Contém os atributos `agencia`, `conta`, `saldo` e o cliente associado à conta.
   - A classe possui os métodos: `sacar(double valor)`, `depositar(double valor)`, e `transferir(double valor, Conta contaDestino)`.

3. **ContaCorrente** e **ContaPoupanca**:
   - São subclasses de `Conta`, representando tipos específicos de contas. Ambas implementam o método `ImprimirExtrato()` para mostrar informações detalhadas sobre a conta.

4. **Banco**:
   - A classe `Banco` gerencia uma lista de contas. Ela possui métodos para adicionar contas ao banco e imprimir uma lista de todas as contas cadastradas.

5. **Main**:
   - A classe principal (`Main`) é responsável por executar as operações principais do sistema, como a criação de contas, depósitos, transferências e exibição de extratos.

## Como Rodar o Projeto

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/banco-digital.git
