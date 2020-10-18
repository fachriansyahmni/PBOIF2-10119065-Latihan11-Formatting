/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini berisi program formatting
 *
 */
package pboif2_10119065_latihan11_formatting;
public class PBOIF2_10119065_Latihan11_Formatting {

    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n",i);
        System.out.printf("%%10d : %10d%n",i);
        System.out.printf("%%+10d : %+10d%n",i);
        System.out.printf("%%+10d : %+10d%n",iMinus);
        System.out.printf("%%,10d : %,10d%n",i);
        System.out.printf("%%-10d : %-10d%n",i);
        
        double f = 567891.982;
        System.out.printf("f : " + f);
        System.out.printf("%%f : %f%n",f);
        System.out.printf("%%.2f : %.2f%n",f);
        System.out.printf("%%12.2f : %12.2f%n",f);
        System.out.printf("%%,12.2f : %,12.2f%n",f);
    }
    
}
