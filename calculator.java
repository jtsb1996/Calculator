class calculator {
    public static void main(String[] args) {
        System.out.println("This is a calculator test");
    }

    // function that sums two digits
    public int add(int x, int y) {
        int results = x + y;
        return results;
    }

    // function that minus two digits
    public int subtract(int x, int y) {
        int results = x - y;
        return results;
    }

    // function that multiplies two digits
    public int multiply(int x, int y)
    {
        int results = x * y;
        return results;
    }

    // function that divides two digits
    public int divide(int x, int y)
    {
        int results = x / y;
        return results;
    }
}
