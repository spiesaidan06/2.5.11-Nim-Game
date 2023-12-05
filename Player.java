class Player {

  private String name;
  private int score;
  private boolean isCPU;

  public Player() {
    name = "Bot";
    isCPU = false;
    score = 0;
  }
  
  public Player(String userName, boolean isComputer) {
    name = userName;
    isCPU = isComputer;
    score = 0;
  }

  public void changeName(String newName) {
    name = newName;
  }

  public String getName() {
    return name;
  }

  public void increaseScore() {
    score += 1;
  }

  public int getScore() {
    return score;
  }
  
  public void swapControl() {
    if (isCPU) {
      isCPU = false;
    } else {
      isCPU = true;
    }
  }

  public boolean isABot() {
    return isCPU;
  }
  
}