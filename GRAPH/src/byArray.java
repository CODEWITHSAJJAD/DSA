import java.util.*;
public class byArray {
    node array[] = new node[5];
    int aray[][] = new int[5][5];
    int count = 0;

    byArray() {
        for (int q = 0; q < array.length; q++) {
            array[q] = new node();
            for (int w = 0; w < array.length; w++) {
                aray[q][w] = 0;
            }
        }
    }

    void addNode(String s) {
        array[count] = new node();
        array[count].name = s;
        count++;
    }

    int edge(String val) {
        int i = 0;
        while (i < count) {
            if (val.equals(array[i].name)) {
                break;
            }
            i++;
        }
        return i;
    }

    void addEdge(String from, String to, int val) {
        int row = edge(from);
        int col = edge(to);
        aray[row][col] = val;
    }

    void search(String name) {
        int a = 0;
        while (a < count) {
            if (name.equals(array[a].name)) {
                System.out.println("Available");
                return;
            }
            a++;
        }
        System.out.println("Not Available");
    }

    void displayRate() {
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                System.out.print(aray[row][col] + " , ");
            }
            System.out.println();
        }
    }

    void displayNodes() {
        for (int index = 0; index < count; index++) {
            System.out.print(array[index].name + " , ");
        }
        System.out.println();
    }
}
