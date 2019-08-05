package reijojy.harjoitus;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.List;

public class HaeData {
    public List<Henkilo> haeData() {
        File fileIn = null;
        int vSize = 0;
        ArrayList<String> alHlo = new ArrayList<String>();
        List<Henkilo> list = new LinkedList<Henkilo>();

        try {

            fileIn =  new File("D:\\sekalaista\\Formatointia\\inputResource\\henkilot.txt");
            //fileIn =  new File("\\..\\inputResource\\henkilot.txt");
            BufferedReader b = new BufferedReader(new FileReader(fileIn));
            String line = "";
            System.out.println("Luetaan tekstiä");
            while((line = b.readLine()) != null) {
                alHlo.add(line);
                vSize += 1;
            }
            b.close();

        } catch(java.io.IOException e) {
            System.out.println(e.toString());
            return null;
        }


        Vector v = new Vector<Henkilo>(alHlo.size());
        for (int i = 0; i < vSize; i++) {
            StringTokenizer st = new StringTokenizer(alHlo.get(i), ";");
            int j = 0;
            String nimi = null;
            int ika = 0;
            String ammatti = null;
            String sp = null;
            while (st.hasMoreTokens()) {
                switch (j) {
                    case 0: nimi = new String(st.nextToken());
                    case 1: ika = Integer.parseInt(st.nextToken());
                    case 2: ammatti = new String(st.nextToken());
                    case 3: sp = new String(st.nextToken());
                }
                // Pidetään vektori vielä hengissä kuitenkin

                v.add(new Henkilo (nimi, ika, ammatti, sp));
                list.add(new Henkilo (nimi, ika, ammatti, sp));
                j++;
            }

        }

        return list;
    }
}
