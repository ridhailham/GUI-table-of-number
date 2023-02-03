import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import javax.swing.JTable;

public class kerkomgui extends JPanel{
    JTable tabel;
    public kerkomgui () {
        String[] kolom1 = {"operasi angka 1", "hasil"};
        String[][] data1 = new String[10][2];
        for(int i = 1; i<=1; i++){
            for (int j = 1; j<=10; j++) {
                data1[j-1][0] = i+" x "+ j;
                data1 [j-1][1] = String.valueOf(i*j);
            }
        }


        tabel = new JTable(data1, kolom1);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        JScrollPane jps1 = new JScrollPane(tabel);
        add(jps1);


        String[] kolom2 = {"operasi angka 2", "hasil"};
        String[][] data2 = new String[10][2];
        for(int i = 2; i<=2; i++){
            for (int j = 1; j<=10; j++) {
                data2[j-1][0] = i+" x "+ j;
                data2 [j-1][1] = String.valueOf(i*j);
            }
        }
        tabel = new JTable(data2, kolom2);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps2 = new JScrollPane(tabel);
        add(jps2);


        String[] kolom3 = {"operasi angka 3", "hasil"};
        String[][] data3 = new String[10][2];
        for(int i = 3; i<=3; i++){
            for (int j = 1; j<=10; j++) {
                data3[j-1][0] = i+" x "+ j;
                data3[j-1][1] = String.valueOf(i*j);
            }
        }
        tabel = new JTable(data3, kolom3);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps3 = new JScrollPane(tabel);
        add(jps3);

        String[] kolom4 = {"operasi angka 4", "hasil"};
        String[][] data4 = new String[10][2];
        for(int i = 4; i<=4; i++){
            for (int j = 1; j<=10; j++) {
                data4[j-1][0] = i+" x "+ j;
                data4 [j-1][1] = String.valueOf(i*j);
            }
        }
        tabel = new JTable(data4, kolom4);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps4 = new JScrollPane(tabel);
        add(jps4);

        String[] kolom5 = {"operasi angka 5", "hasil"};
        String[][] data5 = new String[10][2];
        for(int i = 5; i<=5; i++){
            for (int j = 1; j<=10; j++) {
                data5[j-1][0] = i+" x "+ j;
                data5[j-1][1] = String.valueOf(i*j);
            }
        }
        tabel = new JTable(data5, kolom5);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps5 = new JScrollPane(tabel);
        add(jps5);

        String[] kolom6 = {"operasi angka 6", "hasil"};
        String[][] data6 = new String[10][2];
        for(int i = 6; i<=6; i++){
            for (int j = 1; j<=10; j++) {
                data6[j-1][0] = i+" x "+ j;
                data6[j-1][1] = String.valueOf(i*j);
            }
        }
        tabel = new JTable(data6, kolom6);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps6 = new JScrollPane(tabel);
        add(jps6);

        String[] kolom7 = {"operasi angka 7", "hasil"};
        String[][] data7 = new String[10][2];
        for(int i = 7; i<=7; i++){
            for (int j = 1; j<=10; j++) {
                data7[j-1][0] = i+" x "+ j;
                data7[j-1][1] = String.valueOf(i*j);
            }
        };
        tabel = new JTable(data7, kolom7);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps7 = new JScrollPane(tabel);
        add(jps7);

        String[] kolom8 = {"operasi angka 8", "hasil"};
        String[][] data8 = new String[10][2];
        for(int i = 8; i<=8; i++){
            for (int j = 1; j<=10; j++) {
                data8[j-1][0] = i+" x "+ j;
                data8[j-1][1] = String.valueOf(i*j);
            }
        };
        tabel = new JTable(data8, kolom8);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps8 = new JScrollPane(tabel);
        add(jps8);

        String[] kolom9= {"operasi angka 9", "hasil"};
        String[][] data9 = new String[10][2];
        for(int i = 9; i<=9; i++){
            for (int j = 1; j<=10; j++) {
                data9[j-1][0] = i+" x "+ j;
                data9[j-1][1] = String.valueOf(i*j);
            }
        };
        tabel = new JTable(data9, kolom9);
        tabel.setPreferredScrollableViewportSize(new Dimension(200, 300));
        tabel.setFillsViewportHeight(true);
        tabel.setVisible(true);
        JScrollPane jps9 = new JScrollPane(tabel);
        add(jps9);


    }
    public static void main (String [] args) {
        JFrame f1 = new JFrame();
        kerkomgui k = new kerkomgui();
        f1.setTitle("kerkom");
        f1.setSize(5000,5000);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.add(k);

    }
}