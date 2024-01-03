class Variables {
    public static void main(String[] args) {
        String originalTitle = "Indiana Jones and the Last Crusade";
        boolean alreadySeen = true;
        int releaseDate = 1989;
        float noteIMDB = 8.2f;
        String pourLaMiseEnForme = "";
        if (alreadySeen) {
            pourLaMiseEnForme = "Oui";
        } else {
            pourLaMiseEnForme = "Non";
        }
        System.out.println("Titre original : " + originalTitle);
        System.out.println("Année de sortie : " + releaseDate);
        System.out.println("Déjà vu : " + pourLaMiseEnForme);
        System.out.println("Note IMDB : " + noteIMDB);
    }
}