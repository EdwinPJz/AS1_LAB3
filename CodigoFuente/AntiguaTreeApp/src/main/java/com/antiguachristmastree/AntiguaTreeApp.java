package com.antiguachristmastree;

public class AntiguaTreeApp {
    
    public AntiguaTreeApp() {
    }
    
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
          
        ChristmasTree myPinabeteTree = treeFactory.getTree(TreeType.PINABETE);
        ChristmasTree myAbetoTree = treeFactory.getTree(TreeType.ABETO);
        ChristmasTree myChiribiscoTree = treeFactory.getTree(TreeType.CHIRIBISCO);
        ChristmasTree myCipresTree = treeFactory.getTree(TreeType.CIPRES);
        ChristmasTree myPinoTree = treeFactory.getTree(TreeType.PINO);
        
        myPinabeteTree.place();
        myAbetoTree.place();
        myChiribiscoTree.place();
        myCipresTree.place();
        myPinoTree.place();
    }

}