import model.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class allPeople {
    public static void main(String[] args) throws IOException {
        System.out.println("programa veikia");

        ArrayList<People> allPersons = new ArrayList<People>();




        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader("C:\\Users\\rober\\Desktop\\People.csv");
            br = new BufferedReader(fr);

            String textLine;
            int counter = 0;
            while ((textLine = br.readLine()) != null) {
                counter++;
                if (counter == 1) {
                    continue;
                }
                String[] personData = textLine.split(",");
               //int id, String first_Name, String last_Name, String email, String gender, String country
                People x = new People(Integer.parseInt(personData[0]),personData[1], personData[2], personData[3], personData[4], personData[5]);
               allPersons.add(x);
               // System.out.println(x);

                 findByname("Rosia",allPersons);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            br.close();
        }
        ArrayList<People> PeopleWithNullEmail = allPersons.stream()
                .filter(p -> p.getEmail().equals(""))
                .collect(Collectors.toCollection(ArrayList<People>::new));
       // System.out.println(PeopleWithNullEmail);

        long howManyPeopleWithNullEmail = PeopleWithNullEmail.stream().count();
       // System.out.println(howManyPeopleWithNullEmail);


//        ArrayList<People> FindByName = allPersons.stream()
//                .filter(p -> p.getFirstName()).equals(vardas)
    }
    private static void findByname(String vardas,ArrayList<People> allPeople){
        People rastiZmogu = null;
        ArrayList<People> rastiZmoguPagalVarda = allPeople.stream()
                .filter(p -> p.getFirstName().equals(vardas))
                .collect(Collectors.toCollection(ArrayList<People>::new));
        System.out.println(rastiZmoguPagalVarda);

//        if (rastiZmogu == null){
//            System.out.println("Tokio zmogaus nera ");
//        }else {
//            System.out.println("Toks zmogus yra" + rastiZmogu);
//        }
   }

}
