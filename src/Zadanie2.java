public class Zadanie2{
    public static void main(String[] args) {

      Book ksiazka1=new Book ("Cezary Harasimowicz","Uśmiech","Zielona Sowa",216,"dla dzieci");
      Book ksiazka2=new Book ("Jarosław Kret","Mój Madagaskar","Swiat Książki",322,"podróżnicze");


        System.out.println("Autor: " + ksiazka1.autor);
        System.out.println("Tytuł: " + ksiazka1.title);
        System.out.println("Wydawnictwo: "+ksiazka1.publisher);
        System.out.println("Ilość stron: "+ksiazka1.numberPages);
        System.out.println("Kategoria: "+ksiazka1.category);

        System.out.println(" ");

        System.out.println("Autor: " + ksiazka2.autor);
        System.out.println("Tytuł: " + ksiazka2.title);
        System.out.println("Wydawnictwo: "+ksiazka2.publisher);
        System.out.println("Ilość stron: "+ksiazka2.numberPages);
        System.out.println("Kategoria: "+ksiazka2.category);

    }
}


