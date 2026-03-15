# POOHerançaJava

Este é um projeto Android simples desenvolvido para demonstrar os conceitos de **Programação Orientada a Objetos (POO)**, especificamente o conceito de **Herança** utilizando a linguagem Java.

## 📝 Descrição

O projeto exemplifica a relação de herança entre funcionários de uma empresa:
- **Funcionario**: Classe base que contém atributos genéricos como nome, data de admissão, salário e data de nascimento.
- **Gerente**: Classe que estende `Funcionario`, herdando seus atributos e adicionando características específicas como comissão e total de funcionários gerenciados.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **Plataforma**: Android
- **IDE**: Android Studio

## 📂 Estrutura do Código

As classes principais de lógica de negócio estão localizadas em:
`app/src/main/java/com/blackinknit/pooheranajava/`

- `Funcionario.java`: Classe pai (superclasse).
- `Gerente.java`: Classe filha (subclasse) que utiliza `extends Funcionario`.

## 🚀 Como Executar

1. Clone o repositório.
2. Abra o projeto no **Android Studio**.
3. Sincronize o Gradle.
4. Execute o aplicativo em um emulador ou dispositivo físico.
