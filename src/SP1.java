public static void main(String[] args) {

    String[][] gruppe = {
            {"1", "Marko", "19"},
            {"2", "Jonas", "23"},
            {"3", "Op", "23"},
            {"4", "Magnus", "25"}
    };

    for (String[] medlem : gruppe) {
        System.out.println(medlem[0] + ". " + medlem[1] + " - " + medlem[2] + " år");
    }


    String[] navne = {"Marko", "Op", "Jonas", "Magnus"};
    int[] aldre = {19, 23, 23, 25};

    System.out.println("Gruppemedlemmer ");
    for (int i = 0; i < navne.length; i++) {
        System.out.println((i+1) + ". " + navne[i] + " - " + aldre[i] + " år");
    }
}
