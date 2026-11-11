public class Client {

    public static void main(String[] args) {

        System.out.println("...........Methode 2: Abstract Factory..........");

        ProduitFactory produitfactoryA = new ProduitFactoryA();

        ProduitFactory produitfactoryB = new ProduitFactoryB();

        ProduitFactory produitfactoryC = new ProduitFactoryC();

        Produit produit = null;

        // Affiche un produit de type A
        produit = produitfactoryA.getProduit();
        produit.methodeproduit();

        // Affiche un produit de type B
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();

        // Affiche un produit de type C
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();

    }

}
