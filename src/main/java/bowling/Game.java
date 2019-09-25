/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author Dalfrak
 */
public class Game {

    private Point[] scores;
    private int tour;
    private int manche;
    private boolean premierLancer;
    
    /**
     * Constructeur
     */
    public Game() {
        this.tour = 0;
        this.manche = 0;
        this.scores = new Point[24];   // 10 tours max et 2 lancers supplementaires, soit 22 lancers
        this.premierLancer = true;
    }
    
    /**
     * Lance une boule
     * @param nbQuilles Nombre de quilles défoncées par le joueur
     */
    void jouer(int nbQuilles) {

        if (nbQuilles == 10 && this.premierLancer == true) {                    // Strike
            this.scores[this.tour] = new Point(nbQuilles, 2);
            this.scores[this.tour].setManche(this.manche);
            this.manche++;
        } else if (this.premierLancer == false && this.scores[this.tour - 1].getPtsLancer() + nbQuilles == 10) { //Spare
            this.scores[this.tour] = new Point(nbQuilles, 1);
            this.scores[this.tour].setManche(this.manche);
            this.premierLancer = !this.premierLancer;
            this.manche++;
        } else {                                                                // Lancer normal d'une personne nulle
            this.scores[this.tour] = new Point(nbQuilles, 0);
            this.scores[this.tour].setManche(this.manche);
            if (this.premierLancer == false)
                manche++;
            this.premierLancer = !this.premierLancer;
        }

        this.tour++;
    }
    /**
     * Calcule le score actuel du joueur
     * @return Le score actuel du joueur
     */
    int calculer() {
        int tmp = 0;

        for (int i = 0; i < this.tour; i++)
            if (this.scores[i].getManche() < 10) {
                tmp += this.scores[i].getPtsLancer();
                for (int j = 1; j <= this.scores[i].getToursBonus(); j++)
                    tmp += this.scores[i + j].getPtsLancer();
            }

        return tmp;
    }

}
