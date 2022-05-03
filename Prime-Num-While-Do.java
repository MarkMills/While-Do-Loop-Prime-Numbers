class Main {
    public static void main(String[] args) 
    {
    System.out.println("Prime numbers");
    
    int i = 2;
    int count = 0;

    do {
        if (numberIsPrime(i)) {
            System.out.println(i);
            //i++;
            count++;
        } i++;
    } while (count < 25);
    }
        public static boolean numberIsPrime(int p) {
            boolean returnValue = true;
            for (int x = 2; x <= (p / 2); x++) {
                if (p % x == 0)
                    returnValue = false;
            }    
        return returnValue;
        }
}
