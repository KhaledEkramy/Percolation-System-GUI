import edu.princeton.cs.algs4.StdRandom ;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Percolation percolation = new Percolation(5) ;
        while(!percolation.percolates()){ // user input indces
            int row , col ;
            row = in.nextInt();
            col = in.nextInt();
            percolation.open(row,col) ;
        }
        System.out.println("Number of open sites: " + percolation.numberOfOpenSites());
//        while(!percolation.percolates()){ // random input indces
            //int row = StdRandom.uniformInt(100)+1 ;
            //int col = StdRandom.uniformInt(100)+1 ;
//            percolation.open(row,col);
//        }
//        System.out.println(percolation.numberOfOpenSites());
    }
}