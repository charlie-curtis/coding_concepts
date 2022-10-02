package Recursion;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Optional;

public class TowersOfHanoi {


  public static void main(String[] args) {

    solve(12, PEG.LEFT, PEG.RIGHT);
    System.out.printf("There were %d moves\n", moveCount);

  }

  private static int moveCount = 0;

  private static void solve(int diskCount, PEG from, PEG to) {

    if (diskCount == 0) {
      //no more work to be done.
      return;
    }
    PEG pivot = getPivot(from, to);

    //unstack all the disks off this one
    solve(diskCount - 1, from, pivot);

    makeMove(from, to);

    //stack all the moves back onto this one
    solve(diskCount -1, pivot, to);
  }

  private static void makeMove(PEG from, PEG to) {
    System.out.printf("Move: %s to %s\n", from, to);
    moveCount++;
  }

  private static PEG getPivot(PEG from, PEG to)
  {
    ArrayList<PEG> allPegs = new ArrayList<>(List.of(PEG.LEFT, PEG.RIGHT, PEG.MIDDLE));
    Optional<PEG> pivot = allPegs.stream().filter(peg -> !peg.equals(from) && !peg.equals(to)).findFirst();
    return pivot.get();
  }

  enum PEG {
   LEFT,
   RIGHT,
   MIDDLE
  }
}
