public class Main {
    static boolean isPalindrom(int number){
        int temp = number, lastNumber, reverseNumber=0;
        while (temp !=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){

            System.out.println(number +  " Palindrom sayıdır.");
            return true;
        }
        else{
            System.out.println(number + " Palindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        isPalindrom(232);
        isPalindrom(112);
    }
}