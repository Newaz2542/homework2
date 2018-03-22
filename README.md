## homework2

4.1Explain why this function is so slow, even for fairly small values of n 
(like n=45 or n=50).

- when call fibonacci(n - 1) or fibonacci(n - 2) it'll call a method over and over again until n < 2.If number like 48 it's called fibonacci 46,47times, so each time it'll save fibonacci number to CPU memory to progress the calculation until the CPU done calculated(I think CPU memory have a limit when they have to carry a lot of data while try to calculation in the same time so that why it's slowly) .



