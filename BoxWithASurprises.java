import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class BoxWithASurprises {
    public static void main(String[] args) {
        List<Collection<String>> boxWithASurprises= new ArrayList<>();
        boxWithASurprises.add(giftsForDad());
        boxWithASurprises.add(giftsForMother());
        boxWithASurprises.add(giftsForSun());
        boxWithASurprises.add(giftsForDaughter());
        System.out.println("All gifts: " + "\n" + boxWithASurprises);


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        String sDadBirthsDay = "14.10";
        String sMotherBirthsDay = "10.01";
        String sSunBirthsDay = "18.08";
        String sDaughterBirthsDay = "20.04";
        try {
            Date dadBirthsDay = dateFormat.parse(sDadBirthsDay);
            Date motherBirthsDay = dateFormat.parse(sMotherBirthsDay);
            Date sunBirthsDay = dateFormat.parse(sSunBirthsDay);
            Date daughterBirthsDay = dateFormat.parse(sDaughterBirthsDay);
            System.out.println();

            {
                System.out.println("Happy birthday Dad! " + dateFormat.format(dadBirthsDay));
                System.out.println("Gifts for Dad: " + giftsForDad());

            }

            {
                    System.out.println("Happy birthday mom! " + dateFormat.format(motherBirthsDay));
                    System.out.println("Gifts for mom: " + giftsForMother());
                }



            {
                    System.out.println("Happy birthday sun! " + dateFormat.format(sunBirthsDay));
                    System.out.println("Gifts for sun: " + giftsForSun());

            }

            {
                Date date;
                date = daughterBirthsDay;
                if (date.equals(daughterBirthsDay)) {
                    System.out.println("Happy birthday daughter! " + dateFormat.format(daughterBirthsDay));
                    System.out.println("Gifts for daughter: " + giftsForDaughter());
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Collection<String> giftsForDad(){
        Collection<String> giftFromDad = new ArrayList<>();
        String giftFromMother = "Spinning";
        String giftFromSun = "Football tickets";
        String giftFromDaughter = "Beaded bracelet";
        giftFromDad.add(giftFromMother);
        giftFromDad.add(giftFromSun);
        giftFromDad.add(giftFromDaughter);
        return giftFromDad;
    }
    private static Collection<String> giftsForMother(){
        Collection<String> giftFromMother = new ArrayList<String>();
        String giftFromDad = "Necklace";
        String giftFromSun = "Home flower";
        String giftFromDaughter = "Set of markers";
        giftFromMother.add(giftFromDad);
        giftFromMother.add(giftFromSun);
        giftFromMother.add(giftFromDaughter);
        return giftFromMother;
    }
    private static Collection<String> giftsForSun(){
        Collection<String> giftFromSun = new ArrayList<>();
        String giftFromDad = "Bike";
        String giftFromMother = "Bike helmet";
        String giftFromDaughter = "Postcard";
        giftFromSun.add(giftFromDad);
        giftFromSun.add(giftFromMother);
        giftFromSun.add(giftFromDaughter);
        return giftFromSun;
    }
    private static Collection<String> giftsForDaughter(){
        Collection<String> giftFromDaughter = new ArrayList<>();
        String giftFromDad = "Toy kitchen";
        String giftFromMother = "Set of children's dishes";
        String giftFromSun = "Set of markers";
        giftFromDaughter.add(giftFromDad);
        giftFromDaughter.add(giftFromMother);
        giftFromDaughter.add(giftFromSun);
        return giftFromDaughter;
    }
}