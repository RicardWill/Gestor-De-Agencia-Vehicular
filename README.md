# Gestor De Agencia Vehicular

Este proyecto es una recreación de una problemática dada utilizando la programación orientada a objetos con Java utilizando el patrón de diseño Modelo - Vista - Controlador (MVC)

## Problemática

Una agencia de autos desea llevar un control de las compras de coches y pagos por servicios técnicos
que solicitan sus clientes. Para lo cual se ofrece la siguiente información:
- La agencia se compone de uno a varios empleados, los cuales pueden ser: Vendedores o
técnicos.
- La agencia tiene de uno a varios clientes que acuden ya sea para comprar un auto o para
realizarle algún servicio técnico a su auto. Cada cliente puede comprar de uno a varios
autos, así como realizar o no de uno a varios servicios técnicos a los mismos.
- Los vendedores atienden de una a varias compras realizadas por un cliente.
- La agencia cuenta con un taller en donde es posible realizar diferentes tipos de servicio a
los coches. Estos servicios se caracterizan por tener un nombre y un costo.
- Los técnicos del taller son los encargados de realizar los servicios, a cada uno de ellos puede
asignársele de uno a varios servicios.

## Operaciones que administra el usuario en el sistema

- Gestionar clientes. Se le presentarán interfaces donde será posible capturar, editar, consultar y
eliminar toda la información relacionada con el cliente. Tomar en consideración que no será posible
tener registrado dos veces al mismo Cliente (lanzar una excepción personalizada cuando esto
suceda).
- Gestionar empleados (Vendedores y técnicos). Se le presentarán interfaces donde será posible
capturar, editar, consultar y eliminar toda la información relacionada con los empleados. Tomar en
consideración que no será posible tener registrado dos veces al mismo Empleado (lanzar una
excepción personalizada cuando esto suceda).
- Registrar compra de coche. Se presentará una interfaz donde será posible seleccionar el auto a
comprar, el vendedor que atiende y el cliente que realiza la compra. La información de los coches
puede gestionarse, es decir, integrar una funcionalidad que permita registrar datos con las
características más relevantes del objeto coche o integrar la información de los mismos como
constante.
- Solicitar servicio para un auto. Se presentará una interfaz donde el usuario podrá seleccionar el
tipo de servicio que se realizará, el cliente que lo solicita, el técnico del taller que realizará el servicio,
entre otros datos que usted considere pertinentes. Tomar en consideración que el cliente puede
seleccionar varios servicios, donde cada uno de ellos puede tener un costo específico. Al final se
debe presentar el total a pagar por todos los servicios.
- Mostrar informe que presente lo siguiente: <br>
* - Listar a todos los clientes registrados y mostrar el total de autos comprados por el mismo,
así como el total de servicios solicitados.
![imagen](https://user-images.githubusercontent.com/104460124/190926800-9cdf616a-0aff-44a6-81ef-07d3c1bcb465.png)
* - Listar a todos los vendedores de la agencia y mostrar el total de ventas realizadas.
Ejemplo
![imagen](https://user-images.githubusercontent.com/104460124/190926808-d798d7e1-ab83-4501-8efc-9bb62b477d47.png)
* - Listar a todos los técnicos de la agencia y mostrar el total de servicios atendidos.
![imagen](https://user-images.githubusercontent.com/104460124/190926826-24651f11-b504-476e-941f-a6a70d0b8a45.png)

## Consideraciones técnicas
- Implementar herencia al menos en un nivel de jerarquía
- Construir la estructura del código siguiendo el patrón de diseño MVC
- Diseñar las interfaces gráficas considerando componentes que sean adecuados e
intituivos de utilizar para el usuario
- Declarar a todos los atributos de la clase como privados, integrar a cada una de las
clases los métodos setter y getter que sean necesarios.
- Manejar las excepciones predefinidas que considere necesarias. Incluir las excepciones
solicitadas en algunos puntos de la descripción del problema.
