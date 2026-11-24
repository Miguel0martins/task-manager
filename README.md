# Task Manager

Gerenciador de tarefas em Java, feito no console. Você adiciona tarefas, marca como concluídas e lista tudo, com as tarefas concluídas aparecendo primeiro.

## O que o programa faz

Menu com 4 opções:

1. **Adicionar:** pede o nome da tarefa e guarda na lista.
2. **Concluir:** mostra a lista numerada e conclui a tarefa escolhida pelo número. Confere se o número existe antes de concluir.
3. **Listar:** mostra todas as tarefas. Concluídas aparecem como `[ok]` e pendentes como `[ ]`.
4. **Sair:** encerra o programa.

Qualquer outro número mostra "Opção inválida" e o menu volta.

## Como rodar

1. Clone o repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Execute a classe `Principal`.
4. Siga as instruções no console.

## Conceitos praticados

- Orientação a Objetos: classe `Tarefa` com construtor, encapsulamento e `toString`.
- Coleções: `ArrayList` de tarefas, percorrida com `for` e `foreach`.
- Ordenação: `Comparable` com `compareTo` e `Collections.sort`, colocando as concluídas primeiro.
- Menu no console com `Scanner`, laço `while` e `if / else if`.
- Leitura de texto com `nextLine` e conversão com `Integer.parseInt`, evitando o problema do enter que sobra depois do `nextInt`.

## O que eu construí

- A classe `Tarefa` e a ordenação por status com `compareTo`.
- O esqueleto do menu: `while`, `if / else if` e opção inválida.
- A validação do número escolhido ao concluir uma tarefa, antes de usar o `get`.

## O que aprendi

- A lista fica criada fora do `while`, senão ela seria recriada vazia a cada volta do menu.
- A `ArrayList` começa a contar do zero, por isso a tarefa que o usuário vê como número 2 está na posição 1.
- O `nextInt` deixa o enter na fila e faz o `nextLine` seguinte "pular". Usar `nextLine` com `parseInt` resolve.
- Revisar o código linha por linha, pensando onde pode quebrar, ajuda a achar bugs antes de rodar.

## Melhorias futuras

- Tratar erros de digitação com `try / catch`. Hoje, digitar letras no menu derruba o programa com `NumberFormatException`.
- Opção de **remover** tarefa.
- Opção de **editar** a descrição de uma tarefa.
- Reordenar a lista depois de adicionar ou concluir. Hoje a ordenação roda só uma vez, no início.

## Autor

Miguel Martins Ferreira Barros - [GitHub](https://github.com/Miguel0martins)

Projeto feito durante o curso de Java da Alura.