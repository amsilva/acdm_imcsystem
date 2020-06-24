#### @imccontrol

##### 1. apresentação
O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. Desenvolvido pelo polímata Lambert Quételet no fim do século XIX, trata-se de um método fácil e rápido para a avaliação do nível de gordura de cada pessoa, sendo, por isso, um preditor internacional de obesidade adotado pela Organização Mundial da Saúde (OMS). Ele é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, em que a massa está em quilogramas e a altura em metros. [wikipedia](https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal)

##### 2. projeto

###### Regra para cálculo do IMC 

> imc = peso / (altura * altura)

###### Regra para classificação (simplificado)

> |imc|classificacao|
> |---|-------------|
> |até 18|magro|
> |acima de 30|sobrepeso|
> |de 18 a 30|regular|

###### Diagrama de classe (UML) das entidades básicas de negócio

![alt text](https://www.linkpicture.com/q/arroba_imccontrol_diagramaclasse_entidades.png)

##### 3. revisões
- [x]  (definition) estrutura básica de _<<entity>>>_ de negócio e encapsulamento de atributos básicos
- [x]  (implementation) classe de teste estatica
- [x]  (definition) uso de classe _<<rule>>_ e acesso estatico
- [x]  (refactoring) modificacao de projeto. uso de entidade coesa Avaliacao e novos encapsulamentos de negocio
- [x]  (implementation) associacao 1/1
- [x]  (implementation) associacao 1/* e encapsulamento do relacionamento para manipulacao das avaliacoes
- [ ]  (test) teste interativo por console
- [ ]  (refactoring) responsabilidade controlador _<<controler>>_
- [ ]  (test) persistência de dados