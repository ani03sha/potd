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
var judgeCircle = function (moves) {
    // Base condition
    if (moves == undefined || moves.length == 0) {
        return false;
    }
    // Coordinates
    let x = 0;
    let y = 0;
    // Loop for every move in the string
    for (let c of moves) {
        if (c === 'L') {
            x--;
        } else if (c === 'R') {
            x++;
        } else if (c === 'D') {
            y--;
        } else if (c === 'U') {
            y++;
        } else {
            return false;
        }
    }
    return x === 0 && y === 0;
};

console.log(judgeCircle("UD"));
console.log(judgeCircle("LL"));
console.log(judgeCircle("RRDD"));
console.log(judgeCircle("LDRRLRUULR"));
