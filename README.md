# Russian-Roulette
It was a question asked in HackerRank

You are playing a revised version of the game, where, you have to unlock all doors in a given setting, in a given fashion, to enter the playig area.

Initially, any door is either locked or unlocked.

If a door is locked and you unlock it, then if the next consecutive door is locked, it will automatically get unlocked.
if the next consecutive door is already unlocked, nothing will happen. there will be no effect on any following door.
For example, if there are 10 doors , where 0 denotes an unlocked door, and 1 locked door, a minimum of 3 operations, will be required to unlock all doors.

Complete the function revisedRussianRoulette that takes an integer array denoting status of each door in the array, and return an integer array denoting the minimum and maximum number of unlock operations needed to unlock all the doors.
