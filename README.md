![Banner](https://user-images.githubusercontent.com/75648725/159798525-f385387b-e6bb-474f-8863-b70fb19d045a.png)
  
  
# Problema "Trem de Carga"  
```
      oooOOOOOOOOOOO"
     o   ____          :::::::::::::::::: :::::::::::::::::: __|-----|__
     Y_,_|[]| --++++++ |[][][][][][][][]| |[][][][][][][][]| |  [] []  |
    {|_|_|__|;|______|;|________________|;|________________|;|_________|;
     /oo--OO   oo  oo   oo oo      oo oo   oo oo      oo oo   oo     oo
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
```
### O problema:  
Considere a seguinte situação: Um trem de carga transporta caixas com produtos entre as
localidades **A** e **B**, mas só quando a quantidade de caixas acumuladas chegar a **N**. Inicialmente, o
trem fica parado (bloqueado) em **A** enquanto não houver **N** caixas para transportar. Quando a
quantidade de caixas chegar a **N**, o trem deve transportar exatamente **N** caixas de **A** para **B**, e em
seguida voltar para **A**. Caso existam outras **N** caixas, o trem parte imediatamente; caso contrário,
o trem fica parado (bloqueado) novamente até que existam as **N** caixas. Os produtos a serem
transportados são embalados nas caixas pelos empacotadores; cada empacotador, quando tem
uma caixa pronta, coloca a caixa em um depósito da estação de trem que tem capacidade para
armazenar **M** caixas (**M** ≥ **N**). Cada empacotador trabalha continuamente embalando caixas e
armazenando no depósito. Quando o depósito estiver cheio, os empacotadores que tentarem
armazenar suas caixas devem dormir (bloqueados). Usando semáforos, modele o thread trem e o
thread empacotador, lembrando que podem existir muitos empacotadores e apenas um trem.  
### Configuração:  
**M** = quantidade de caixas que podem ser armazenadas no depósito da estação de trem.  
### Thread Trem:  
Durante a criação do thread trem devem ser definidos os seguintes parâmetros:  
- **N** = quantidade de caixas que devem ser transportadas pelo trem.  
- **tv** = tempo de viagem (tempo que o trem gasta para viajar de A até B e vice-versa). A
interface deve mostrar que o processo trem está executando durante todo este tempo com o
status “viajando de A para B” ou “viajando de B para A”.  
### Thread Empacotador:  
Durante a criação do thread empacotador devem ser definidos os seguintes parâmetros:  
- **id** = identificador do empacotador.
- **te** = tempo de empacotamento (tempo que o empacotador gasta para embalar uma caixa). A
interface deve mostrar que o empacotador está executando durante todo este tempo com o
status “empacotando”.  
### Observação:
A interface deve mostrar, a cada instante, a quantidade de caixas armazenadas no depósito e o
status de cada processo empacotador (empacotando, colocando a caixa no depósito ou dormindo)
e do processo trem (viajando de **A** para **B**, viajando de **B**, para **A** ou parado).  
  
*@By [Gabriel Vieira](https://github.com/gabriel-vieira06) | [Guilherme Araujo](https://github.com/Guibr99) | [Luiz Sena](https://github.com/Luizerz)*
