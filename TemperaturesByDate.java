import java.util.Scanner;

class TemperatureSample{
    int month, day, year;
    double temperature;
}

public class TemperaturesByDate {
    public static void main(String[] args) throws Exception {
        String site = "https://learnjavathehardway.org";
        String path = "/txt/avg-daily-temps-with-dates-atx.txt";
        Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());

        TemperatureSample[] tempDB = new TemperatureSample[10000];
        int numRecords, i = 0;

        while ( inFile.hasNextInt() && i < tempDB.length ){
            TemperatureSample e = new TemperatureSample();
            e.month = inFile.nextInt();
            e.day = inFile.nextInt();
            e.year = inFile.nextInt();
            e.temperature = inFile.nextDouble();
            if (e.temperature == -99){
                continue;
            }
            tempDB[i] = e;
            i++;
        }
        inFile.close();
        numRecords = i;

        System.out.println(numRecords + " daily temperatures loaded.");

        double total = 0, avg;
        int count = 0;
        for ( i = 0; i < numRecords; i++){
            if (tempDB[i].month == 11){
                total += tempDB[i].temperature;
                count++;
            }
        }

        avg = total / count;
        avg = roundToOneDecimal(avg);
        System.out.print("Average daily temperature over "+ count);
        System.out.println(" days in November: " + avg);

        double total2 = 0, avg2;
        int count2 = 0;
        for ( i = 0; i < numRecords; i++){
            if (tempDB[i].month == 3){
                total2 += tempDB[i].temperature;
                count2++;
            }
        }

        avg2 = total2 / count2;
        avg2 = roundToOneDecimal(avg2);
        System.out.print("Average daily temperature over "+ count2);
        System.out.println(" days in March: " + avg2);

        TemperatureSample ts = tempDB[3];
        System.out.println(ts);
    }

    public static double roundToOneDecimal( double d ){
        return Math.round(d*10)/10.0;
    }
}
