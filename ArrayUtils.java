import java.util.Arrays;

public class ArrayUtils {
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("length: "+ array.length);
    }

    public void printElement(Object element){
        System.out.println(element);
    }

    public int[] removeEvenIntegers(int[] array){


        int count =0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 ==0) {
                count++;
            }
        }

        int [] result = new int[count];
        int idx = 0;
        int index = 0;
        while(index < array.length){
            if(array[index]%2 ==0){
                result[idx++] = array[index];
            }
            index++;
        }
        return result;
    }


   public int[] removeEvenIntegersV1(int[] array) {
    int slow = 0;
    for (int fast = 0; fast < array.length; fast++) {
        if (array[fast] % 2 != 0) {
            array[slow] = array[fast];
            slow++;
        }
    }

    // Resize the array to remove extra elements
    return Arrays.copyOf(array, slow);
    }

    public int[] reverseAnArray(int[] array){
        int lIndex = array.length -1;
        int[] resultArray = new int[lIndex+1];
        int idx = 0;
        while(lIndex >= 0){
            resultArray[idx++]= array[lIndex--];
        }
        return resultArray;
    }

    public int[] reverseAnArrayV1(int[] array){
        int firstIndex = 0; int lastIndex = array.length-1;
        int temp = 0;
        while(firstIndex < lastIndex){
            temp = array[firstIndex];
            array[firstIndex++] = array[lastIndex];
            array[lastIndex--] = temp;
        }
        return array;
    }

    public int minValue(int[] array){
        int idx =0;
        int min = array[0];
        while(idx<array.length){
            if(array[idx] < min  ){
                min = array[idx];
            }
            idx++;
        }
        return min;
    }

    public int secondMaxValue(int[] array){
        int secondMax = array[0];
        int max = maxValue(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] < max && array[i] > secondMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public int maxValue(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max= array[i];
            }
        }
        return max;
    }
}
