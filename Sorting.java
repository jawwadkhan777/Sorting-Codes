package Projects;

class BubbleSort{
    char [] arr = {'P','Y','T','H','O','N'};
    char temp;
    int comparisons;
    int swappings;
    BubbleSort(){
        System.out.println("-------Bubble Sort-------");
        this.comparisons = 0;
        this.swappings = 0;
        sortArray(arr);
    }
    void sortArray(char [] arr){
        for (int i=0; i< arr.length-1; i++){
            for (int j=0; j<(arr.length-i)-1; j++){
                comparisons++;
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swappings++;
                }
            }
        }
        System.out.print("Sorted array --> ");
        for (char element: arr) {
            System.out.print(element+ " ");
        }
        System.out.println("\nTotal Comparisons: "+ comparisons);
        System.out.println("Total Swappings: "+ swappings);
    }
}
class SelectionSort {
    char [] arr = {'P','Y','T','H','O','N'};
    char temp;
    int comparisons;
    int swappings;
    SelectionSort(){
        System.out.println("-------Selection Sort-------");
        this.comparisons = 0;
        this.swappings = 0;
        sortArray(arr);
    }
    void sortArray(char [] arr){
        for(int i=0; i< arr.length-1; i++){
            int min = i;
            for (int j=i+1; j<arr.length; j++){
                comparisons++;
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            swappings++;
        }
        System.out.print("Sorted array --> ");
        for (char element: arr) {
            System.out.print(element+ " ");
        }
        System.out.println("\nTotal Comparisons: "+ comparisons);
        System.out.println("Total Swappings: "+ swappings);
    }
}
class InsertionSort {
    char [] arr = {'P','Y','T','H','O','N'};
    char temp;
    int comparisons;
    int swappings;
    InsertionSort(){
        System.out.println("-------Insertion Sort-------");
        this.comparisons = 0;
        this.swappings = 0;
        sortArray(arr);
    }
    void sortArray(char [] arr){
        for(int i=1; i<arr.length; i++){
            temp = arr[i];
            int j;
            for (j=i-1; j>=0 && arr[j]>temp; j--) {
                comparisons++;
                arr[j+1] = arr[j];
                swappings++;
            }
            arr[j+1] = temp;
        }
        System.out.print("Sorted array --> ");
        for (char element: arr) {
            System.out.print(element+ " ");
        }
        System.out.println("\nTotal Comparisons: "+ comparisons);
        System.out.println("Total Swappings: "+ swappings);
    }

}
public class Sorting {
    public static void main(String[] args) {
        new BubbleSort();
        new SelectionSort();
        new InsertionSort();
    }
}
