class Maximum {

    public void max(int a, int b) {
        if (a > b)
            System.out.println("Max: " + a);
        else
            System.out.println("Max: " + b);
    }

    public void max(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println("Max: " + a);
        else if (b > a && b > c)
            System.out.println("Max: " + b);
        else
            System.out.println("Max: " + c);
    }

    public static void main(String[] args) {

        Maximum m1 = new Maximum();

        m1.max(10, 20);
        m1.max(40, 60, 30);
    }
}