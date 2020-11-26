/**
 * There is a robot starting at position (0, 0), the origin, on a 2D plane.
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it
 * completes its moves.
 * 
 * The move sequence is represented by a string, and the character moves[i]
 * represents its ith move. Valid moves are R (right), L (left), U (up), and D
 * (down). If the robot returns to the origin after it finishes all of its
 * moves, return true. Otherwise, return false.
 * 
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make
 * the robot move to the right once, "L" will always make it move left, etc.
 * Also, assume that the magnitude of the robot's movement is the same for each
 * move.
 */
public class RobotReturnToOrigin {

    private static boolean judgeCircle(String moves) {
        // Base condition
        if (moves == null || moves.isEmpty()) {
            return true;
        }
        // Initial coordinates
        int x = 0;
        int y = 0;
        // Loop through the entire string
        for(char c : moves.toCharArray()) {
            switch (c) {
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                default:
                    return false;
            }
        }
        return x == 0 && y == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("RRDD"));
        System.out.println(judgeCircle("LDRRLRUULR"));
    }
}
