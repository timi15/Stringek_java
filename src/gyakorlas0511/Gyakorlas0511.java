package gyakorlas0511;

public class Gyakorlas0511 {

     public static void main(String[] args) {

          //STRING
          // Stringek egyenlőségének vizsgálata – equals()
          // Objektumok között az == operátorral végzett egyenlőség vizsgálat nem használható!
          String s1 = "abcd";
          String s2 = new String("abcd");

          System.out.println(s1.equals(s2));

          //Stringek összefűzése – concat()
          String s = "Indul";
          s = s.concat(" a");
          s = s.concat(" gorog");
          s = s.concat(" aludni");

          System.out.println(s);

          // Stringek hossza – length()
          // Bármely String méretét (hosszát) megkaphatjuk, ha meghívjuk a length() metódusát:
          System.out.println(s.length());

          // String adott karaktere – charAt()
          System.out.println(s.charAt(3)); // a 4. karakter (3-as index!)

          System.out.println(s.charAt(0)); // első karakter (üres Stringre indexelési hiba!)

          System.out.println(s.charAt(s.length() - 1)); // utolsó karakter

          // Stringek összehasonlítása rendezés miatt – compareTo()
          // Az összehasonlítás megkülönbözteti a kis és nagybetűket!
          String nev = "Geza";
          String nev2 = "Bela";
          System.out.println(nev.compareTo(nev2)); // 5

          /* Az eredmény pozitív, ez azt jelenti, hogy az s1 String (amire a
           * metódust meghívtuk) a paraméterben szereplő s2 Stringhez képest
           * hátrébb található rendezési szempontból. Maga az 5-ös érték azt
           * jelenti, hogy annál a pontnál, ahol a két String különbözik
           * a két összehasonlított karakter távolsága 5 (B-G)
           */
          String s3 = "Geza";
          String s4 = "bela";
          System.out.println(s3.compareTo(s4)); // -27

          /* Az eredmény negatív, ez azt jelenti, hogy az s3 Stringhez képest
           * az s4 String hátrébb(!) található. Ez azért van, mert a kódtáblában
           * a nagybetűk megelőzik a kisbetűket, és a compareTo() figyelembe
           * veszi ezt. Ez kiküszöbölhető a következő metódussal:
           */
          System.out.println(s3.compareToIgnoreCase(s4)); // 5

          /* a compareToIgnoreCase() metódus úgy hasonlítja össze a Stringeket,
           * hogy figyelmen kívül hagyja a kis és nagybetűk közötti különbségeket.
           */
          //Stringek kis-nagybetűs átalakítása – toLowerCase() és toUpperCase()
          String nevem = "Miko Csaba";
          System.out.println(nevem.toUpperCase()); // "MIKO CSABA"
          System.out.println(nevem.toLowerCase()); // "miko csaba"

          //Keresés Stringben – indexOf(), lastIndexOf()
          String d = "abrakadabra";
          System.out.println(d.indexOf("rak")); // 2
          //  A 2. indexű (3. karakternél) található a rak szócska.

          System.out.println(d.indexOf("br")); // 1
          /* Az 1. indexű (2. karakternél) található a br rész
           * Fontos, hogy az indexOf() mindig az első találat helyét adja meg!
           */

          System.out.println(d.indexOf("Br")); // -1
          /* Egy nem létező indexet adott eredményül, vagyis a keresett
           * részlet nem található meg a Stringben.
           */

          System.out.println(d.lastIndexOf("br")); // 8
          /* A 8. indexű (9. karakternél) található a br rész, de most a
           * keresést hátulról kezdte, és onnan adja vissza az első találatot!
           */

          int elso = s.indexOf("r");

          System.out.println(s.indexOf("r", elso + 1));
          /* Először megkeressük az első 'r' betűt, majd amikor a másodikat
           * akarjuk megkeresni, akkor megadjuk, hogy az első utáni pozíciótól
           * induljunk. Ezt a két lépést akár össze is vonhatjuk:
           */
          System.out.println(s.indexOf("r", s.indexOf("r") + 1));

          System.out.println(s.lastIndexOf("br", s.lastIndexOf("br") - 1));
          /* Ha ugyanezt hátulról végezzük, akkor figyelni kell arra, hogy
           * az első találat előtt kell folytatni, vagyis itt -1
           * kell az első találat helyéhez képest, mivel visszafelé keresünk
           */

          //String kezdete és vége – startsWith(), endsWith()
          System.out.println(s.startsWith("ab")); // true
          System.out.println(s.endsWith("ab")); // false
          System.out.println(s.startsWith("Ab")); // false(!)

          System.out.println(s.startsWith("ab")); // false, nem meglepő
          System.out.println(s.toLowerCase().startsWith("ab")); // true!

          //String karaktereinek cseréje – replace(), replaceFirst()
          System.out.println(s.replace("a", "A")); // AbrAkAdAbrA
          System.out.println(s.replace("z", "A")); // abrakadabra
          // Nem volt mit cserélni, maradt az eredeti.

          System.out.println(s.replaceFirst("a", "A")); // Abrakadabra
          // Kicserélte az elsőt, ahogy vártuk.

          s = "Abrakadabra";
          System.out.println(s.replaceFirst("a", "A")); // AbrAkadabra(??)
          /* Láthatod, hogy az eredeti szó már nagybetűvel kezdődött. Ekkor az
           * első betű, amit cserélni tudott nyilván a második 'a' betű lesz,
           * de itt sem felejtetted el: kis-nagybetű érzékeny metódus!
           */

          //String részének kinyerése – substring()
          System.out.println(s.substring(0, 5)); // abrak
          System.out.println(s.substring(2, 5)); // rak
          System.out.println(s.substring(5, 8)); // ada
          System.out.println(s.substring(6));   // dabra
          System.out.println(s.substring(s.length())); // mindig üres String

          //A String tartalmazza-e? – contains()
          System.out.println(s.contains("rak")); // true
          System.out.println(s.contains("Rak")); // false
          System.out.println(s.contains("abra")); // true (a vegen van!)
          System.out.println(s.contains("abrak")); // false
          System.out.println(s.toLowerCase().contains("abrak")); // true(!)

          //String szétdarabolása – split()
          String nevsor = "Geza Eva Pal";
          String[] nevek = nevsor.split(" "); // { "Geza", "Eva", "Pal" }
          for (String e : nevek) {
               System.out.print(e+" ");
               
          }
          System.out.println("\n");

          String nevsor2 = "Geza,Eva,Pal";
          String[] nevek2 = nevsor2.split(","); // { "Geza", "Eva", "Pal" }
          for (String e : nevek2) {
               System.out.print(e+" ");
               
          }
          
        System.out.println("\n");

          
          String[] tomb = s.split("a"); // { "", "br", "k", "d", "br" }
          for (String e : tomb) {
               System.out.print(e+" ");
               
          }

     } //main vége

}
