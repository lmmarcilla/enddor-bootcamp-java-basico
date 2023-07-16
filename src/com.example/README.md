# enddor-bootcamp-java-basico

## Ejercicio 1:

Para este primer ejercicio tendréis que realizar lo siguiente:

* Crea un proyecto de Java desde 0
* Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
* Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.

## Ejercicio 2:

Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

## Ejercicio 3:

En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}

## Ejercicio 4:

En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

## Ejercicio 5:

Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl()
