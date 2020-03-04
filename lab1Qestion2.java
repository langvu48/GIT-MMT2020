/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.mmt;

/**
 *
 * @author ig.beooss
 */
public class lab1Qestion2 {
    protected int dai, rong;
    
    public lab1Qestion2(int x,int y)
    {
        this.dai=x;
        this.rong=y;
    }
    public int chuvi()
    {
        return (dai+rong)*2;
    }
    public int dientich()
    {
        return dai*rong;
    }
    public int canhnhonhat()
    {
        return Math.min(dai, rong);
    }
    public void print()
    {
        System.out.printf("chu vi: %d, dientich: %d, canhnhonhat: %d ;",chuvi(),dientich(),canhnhonhat() );
    }
    
}
