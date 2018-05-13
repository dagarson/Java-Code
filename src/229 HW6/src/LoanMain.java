import java.io.*;

public class LoanMain {

    public static void main(String[] args)
    		//exceptions
    		throws IOException, ClassNotFoundException {

        File inputFile = new File("Exercise17_07.dat");

        try (ObjectInputStream FILE = new ObjectInputStream(new FileInputStream(inputFile))) {

            double loanTotal = 0;
            try {
                Loan L;
                
                while ((L = (Loan)FILE.readObject()) != null) {

                loanTotal += L.getLoanAmount();
                }
                //end loop with EOFException catch
            } catch (EOFException ex) {

                System.out.println("The total loan is:  " + loanTotal);
            }
        }
    }
}