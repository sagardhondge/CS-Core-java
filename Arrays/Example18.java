class Example18 {
    public static void main (String [] args){
        System.out.println("Start @ cs");
        // Multidimensional Array Create Approach 1
       String [] [] a = {{"Cyber ", "Sucess", "Training"},{"In ", "Deccan ", " Pune"}};
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Stop @ cs");

    }
}
