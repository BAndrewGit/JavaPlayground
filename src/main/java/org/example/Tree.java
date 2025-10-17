package org.example;

import java.awt.Color;

public class Tree {
    private double heightFt;
    private double trunkDiameterIn;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51 , 0);

    public Tree(double heightFt, double trunkDiameterIn, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterIn = trunkDiameterIn;
        this.treeType = treeType;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public double getTrunkDiameterIn() {
        return trunkDiameterIn;
    }

    public void setTrunkDiameterIn(double trunkDiameterIn) {
        this.trunkDiameterIn = trunkDiameterIn;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterIn = this.trunkDiameterIn + 1;
    }

   public static void  announceTree(){
        System.out.println("\nLool at that " + TRUNK_COLOR + " tree!");
    }

   public void announceTallTree() {
        if (this.heightFt >= 100) {
            System.out.println("\nThat's a big " + this.treeType + " tree!");
        }
    }
}
