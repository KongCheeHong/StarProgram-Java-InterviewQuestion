public class StarProgram {
    public static void main(String[] args) {
        Program program = new Program();
        program.Output();
    }
}

class Program{
    public static final String star = "*";

    public void Output(){
        for(int x=0; x<6 ;x++){
            for (int y=0; y<x; y++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
