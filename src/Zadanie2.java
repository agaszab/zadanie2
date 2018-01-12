public class Zadanie2{
    public static void main(String[] args) {

      Book ksiazka1=new Book ();
      Book ksiazka2=new Book ();

       ksiazka1.autor="Cezary Harasimowicz";
       ksiazka1.title="Uśmiech";
       ksiazka1.publisher="Zielona Sowa";
       ksiazka1.nnumberPages=216;
       ksiazka1.category="dla dzieci";

       ksiazka2.autor="Jarosław Kret";
       ksiazka2.title="Mój Madagaskar";
       ksiazka2.publisher="Swiat Książki";
       ksiazka2.nnumberPages=322;
       ksiazka2.category="podróżnicze";

        System.out.println("Autor: " + ksiazka1.autor);
        System.out.println("Tytuł: " + ksiazka1.title);
        System.out.println("Wydawnictwo: "+ksiazka1.publisher);
        System.out.println("Ilość stron: "+ksiazka1.nnumberPages);
        System.out.println("Kategoria: "+ksiazka1.category);

        System.out.println(" ");

        System.out.println("Autor: " + ksiazka2.autor);
        System.out.println("Tytuł: " + ksiazka2.title);
        System.out.println("Wydawnictwo: "+ksiazka2.publisher);
        System.out.println("Ilość stron: "+ksiazka2.nnumberPages);
        System.out.println("Kategoria: "+ksiazka2.category);

    }
}


