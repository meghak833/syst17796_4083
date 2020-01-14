
package StudentData;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class DisplayData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Students[] s=new Students[2];
        Scanner scan=new Scanner(System.in);
        
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Students();
            System.out.println("Enter id: ");
            s[i].setId(scan.nextInt());
            System.out.println("Enter name: ");
            s[i].setName(scan.next());
        }
        
        for (Students item : s) {
            System.out.println("id: "+ item.getId()+"name: "+item.getName());
        }
        
        
        
        
        
    }

}
