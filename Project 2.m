%Dominic Faustino
%Prof. Espejo
%MATH250 - Linear Algebra

format rat
%Problem 1.

A = [6 2 0 -4 1; 3 1 -2 0 -4; -1 0 3 1 5; 2 -3 1 4 -1; 0 1 1 -2 3];
B = [6;8;1;0;2];

[L,U] = lu(A)

%the difference between this LU factorization and the one we did in class
%is that this factorization does not have the diagonals like the ones we
%did in class. The upper and lower are not completely triangles. 

%Solution using LU Matlab
rref([L B]) %rref of the system Ly = b
y = [6;-2; 20/11; 105/17; 123/43] %vector for y values
rref([U y]) %rref for system Ux = y

%Solution using inverse method:
inv(A) * B %inverse method

%The two solutions are the same

%Problem 2
w = [1; 2; 1; 0];
A = [-8 5 -2 0; -5 2 1 -2; 10 -8 6 -3; 3 -2 1 0];

%multiply to see if w is in null space
A * w
%result is zero vector, so w is in the null space

rref([A w])
%The vector is not in the column space

rank(A)
%The rank of A is 3 

%Problem 3 
% Part A
A = [.75 .33 .10; .10 .55 .02; .15 .12 .88];
n = [.44; .45; .11];
ONE = [1 0 0; 0 1 0; 0 0 1]
P = A - ONE
rref([P])
%-10/53 * 5/5 = -50/265 
% = 172/265, 50/265, and 265/265. 
172 + 50 + 265 %sum all numerators to find probability
SteadyStateVector = [172/487; 50/487; 265/487]
%This steady state vector shows the percentage of voters after many
%election cycles. The steady state vector changes each year based on the
%stochastic, and it converges to this. 

%Part B
A2 = [.75 .23 .10; .10 .65 .02; .15 .12 .88];
P2 = A2 - ONE
rref(P2)
SteadyStateVector2 = [132/397; 50/397; 215/397]
%I was able to achieve a higher percentage of democratic voters by changing
%the middle column in the stochastic matri.

%The initial state vector has no influence on the steady state vector - it
%is only a starting point. The steady state vector will converge to its
%values no matter what the initial is; although the initial might make it take
%longer to reach those values. 

%Problem 4
%Part A

MarkovMatrix = [70/100 10/100; 30/100 90/100]

%Part B
ONE2 = [1 0; 0 1];
NewMatrix = MarkovMatrix - ONE2
rref(NewMatrix);
SSV = [1/4; 3/4]

%Part C
%After many years, 75% of the subscribers will be subscribed to the
%Times. 

%Problem 5
u1 = [1;2;3;-1];
u2 = [0;2;-1;1];
u3 = [2;2;7;-3];
v1 = [1;0;8;-4];
v2 = [2;-2;9;-5];
v3 = [-1;4;6;-2];

H = [u1 u2 u3]
rref(H)
%Basis for H is [u1 u2] or [u1 u3]
K = [v1 v2 v3]
rref(K)
%Basis for K is [v1 v2] or [v1 v3]
HK = [u1 u2 u3 v1 v2 v3]
rref(HK)
%Basis for H + K = [u1 u2 v1] or [u1 u3 v1]
