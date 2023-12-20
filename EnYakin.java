import java.util.Scanner;
import java.util.Arrays;
public class EnYakin {

    public static void main(String[] args) {
        int arrayLength;
        int[] myArray;

        Scanner input = new Scanner(System.in);
        System.out.print("Array eleman sayısını girin:  ");
        arrayLength = input.nextInt();

        myArray = new int[arrayLength];

        for(int i = 0; i < arrayLength;i++){
            System.out.print("Arrayın " + (i+1) +". elemanını girin:  ");
            myArray[i] = input.nextInt();
        }

        // myArrayı  sıraya koyuyoruz

        Arrays.sort(myArray);

        // aranan sayıyı girin

        System.out.print("Array içinde aranan sayısını girin:  ");
        int searchedNumber = input.nextInt();

        // aradığımız sayının arraydeki her
        int [] differenceArray = new int[myArray.length];
        for(int i = 0; i < myArray.length;i++){
            differenceArray[i] = myArray[i] - searchedNumber ;

        }

        // sayıdan küçük en yakın sayıyı bulmak için

        //  Örnek olarak    Array = { 1,4,7,9,11 } olsun  hedef değer de 5 olsun, yeni bir arraye hep 5 den farklarını kaydedelim

        //             farkArray = { -4,-1,2...  }   pozitife geçtikten 1 önceki değer aradığımız en yakın küçük değer,

        //             pozitife geçtiği değer de en yakın büyük değer, en yakın değerin indexinin 1 küçüğünü alıcaz küçük sayıyı bulmak için

        // bu index değerini  sort edilmiş myArrayde kullanıcaz.
        int buyukYakin = 0;
        int kucukYakin = 0;

        if(myArray[0] > searchedNumber || myArray[myArray.length-1]<searchedNumber) {
            System.out.println("Aranan sayı Dizi sınırları içinde değil");
            return;
        }

        for(int i = 0 ; i < differenceArray.length ; i++){
            if(differenceArray[i] > 0){

                buyukYakin = myArray[i];
                kucukYakin = myArray[i-1];
                break;
            }

        }

    System.out.println(Arrays.toString(myArray) +" Arrayında "+searchedNumber +"'e en yakın 2 sayı:  ");
    System.out.print(kucukYakin+" , "+buyukYakin);


    }



}
