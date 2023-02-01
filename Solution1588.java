/*
Si la longitud del arreglo es impar, lo primero es sumar cada uno y multiplicarlo por dos
Las cantidad de combinaciones posibles se obtiene restando a la longitud del arreglo dos, estos es, array.length - 2
Y se arranca con un un for para sumar desde 
*/

class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
      int response = 0;
      int max = arr.length % 2 == 0 ? arr.length - 1 : arr.length;

      for (int i = 1; i <= max; i += 2) {
        response += sumOddLengthSybarraysRequested(i, arr);
      }

      return response;
      
    }

  private int sumOddLengthSybarraysRequested(int longitude, int[] array){
    int sum = 0;
    
    for(int i = 0; i <= array.length - longitude; i++) {
      for(int j = i; j < i + longitude; j++) {
        sum += array[j];
      }
    }

    return sum;
  }
}