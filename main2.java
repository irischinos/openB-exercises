/* 
En este ejercicio practicarás las estructuras de control, para ello deberás crear:
1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
3. Incrementar el valor de la variable en uno cada vez que se ejecute.
4. Mostrarlo por pantalla cada vez que se ejecute.
5. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
6. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
7. Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. 
*/

public class Main {

  public static void main(String[] args) {
      // if, else if y else
      int numeroIf = 0;

      if (numeroIf < 0){
          System.out.println("La variable numeroIf " + numeroIf + " es negativa");
      }
      else if(numeroIf>0){
          System.out.println("La variable numeroIf " + numeroIf + " es positiva");
      } else {
          System.out.println("La variable numeroIf es 0");
      }

      //while
      int numeroWhile = 1;

      while(numeroWhile < 3){
          numeroWhile++;
          System.out.println("La variable numeroWhile ahora es: " + numeroWhile);
      }

      //do while
      //Al no cumplirse la condición, solo entra en el bucle 1 vez
      int numeroDoWhile = 3;
      do{
          numeroDoWhile++;
          System.out.println("La variable numeroDoWhile ahora es: " + numeroDoWhile);
      }while(numeroDoWhile < 3);

      //for
      for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
          System.out.println("La variable numeroFor ahora es: " + numeroFor);
      }

      // usando switch
      String estacion = "otoño";
      switch(estacion) {
          case "otoño":
            System.out.println("Estamos en otoño");
          break;
          case "verano":
              System.out.println("Estamos en verano");
              break;
          case "invierno":
              System.out.println("Estamos en invierno");
              break;
          case "primavera":
              System.out.println("Estamos en primavera");
              break;
          default:
              System.out.println("No es una estación");
      }
  }
}