%Dominic Faustino
%MATH250 - Linear Alg.
%Prof. Espejo - Project 3
format rat
clc
clear all

%% a.
%Eigenvalues and eigenvectors
A = pascal(5)
E = eig(A)
Eigenvector1 = null(A - E(1)*eye(5),'r')
Eigenvector2 = null(A - E(2)*eye(5),'r')
Eigenvector3 = null(A - E(3)*eye(5),'r')
Eigenvector4 = null(A - E(4)*eye(5),'r')
Eigenvector5 = null(A - E(5)*eye(5),'r')
Eigenspace = [Eigenvector1  Eigenvector2  Eigenvector3  Eigenvector4 Eigenvector5]
%Is it diagonizable?
Eigenspace1Rank = 5 - rank(A - E(1)*eye(5))
Eigenspace2Rank = 5 - rank(A - E(2)*eye(5))
Eigenspace3Rank = 5- rank(A - E(3)*eye(5))
Eigenspace4Rank = 5 - rank(A - E(4)*eye(5))
Eigenspace5Rank = 5 - rank(A - E(5)*eye(5))
%Yes because it has 5 distinct eigenvalues is a single column matrix - the
%dimension of the eigenspace is equal to the multiplicity of the eigenvalue

%Use rank to compute the dimensions of each eigenspace
rank(Eigenspace)
%Has a rank of 5

poly(A)

%% b. 

A = zeros(5); A(:)=1:25
E = eig(A)
Eigenvector1 = null(A - E(1)*eye(5),'r')
Eigenvector2 = null(A - E(2)*eye(5),'r')
Eigenvector3 = null(A - E(3)*eye(5),'r')
Eigenvector4 = null(A - E(4)*eye(5),'r')
Eigenvector5 = null(A - E(5)*eye(5),'r')
Eigenspace = [Eigenvector1  Eigenvector2  Eigenvector3  Eigenvector4 Eigenvector5]
%Is it diagonizable?
Eigenspace1Rank = 5 - rank(A - E(1)*eye(5))
Eigenspace2Rank = 5 - rank(A - E(2)*eye(5))
Eigenspace3Rank = 5 - rank(A - E(3)*eye(5))
Eigenspace4Rank = 5 - rank(A - E(4)*eye(5))
Eigenspace5Rank = 5 - rank(A - E(5)*eye(5))
%Yes because the rank of the eigenspace matches the dimension of the square matrix that forms A 

%Use rank to compute the dimensions of each eigenspace
rank(Eigenspace)
%Has a rank of 5
poly(A)
%% c. 
A=3*eye(5)+diag(ones(4, 1), 1)
E = eig(A)
Eigenvector1 = null(A - E(1)*eye(5),'r')
Eigenvector2 = null(A - E(2)*eye(5),'r')
Eigenvector3 = null(A - E(3)*eye(5),'r')
Eigenvector4 = null(A - E(4)*eye(5),'r')
Eigenvector5 = null(A - E(5)*eye(5),'r')
Eigenspace = [Eigenvector1  Eigenvector2  Eigenvector3  Eigenvector4 Eigenvector5]
%Is it diagonizable?
Eigenspace1Rank = 5 - rank(A - E(1)*eye(5))
Eigenspace2Rank = 5 - rank(A - E(2)*eye(5))
Eigenspace3Rank = 5 - rank(A - E(3)*eye(5))
Eigenspace4Rank = 5 - rank(A - E(4)*eye(5))
Eigenspace5Rank = 5 - rank(A - E(5)*eye(5))
%No because the multiplicity of the eigenvalues does not match with the
%dimensions of their corresponding eigenvectors and the rank of the
%eigenspace does not match the dimensions of the matrix

%Use rank to compute the dimensions of each eigenspace
rank(Eigenspace)
%Has a rank of 1
poly(A)
%% d. 
A = ones(5)
E = eig(A)
Eigenvector1 = null(A - E(1)*eye(5),'r')
Eigenvector2 = null(A - E(2)*eye(5),'r')
Eigenvector3 = null(A - E(3)*eye(5),'r')
Eigenvector4 = null(A - E(4)*eye(5),'r')
Eigenvector5 = null(A - E(5)*eye(5),'r')
Eigenspace = [Eigenvector1  Eigenvector2  Eigenvector3  Eigenvector4 Eigenvector5]
%Is it diagonizable?
Eigenspace1Rank = 5 - rank(A - E(1)*eye(5))
Eigenspace2Rank = 5 - rank(A - E(2)*eye(5))
Eigenspace3Rank = 5 - rank(A - E(3)*eye(5))
Eigenspace4Rank = 5 - rank(A - E(4)*eye(5))
Eigenspace5Rank = 5 - rank(A - E(5)*eye(5))
%Yes because the rank of the eigenspace matches the dimension of the square matrix that forms A 

%Use rank to compute the dimensions of each eigenspace
rank(Eigenspace)
%Has a rank of 5
poly(A)

%% 1. 

A=magic(8);  
A=A(:, 1:3)
U=A(:, 1)/norm(A(:, 1))
       for k=2:3
       w=A(:, k)-U*(U'*A(:, k)); 
       u=w/norm(w); 
       U=[U, u];
       end
       
%Check for orthnonormality       
U'*U-eye(3)

%% 2. 
A=magic(8); 

% for n = 4
A = A(:, 1:4)
U=A(:, 1)/norm(A(:, 1))
       for k=2:4
       w=A(:, k)-U*(U'*A(:, k)); 
       u=w/norm(w); 
       U=[U, u];
       end
              
%Check for orthnonormality       
U'*U-eye(4)

%We can find a matrix U using n = 3 (as shown in problem 1), or n = 4, but past 4 we cannot, because
%it causes out of bounds exceptions. All the following code was used to
%prove this, and it did not work so i commented it all out 

% for n = 5
%A = A(:, 1:5)
%U=A(:, 1)/norm(A(:, 1))
%    for k=2:5
%    w=A(:, k)-U*(U'*A(:, k)); 
%    u=w/norm(w); 
%    U=[U, u];
%    end
              
%Check for orthnonormality       
%U'*U-eye(5)

%For n = 6
%A = A(:, 1:6)
%U=A(:, 1)/norm(A(:, 1))
%      for k=2:6
%     w=A(:, k)-U*(U'*A(:, k)); 
%     u=w/norm(w); 
%     U=[U, u];
%     end
              
%Check for orthnonormality       
%U'*U-eye(6)

%For n = 7
%A = A(:, 1:7)
%U=A(:, 1)/norm(A(:, 1))
%       for k=2:7
%      w=A(:, k)-U*(U'*A(:, k)); 
%      u=w/norm(w); 
%      U=[U, u];
%      end
              
%Check for orthnonormality       
%U'*U-eye(7)

%For n = 8
%A = A(:, 1:8)
%U=A(:, 1)/norm(A(:, 1))
%     for k=2:8
%     w=A(:, k)-U*(U'*A(:, k)); 
%    u=w/norm(w); 
%  U=[U, u];
%   end 
              
%Check for orthnonormality       
%U'*U-eye(8)

%% c.
A = pascal(7);
U=A(:, 1)/norm(A(:, 1))
       for k=2:7
       w=A(:, k)-U*(U'*A(:, k)); 
       u=w/norm(w); 
       U=[U, u];
       end
       
%Check for orthnormality 
U'*U-eye(7)