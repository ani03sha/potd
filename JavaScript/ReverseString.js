/**
 * Given a string, reverse all of its characters and return the resulting string.
 */
var reverse = (s) => {
    const characters = s.split("");
    // Left and right pointers
    let left = 0;
    let right = s.length - 1;
    // Loop until the two pointers meet
    while (left <= right) {
        // Swap the left and right characters
        let c = characters[left];
        characters[left] = characters[right];
        characters[right] = c;
        // Update the pointers
        left++;
        right--;
    }
    return characters.join("");
}

console.log(reverse("Cat"));
console.log(reverse("Program of the day"));
console.log(reverse("red quark"));
console.log(reverse("level"));
console.log(reverse(""));