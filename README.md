# 📱 Diagrama de Classes do iPhone (Java)

Este projeto simula, de forma orientada a objetos, a estrutura de funcionalidades básicas de um iPhone — como fazer chamadas, reproduzir músicas e navegar na internet. Ele utiliza **interfaces** e **classes abstratas** em Java para representar cada um dos componentes do sistema.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Uso de interfaces Java
- Classes abstratas
- Simulação de funcionalidades reais
- Separação de responsabilidades por interface

---

## 📁 Estrutura do Projeto

├── Iphone.java
├── AparelhoTelefonico.java
├── NavegadorInternet.java
└── ReprodutorMusical.java

## 🔍 Funcionalidades Simuladas

### 🎵 Reprodutor Musical
- Reproduzir música
- Pausar música
- Avançar faixa
- Retroceder faixa

### 📞 Aparelho Telefônico
- Fazer chamadas
- Receber chamadas
- Encerrar chamadas
- Iniciar correio de voz (definido na interface)

### 🌐 Navegador de Internet
- Abrir URL
- Fechar URL
- Avançar página
- Voltar página
- Atualizar página (definido na interface)
- Adicionar nova aba (definido na interface)

---

## 🛠️ Como Executar

Este projeto é apenas uma simulação conceitual e **não contém um método `main()`**. Para executar os métodos, você pode criar uma subclasse concreta de `Iphone` e instanciá-la, como no exemplo:


public class MeuIphone extends Iphone {
    // Aqui você pode implementar o uso real dos métodos
}

public class Main {
    public static void main(String[] args) {
        MeuIphone iphone = new MeuIphone();
        iphone.reproduzirMusica();
        iphone.fazerChamada("123456789");
        iphone.abrirURL("https://www.apple.com");
    }
}
