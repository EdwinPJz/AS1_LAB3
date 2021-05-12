package com.antiguachristmastree;

public class TreeFactory {

    public TreeFactory() {
    }
    public ChristmasTree getTree(TreeType treeType) {
        switch(treeType){
            case PINABETE: return new Pinabete();
            case ABETO: return new Abeto();
            case CHIRIBISCO: return new Chiribisco();
            case CIPRES: return new Cipres();
            case PINO: return new Pino();
            default: return null;
        }
    }

}