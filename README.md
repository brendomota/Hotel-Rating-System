# Sistema de Avaliação de Hotéis

## Descrição do Projeto
O **Sistema de Avaliação de Hotéis** é um projeto desenvolvido na disciplina de Programação Orientada a Objetos (POO) utilizando a linguagem **Java** na **IDE NetBeans**. O sistema tem como objetivo analisar automaticamente comentários feitos para hotéis, classificando-os como **Negativos, Neutros ou Positivos**. Para isso, são utilizadas três bibliotecas principais:

- **Apache POI**: Manipulação e geração de planilhas Excel para armazenar os resultados das avaliações.
- **Open NLP**: Tokenização e classificação dos comentários utilizando um modelo treinado.
- **Drools**: Aplicação de regras de negócio para traduzir a classificação numérica dos comentários em avaliações compreensíveis.

## Funcionamento
1. O usuário insere um comentário sobre um hotel.
2. A biblioteca **Open NLP** processa e classifica o comentário em três categorias:
   - `0` → Negativo
   - `1` → Neutro
   - `2` → Positivo
3. A biblioteca **Drools** traduz essas classificações em avaliações legíveis:
   - `0` → "Avaliação Negativa"
   - `1` → "Avaliação Neutra"
   - `2` → "Avaliação Positiva"
4. A biblioteca **Apache POI** registra essas avaliações em uma planilha. Cada linha representa um hotel e as colunas indicam:
   - Quantidade de avaliações **Negativas**
   - Quantidade de avaliações **Neutras**
   - Quantidade de avaliações **Positivas**

## Tecnologias Utilizadas
- **Java** (Linguagem principal)
- **NetBeans** (IDE utilizada para desenvolvimento)
- **Apache POI** (Manipulação de planilhas Excel)
- **Open NLP** (Processamento de Linguagem Natural)
- **Drools** (Motor de regras de negócio)

## Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/sistema-avaliacao-hoteis.git
   ```
2. Abra o projeto no **NetBeans**.
3. Certifique-se de que as bibliotecas **Apache POI**, **Open NLP** e **Drools** estão corretamente importadas.
4. Execute o programa e insira comentários de avaliação para testá-lo.

## Contribuição
Contribuições são bem-vindas! Se desejar colaborar, siga os passos:
1. Fork este repositório.
2. Crie um branch para suas alterações (`git checkout -b minha-alteracao`).
3. Faça suas modificações e commit (`git commit -m "Minha contribuição"`).
4. Envie um pull request.