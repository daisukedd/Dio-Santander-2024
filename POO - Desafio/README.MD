# Modelagem e Diagramação de um Componente iPhone

## Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

### Lançamento iPhone 2007
Minutos relevantes: 00:15 até 00:55

## Funcionalidades a Modelar

### Reprodutor Musical
- Métodos: 
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`

### Aparelho Telefônico
- Métodos:
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`

### Navegador na Internet
- Métodos:
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

## Objetivo
- Criar um diagrama UML que represente as funcionalidades descritas acima.
- Implementar as classes e interfaces correspondentes em Java (Opcional).

## Diagrama UML

```plantuml
@startuml
interface ReprodutorMusical {
  + void tocar()
  + void pausar()
  + void selecionarMusica(String musica)
}

interface AparelhoTelefonico {
  + void ligar(String numero)
  + void atender()
  + void iniciarCorreioVoz()
}

interface NavegadorInternet {
  + void exibirPagina(String url)
  + void adicionarNovaAba()
  + void atualizarPagina()
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  - String modelo
  - String numeroSerie

  + iPhone(String modelo, String numeroSerie)
  + String getModelo()
  + String getNumeroSerie()

  + void tocar()
  + void pausar()
  + void selecionarMusica(String musica)
  + void ligar(String numero)
  + void atender()
  + void iniciarCorreioVoz()
  + void exibirPagina(String url)
  + void adicionarNovaAba()
  + void atualizarPagina()
}
@enduml
