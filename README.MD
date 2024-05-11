# Instrucciones

## Ejercicio 1
Dentro de el paquete `ejercicio1` se encuentra parte del ejercicio que se implemento en clase, su trabajo es completar el metodo returnItem

```java
public void returnItem(int itemId, int userId)
{
// implementacion
}
```
Este método debe registrar el retorno de un ítem por parte de un usuario. Para esto, debe buscar el ítem en el ArrayList de ítems que el usuario tiene prestados. También debemos verificar que el userId sea válido, comprobando su existencia en la lista de usuarios de la biblioteca. Una vez verificados estos datos, procederemos a cambiar el estado del ítem a disponible y eliminarlo de la lista de ítems prestados del usuario.

En la clase ejercicio1.Ejercicio1 se encuentra un menú que me permite elegir entre las opciones de mostrar los ítems, prestar un ítem o devolver un ítem.

```java
       
    else if(option == 3)
    {
        System.out.println("Ingrese el id del item");
        int itemId = scanner.nextInt();
        System.out.println("Ingrese el id del usuario");
        int userId = scanner.nextInt();
        library1.returnItem(itemId, userId);
    }
          
```
Debe hacer uso de esta implementación para probar su método. Además, debe mostrar mensajes indicando si el ítem fue devuelto correctamente o si no se encontró el ítem o el usuario, tal como se muestra en el siguiente ejemplo:
### Caso exitoso
```
1. Mostrar todos los items
2. Prestar item
3. Devolver item
3
Ingrese el id del item
6
Ingrese el id del usuario
1

Se devolvio el item: El rey león prestado al  usuario: user1
```
### Caso usuario no encontrado
```
1. Mostrar todos los items
2. Prestar item
3. Devolver item
3
Ingrese el id del item
4
Ingrese el id del usuario
55

El usuario con id: 55 no se encontro en la lista de usuarios
```
### Caso item no encontrado
```
1. Mostrar todos los items
2. Prestar item
3. Devolver item
3
Ingrese el id del item
55
Ingrese el id del usuario
1

El item con id: 55 no se encontro en la lista de items prestados
```

## Ejercicio 2

Dado un valor `n` de tipo entero positivo, se debe imprimir en consola un patrón de asteriscos de la siguiente forma:

### Ejemplo
```
n = 5
*
**
***
****
*****

n = 3
*
**
***
```
## Ejercicio 3

Dado un ArrayList de tipo entero, se debe implementar el código necesario para poder eliminar los elementos duplicados de la lista.

```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(1);
list.add(2);
list.add(3);
list.add(4);

System.out.println("Lista original: " + list);

// Implementacion

System.out.println("Lista sin duplicados: " + list);
```

### Ejemplo
```
Lista original: [1, 2, 3, 1, 2, 3, 4]
Lista sin duplicados: [1, 2, 3, 4]
```

## Ejercicio 5

Dado un ArrayList de tipo entero de `n` elementos, se debe de implementar el codigo necesario para poder encontrar el elemento que mas se repite en la lista.

```java
ArrayList<Integer> list = new ArrayList<Integer>();
// agregar elementos a la lista
Random random = new Random();
for(int i = 0; i < 10; i++)
{
    list.add(random.nextInt(n));
}

// Implementacion

System.out.println("El elemento que mas se repite es: " + element);
```

### Ejemplo
```
Lista original: [1, 2, 3, 1, 2, 3, 4, 1, 2, 3]
El elemento que mas se repite es: 1
```

## Instrucciones

Los codigos son solo ejemplos, usted debe de implementar el codigo necesario para que estos funcionen correctamente.

Implementar las soluciones dentro de los archivos, `Ejercicio2.java`, `Ejercicio3.java`, `Ejercicio4.java` y `Ejercicio5.java` respectivamente.

El envio se hace mediante classroom, el archivo a enviar debe de ser un archivo comprimido en formato ZIP que contenga el codigo modificado. El formato del archivo debe de ser el siguiente:
```
nombre_apellido.zip
```