PRECEDENCIES I OPERADORS
########################

1.
5 + 4 * 3
5 + (4*3) 
5 + 12 → 17

2.
-5 * 4 + -3
(-5*4)+(-3) 
-20-3 → -23

3.
true && false || ! true 
(true && false) || false 
false || false 
false

4.
false && (10 > 3) || ! (4 > 5) 
(false && true) || !false 
false || true 
true

5.
(false == (5 > 4)) && (false == ! true) || (false != true) 
(false == true) && (false == false) || (false == false) 
(false && false) || false 
true || false 
true

// inventades per mi

6.
true || (5 * 2 < 8) && (10 - 3 > 4)
true || (10 < 8) && (7 > 4)
true || false && true
true || false
true

7.
(false || (3 >= 3)) && !(7 < 2) || (4 != 4)
(false || true) && !false || false
true && true || false
true || false
true
