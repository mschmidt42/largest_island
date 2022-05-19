class Main {
  public int getIslandSize(String[] island ){
    return 0;
  }

  public static void main(String[] args) {
    Main app = new Main();

    String[] island = {"..#.",
                       "..##",
                       "...#",
                       "##..",
                       "...#"};

    System.out.println(app.getIslandSize(island));
  }
}
