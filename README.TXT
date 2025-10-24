Project: automaton
Aothors: David J. Barnes and Michael Kölling

This project is part of the material of the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 7.

Q26-27: When its reset, the same pattern appears again.

Q28: The fill() method sets all elements of the state array to 0.

Q29: 

Q30: I modified the update() method to use conditional operators instead of if-else statements for the left and right cells. The code is now shorter but works the same way as before.

Q31: We create a separate nextState array so that updating one cell does not immediately affect the neighboring cells. If we updated state directly, changes to one cell would incorrectly affect the calculation of adjacent cells.

Q32: I tried avoiding the nextState array by keeping track of previous cell values. While it works, using a separate nextState array is simpler and less error-prone.

Q33: I rewrote the loop in the update() method to avoid special cases for the first and last cells. This version uses left, center, and right variables and works for all cells uniformly.

Q34: I created a calculateNextState() method that calculates the next state of a cell given left, center, and right. This keeps the update logic cleaner and reusable.

Q35: I modified the calculateNextState method to try alternative rules for updating the cells. For example, I used (left + right) % 2 instead of the original (left + center + right) % 2. This produced different patterns in the automaton, showing how changing the rule affects the evolution of the cells. I also tried other combinations like (center + right + center * right + left * center * right) % 2 to explore more complex patterns.

Q36:

Q37:

Q38:
