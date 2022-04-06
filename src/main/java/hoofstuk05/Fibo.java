package hoofstuk05;

public class Fibo {

    public String run(int n) {
            // Elk nummer is de som van de twee voorgaande nummer
            // 0 + 0 = 0
            // 0 + 1 = 1     2 + 1 = 3
            // 1 + 1 = 1     3 + 2 = 5
            // 1 + 1 = 2     5 + 3 = 8
            // output moet zijn 1 1 2 3 5 8
            int n1 = 0;
            int n2 = 1;
            int n3 = 0;
            StringBuilder outputString = new StringBuilder();

//        outputString.append(n1);
//        outputString.append(" ");
            outputString.append(n2);

            for(int start = 1;start < n; start ++) {
                n3 = n1 + n2;

                outputString.append(" ");

                outputString.append(n3);

                n1 = n2;
                n2 = n3;

            }
            return outputString.toString();
        }
}
