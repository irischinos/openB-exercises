/* 
******* Primera parte:
1. Crear una función con tres parámetros que sean números que se suman entre sí.
2. Llamar a la función en el main y darle valores.
*/

public class Main {
  public static void main(String[] args) {
    suma(a:10, b:30, c:5);

    
  }

  public static void suma(int a, int b, int c) {
    int resultado;
    resultado = a + b + c;

    System.out.println(resultado);
  }
}

/* 
******* Segunda parte:
1. Crear una clase coche.
2. Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
3. Una función que incremente el número de puertas que tiene el coche.
4. Crear un objeto miCoche en el main y añadirle una puerta.
5. Mostrar el número de puertas que tiene el objeto. 
 */

public class myCar {
  public myCar(int doors) {
    this.doors = doors;
  }

  public void addDoors(int doors) {
    this.doors += doors; // incrementando el # de puertas
  }

  public void printInfo() {
    System.out.println("Doors: " + doors);
  }

  public static void main(String[] args) {
    myCar car = new myCar(4);
    car.addDoors(2);
    car.printInfo();
  } 
}