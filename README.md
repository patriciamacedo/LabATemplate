# Lab 3 - Enunciado

## Introdução

Considere que se pretende representar uma estrutura de FileItems , diretorias e ficheiros.

Para tal optou-se por usar o ADT Tree disponibilizada no package pt.pa.adts

A classe **FileItem** serve para representar ficheiros concretos.
A classe **FileContainer** serve para representar diretorias.
Consideram-se qeu os nomes são unicos e não se podem repetir.  

# 1 – Criação da classe FileManager

* Crie a classe ***FileManager\*** que será responsável por gerir um conjunto de Ficheiros(File) e Diretorias (Folder)

* Adicione uma instância de ***TreeLinked\*** com nome *fileManager*, que será manipulada posteriormente, de forma a que permita guardar um conjunto de elementos do tipo ***FileContainer\***. A raíz da àrvore deverá conter inicialmente a pasta “*FileManagers*”.

**NOTA:** Todos os métodos seguintes deverão ser implementados invocando métodos já implementados na classe *TreeLinked* (não é necessário fazer qualquer alteração na implementação da classe).



# 2 – Implementação dos métodos principais da classe

Crie os seguintes métodos auxiliares (privados) na classe *FileManager*:

* **Position<FileContainer> find(String name)**

Devolve a posição na árvore do elemento com o nome especificado ou *null*, caso contrário. A comparação deverá ser realizada ignorando espaços à esquerda e à direita e sem levar em consideração a diferença entre minúsculas e maiúsculas.

Implemente os seguintes métodos públicos na classe *FileManager* (utilize os métodos auxiliares anteriores para realizar as validações necessárias):

* **void addFolder(String nameParent, String nameFolder) throws FileManagerInvalidOperation**

Recebe a chave da pasta ascendente (*nameParent*) e da nova pasta (*nameFolder*) adicionando a última como descendente. Caso a pasta ascendente não exista, lança uma exceção com uma mensagem descritiva. Caso a chave *nameFolder* já exista, também deverá lançar uma exceção com uma mensagem apropriada.

* **void addFileEntry(String nameParent, String nameEntry, String url) throws FileManagerInvalidOperation**

Implementação semelhante à anterior, mas aplicada a um *ficheiro* .



# 3 – Implementação dos métodos que permitem obter informações da ADT

* **int getTotalFolders()**

Devolve o número total de pastas (a raiz não deve ser incluída).

* **int getTotalFiles()**

Devolve o número total de ficheiros.

* **int getTotalEntries()**

Devolve o número total de entradas (pastas e links).

* **String getParentFolder(String name) throws FileManagerInvalidOperation**

Devolve a *name* do *folder* ascendente associada à entrada enviada ao método que será do tipo *ficheiro*. Caso a *name* não seja válido (não existe ou é do tipo *folder*) deverá lançar uma exceção.



Crie o método **toString** na classe **FileManager**. Verifique o output gerado.

```java
public String toString() {
  return "FileManager " +
         "size= " + fileManager.size() + " " +
         "{\n" + fileManager + "}";
}
```
 
Complete o método *Main*, de forma a construir uma árvore como a que foi apresentada na figura 1 (acrescente o *folder* e os *fileManager* realçados a negrito).



# 4 – Implementação dos métodos que permitem mover um nó

Adicione à interface Tree (e respetiva implementação) os seguintes métodos:

* **public boolean isAncestor(Position<E> posDesc, Position<E> posAsc)**

Verifica, recursivamente, se *posDesc* é descendente (direto ou indireto) de *posAsc*.



* **void move(Position<E> existingPosition, Position<E> newParent)**

Move (remove e insere) um nó da árvore e coloca-o como descendente de outro nó.



Implemente na classe *FileManager* o método **moveFileToFolder** tendo particular atenção às seguintes restrições:

* O destino terá que ser um folder e não um FileItem.

* O destino não poderá ser um nó descendente do nó a mover.



* **public void moveFileToFolder(String origin, String destination)  throws FileManagerInvalidOperation**


# 5 – Implementação de testes unitários

Implemente os testes unitários seguintes:

* **getTotalEntries_shouldReturnCorrectCounter();**

* **addFolder_shouldThrowException_whenFolderNameIsInvalid();**

* **moveFileToFolder_shouldThrowException_whenDestinationIsNotFolder().**

 
# 6 - Documentação

Deve documentar todas as funções e gerar o JAVADOC para a diretoria docs