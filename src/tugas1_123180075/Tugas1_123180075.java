package tugas1_123180075;

import java.util.Scanner;

public class Tugas1_123180075 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0, mean;
        System.out.print("Nama : ");
        String name = input.nextLine();
        System.out.print("Berapa nilai yang diinputkan? : ");
        int count = input.nextInt();
        int score[] = new int[count];
        int max = 0, min = 0;
        for(int i=0; i<count; i++)
        {
            System.out.print("Nilai ke-"+(i+1)+" : ");
            score[i] = input.nextInt();
            total += score[i];
            max = score[0]; 
            min = score[0];
        }
        
        for(int i=0; i<count; i++)
        {
            if(max < score[i])
                max = score[i];
            if(min>score[i])
                min = score[i];
        }
        mean = total/count;
        System.out.println();
        System.out.println("Nama : "+name);
        System.out.println("Nilai tertinggi : "+max);
        System.out.println("Nilai terendah : "+min);
        System.out.println("Nilai rata-rata : "+mean);
    }
    
}
