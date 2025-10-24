Project: automaton
Aothors: David J. Barnes and Michael Kölling

This project is part of the material of the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 7.

Q26-27: When its reset, the same pattern appears again.

Q28: The fill() method sets all elements of the state array to 0.

Q29: I changed the reset method so more than one cell will start with a value of 1. The automaton still gives the same pattern for the same setup, but different starting points make different patterns.

Q30: I used conditional operators instead of if-else for left and right cells. The code is shorter but works the same.

Q31: We use a separate nextState array so changes in one cell don’t affect others while updating.

Q32: I tried not using nextState and tracking previous values instead. It works, but using nextState is easier and safer.

Q33: I rewrote the loop using left, center, and right so it works for all cells without special cases.

Q34: I made a calculateNextState() method to handle each cell’s update. It keeps the code cleaner.

Q35: I changed the rule to (left + right) % 2 and tried other ones to see different patterns. The rule affects how the automaton evolves. For example, I used (left + right) % 2 instead of the original (left + center + right) % 2. I also tried other combinations like (center + right + center * right + left * center * right) % 2 to explore more complex patterns.

Q36: I added one extra cell to the array so the last cell always has a right neighbor (0). It made the update easier. This simplified the code and makes sure that all cells could be updated without special conditions for the boundaries. 

Q37: I experimented with different initial patterns by seeding the automaton in other positions and with multiple cells. The automaton changes a lot depending on the starting setup.
