/*Convert number from Binary to Decimal
Example
input = 101
output = 5
*/
class File9{
    public static void main(String[]args){
        int n = 1010;
        int power = 1;
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit * power;
            power = power * 2;
            n = n / 10;
        }
        System.out.println(sum);


    }
}