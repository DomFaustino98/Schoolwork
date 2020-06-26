%%Dominic Faustino
%%Linear Algebra - MATH250
%%Prof. Espejo
%%Project 1
clc 

%% 1.

syms x1 x2 x3 x4 x5 x6;
A = [0 0 6 2 -4 -8 8; 0 0 3 1 -2 -4 4; 2 -3 1 4 -7 1 2; 6 -9 0 11 -19 3 1]
rref(A)
disp('x1 - 1.5x2 + 1.83x4 - 3.167x5 = .0417')
disp('x3 + .333x4 - .667x5 = 1.667')
disp('x6 = .25')

%% 2.

syms x1 x2 x3 x4;
B = [3 1 1 1 0; 5 -1 1 -1 0]
rref(B)
disp('x1 + .25x3 = 0')
disp('x2 + .25x3 + x4 = 0')
%% 3.

syms v1 v2 v3;
v1 = [2; 0; 1];
v2 = [-1; 3; 4];
v3 = [1; 1; -2];
vector1 = [v1 v2 v3]

rref(vector1)
disp('The sets do span R^3 for part a because each column has a pivot')

syms u1 u2 u3;
u1 = [1;2;-1];
u2 = [3;-1;1];
u3 = [-3;8;-5];
vector2 = [u1 u2 u3]

rref(vector2)
c = newline;
disp('These sets do not span R^3 because there is not a pivot in each column')
%% 4.

syms v1 v2 v3;
v1 = [-2;1];
v2 = [-1;-3];
v3 = [4;-2];
vector1 = [v1 v2 v3]

rref(vector1)

disp('This matrix is linearly dependent because there are more vectors than rows')

syms u1 u2 u3;
u1 = [1;1;-1;2];
u2 = [2;-2;0;2];
u3 = [2;-8;3;-1];
vector2 = [u1 u2 u3]
rref(vector2)

disp('This matrix is linearly dependent because there are free variables')

c = newline;
%% 5.

A = [ 4 -2 5 -5; -9 7 -8 0; -6 4 5 3; 5 -3 8 -4]
B = [7;5;8;7]
vectorAB = [A B]
rref(vectorAB)

disp('The row reduced matrix is linearly independent, and B is in the range')
disp('An image of x under b is: ')
Image_x=[-3.5;-4.5;0;0]
c = newline;
%% 6.

Vector1 = [6 2 0 -4 1; 3 1 -2 0 -4; -1 0 -3 1 5; 2 -3 1 4 -1; 0 1 1 -2 3]
Vector2 = inv(Vector1);
Vector3 = [6;8;1;0;2]
%%Inverse of the square vector and then RREF of the augmented inverse
VectorInverse = [Vector2 Vector3]
rref(VectorInverse)

%% 7.

%%We can use the pascal operation to find the pascal matrix of size 4
P = pascal(4)
P1 = P^2
P2 = P.^2

disp('These two matrices are different since the first one has much higher values throughout')