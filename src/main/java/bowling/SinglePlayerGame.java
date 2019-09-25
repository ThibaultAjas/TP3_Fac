package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancers successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
    
    Game g;
    
    /**
     * Constructeur
     */
    public SinglePlayerGame() {
        this.g = new Game();
    }

    /**
     * Cette méthode doit être appelée à chaque lancé de boule
     * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de ce lancer
     */
    public void lancer(int nombreDeQuillesAbattues) {
        g.jouer(nombreDeQuillesAbattues);
    }

    /**
     * Cette méthode donne le score du joueur
     * @return Le score du joueur
     */
    public int score() {
        return g.calculer();
    }
}
