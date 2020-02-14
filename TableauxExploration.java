public class TableauxExploration {

    public static void initTen(int[][] tab){

        for (int i=0; i<tab.length;i++){

            for (int j=0; j<tab[0].length; j++)
                tab[i][j] = 10;

        }

    }

    public static void initDiagonaleTen(int[][] tab){

        for (int i=0; i<tab.length;i++)
            tab[i][i] = 10;

    }

    public static void initPosition(String[][] tab){

        for (int i=0; i<tab.length;i++){

            for (int j=0; j<tab[0].length; j++)

                tab[i][j] = String.valueOf(i) + ":" + String.valueOf(j);

        }

    }

    public static boolean isTabCarre(int[][] tab){

        boolean carré;

        if(tab.length == tab[0].length)
            carré = true;
        else
            carré = false;

        return carré;

    }

    public static boolean isTabDimEgal(int[][] tab1,int[][] tab2){
        boolean dimEgal;

        if(tab1.length == tab2.length && tab2[0].length == tab1[0].length)
            dimEgal = true;
        else
            dimEgal = false;

        return dimEgal;
    }


    public static int[][] getSommeMatrices(int[][] tab1, int[][] tab2){

        int[][] somme = new int[tab1.length][tab1[0].length];

        for (int i=0; i<tab1.length;i++){

            for (int j=0; j<tab1.length; j++)

                somme[i][j] = tab1[i][j] + tab2[i][j];

        }

        return somme;

    }
}

