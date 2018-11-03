import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class TestStream {
    public static void main(String[] args) {
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        //Parcourir la collection définie au dessus
        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        //Utiliser un stream infini, et le limiter à 50
        //Stream.iterate(1, (x) -> x + 1).limit(50).forEach(System.out::println);

        /*
        System.out.println("\nParcourir le stream et définir un filtre");
        sp = listP.stream();
        sp.filter(x -> x.getTaille() > 1.75)
                .forEach(System.out::println);
        */

        /*
        System.out.println("\nUtiliser la fonction map");
        sp = listP.stream();
        sp.filter(x -> x.getPoids() > 60)
                .map(x -> x.getPrenom())
                .forEach(System.out::println);
        */

        /*
        System.out.println("\nUtiliser la fonction terminale reduce");
        sp = listP.stream();
        Double sum = sp.filter(x -> x.getPoids() > 60)
                .map(x -> x.getTaille())
                .reduce(0.0d, (x,y) -> x+y);
        System.out.println(sum);
        */

        /*
        System.out.println("\nUtiliser un optionnel");
        sp = listP.stream();
        Optional<Double> sum = sp.filter(x -> x.getPoids() > 150)
                .map(x -> x.getTaille())
                .reduce((x,y) -> x+y);

        if (sum.isPresent())
            System.out.println(sum.get());
        else
            System.out.println("Pas de résultat");
        */

        /*
        System.out.println("\nUtiliser la fonction count");
        sp = listP.stream();
        long count = sp	.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .count();
        System.out.println("Nombre d'éléments : " + count);
        */

        /*
        System.out.println("\nUtiliser la fonction collect");
        sp = listP.stream();
        List<Double> list = sp	.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .collect(Collectors.toList());
        System.out.println(list);
        */

    }
}
