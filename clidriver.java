import java.io.*;
public class clidriver {
    public static void main(String[] args) {
        sudoku9 ob = new sudoku9();
        System.out.println("[+] Welcome to cli sudoku 9x9\n[+] Input:");
        String s[] = new String[9];
        int A[][][]= new int[9][9][10];
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<9;i++){
                s[i]=in.readLine();
                for(int j=0;j<9;j++){
                    A[i][j][0]=Integer.parseInt(""+s[i].charAt(j));
                }
            }
            ob.PrepareArray(A);
            ob.main1(A);
            if(!ob.checkComplete(A))
            do{
                ob.acceptAnAssumedValue(A);
                ob.PrepareArray(A);
                ob.main1(A);
            }while(!ob.checkComplete(A));
            //printing solved puzzle
            System.out.println("[+] Solved puzzle is:");
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print(A[i][j][0]+" ");
                }
                System.out.println();
            }

        }catch(Exception e){
            System.out.println("[-] Input Error");
        }
    }
}
