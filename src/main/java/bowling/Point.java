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
public class Point {
    
    private int ptsLancer;      // Nombre de quilles tombees
    private int ptsBonus;       // Nombre de lancers (suivants) à rajouter au score
    private int manche;
    
    /**
     * Constructeur
     * @param t1 Points du tour (nombre de quilles tombées)
     * @param bonus Nombre de tours bonus à compter (en cas de strike ou de spare)
     */
    public Point(int t1, int bonus) {
        this.ptsLancer = t1;
        this.ptsBonus = bonus;
        this.manche = 0;
    }
    
    void setPtsLancer(int t) {
        this.ptsLancer = t;
    }
    
    void setToursBonus(int nb) {
        this.ptsBonus = nb;
    }
    
    void setManche(int m) {
        this.manche = m;
    }
    
    int getPtsLancer() {
        return this.ptsLancer;
    }
    
    int getToursBonus() {
        return this.ptsBonus;
    }
    
    int getManche() {
        return this.manche;
    }
}
