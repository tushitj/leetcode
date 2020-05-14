package solutions;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesList {

    public static void main(String[] args) throws IOException {
        File voyagerFile = new File("/Users/tushitjain/Downloads/Voyager.txt");
        File myFile = new File("/Users/tushitjain/Downloads/memberActivity");
        Set<Integer> voyagerMembers = new HashSet<>();
        Set<Integer> myMembers = new HashSet<>();
        BufferedReader brVoyager = new BufferedReader(new FileReader(voyagerFile));
        BufferedReader brMy = new BufferedReader(new FileReader(myFile));
        String st;
        while ((st = brVoyager.readLine()) != null){

            voyagerMembers.add(Integer.parseInt(st.trim()));
        }
        while ((st = brMy.readLine()) != null){

            myMembers.add(Integer.parseInt(st.trim()));
        }

//        myMembers.removeAll(voyagerMembers);
//        System.out.println("MyMembers");
//        System.out.println("***********");
//        myMembers.forEach(s->System.out.println(s));
//        System.out.println("***********");

        voyagerMembers.removeAll(myMembers);
        System.out.println("VoyagerMembers");
        System.out.println("***********");
        voyagerMembers.forEach(s->System.out.println(s));
        System.out.println("***********");
       // System.out.println(voyagerMembers.size());
       // System.out.println(myMembers.size());
        brVoyager.close();
        brMy.close();

    }
}
