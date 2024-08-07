package Abstractions.Rhombus_of_Stars;

public class Rhombus {
    private int n;

    public Rhombus(int n) {
        this.n = n;
    }

    public String getFigure(){
       return printTop() +
        printMiddle()+
        printBottom();
    }


    private String printMiddle() {
      return repeatAndPrint(n,"* ") + System.lineSeparator();
    }

    private String printBottom() {
        StringBuilder out =  new StringBuilder();
        for (int r = 1; r < n; r++) {
            out.append(repeatAndPrint(r," ")).append(repeatAndPrint(n - r,"* ")).append(System.lineSeparator());
        }
        return out.toString();
    }

    private String printTop() {
        StringBuilder out = new StringBuilder();
        for (int r = 1; r < n; r++) {
            out.append(  repeatAndPrint(n -r," ")).append( repeatAndPrint(r,"* ")).append(System.lineSeparator());
        }
        return out.toString();
    }


    private String repeatAndPrint(int count, String str) {
       return str.repeat(count);
    }
}
