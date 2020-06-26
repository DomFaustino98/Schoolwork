%Dominic Faustino
%Calc III - Dr. Lang
%Matlab Project 1
clc
clear all
close all
 
syms theta t
% Exit velocity = 136.9867 feet per second rounded to 137
y=137*cosd(theta)*t;
% Initial Height = 3 feet
z=3+(137*sind(theta))*t-16*t^2;
% Distance to center field fence = 409 feet
time=solve(y-409,t);
zatfence=subs(z,t,time);
% Height of center field fence = 8 feet
th=solve(zatfence-8,theta);
double(th)
 
% Jung-Ho Kang - 136.9867 exit velocity feet/s
% Minute Maid Park - 409 feet
 
distance = 409; 
v0 = 137;
h = 3; %initial starting height (where the ball hits the bat)
 
figure;
%Range of angles, use a for loop from the min angle to the max angle
%range of angles found from solving double(th) = 23 - 67
t = 0:.1:10
for theta = 23:1:67
	y1 = v0.*cosd(theta).*t;
	z1 = 3 + (v0.*sind(theta).*t - 16.*t.^2);
	plot(y1, z1, 'r'); hold on;
	
end
%formatting for the graph
axis([0 600, 0 300]);
x = [409 409]; 
y = [0 8];
line(x, y, 'color', 'black', 'LineWidth', 3) %Line for the fence
x = [0 0];  
y = [0 3];
line(x, y, 'color', 'black', 'LineWidth', 3) %Line for the homeplate
title('Plot of Ball Distance for Range of Angles')
xlabel('Distance')
ylabel('Height')
 

%initializing vectors for the table to use
vector1 = zeros(0, 1);
vector2 = zeros(0, 1);
vector3 = zeros(0, 1);
for theta = 0:1:90
	velocityY = v0.*cosd(theta);
	velocityZ = v0.*sind(theta);
	
	time_ = 2.*(-velocityZ./-32); %-32 is acceleration by gravity
	%max height is vertex of the parabola, so we must multiply by 2 to
	%find the total time traveled
	distance = velocityY*time_; 
	
	t2 = 409./velocityY; %time when the ball is at the fence
	height = 3 +(137*sind(theta))*t2-16*t2^2;
	
	new_row1 = theta; %fill vector with theta value each iteration
	vector1 = [vector1 ; new_row1];
    vector1((theta+1),:) = new_row1;
	
	new_row2 = distance; %fill vector with distance value each iteration
	vector2 = [vector2 ; new_row2];
    vector2((theta+1),:) = new_row2; 
	
	new_row3 = height; %fill vector with height value each iteration
	vector3 = [vector3 ; new_row3];
    vector3((theta+1),:) = new_row3;
	matrix = [vector1 vector2 vector3];
end
T = array2table(matrix); %pull values from the 91x3 matrix into the table. 
T.Properties.VariableNames = {'Theta' 'Distance' 'Height'}
%max clearance is height at the distance 409
%%Table for angle values - distance - height clearance over fence

thetaMax = 45; %degree that causes greatest distance
timeMax = 409./thetaMax  ; %Distance / y velocity which gives the time
y2 = v0.*cosd(thetaMax).*timeMax;
z2 = 3 + (v0.*sind(thetaMax).*timeMax - 16.*timeMax.^2);

r = [0, v0.*cos(thetaMax).*timeMax , h + (v0.*sind(thetaMax).*timeMax - 16.*timeMax.^2)]; %equation for r vector
rP = diff([0, y2, z2]); %r prime

rPMag = sqrt(dot(rP, rP)); %magnitude of r prime
tangentU = rP/rPMag %unit tangent vector
tangentP = diff(tangentU); %derivative of unit tangent vector
tangentMag = sqrt(dot(tangentP, tangentP)); %magnitude of tangent vector
normalU = tangentP/tangentMag %magnitude of the normal line
Curvature = sqrt(dot(tangentP, tangentP))/rPMag %curvature

y2Plot = v0.*cosd(thetaMax).*t;
z2Plot = 3 + (v0.*sind(thetaMax).*t - 16.*t.^2);
plot(y2Plot, z2Plot, 'blue', 'LineWidth', 5)

%% 10% better bat code
syms theta t
%10 percent added initial velocity
v1 = v0 * 1.10 %new initial velocity

figure;
%Range of angles, use a for loop from the min angle to the max angle
%range of angles found from solving double(th) = 23 - 67
t = 0:.1:10;
for theta = 23:1:67
	y3 = v1.*cosd(theta).*t;
	z3 = 3 + (v1.*sind(theta).*t - 16.*t.^2);
	plot(y3, z3, 'r'); hold on;
	
end
%formatting for the graph
axis([0 700, 0 330]);
x = [409 409]; 
y = [0 8];
line(x, y, 'color', 'black', 'LineWidth', 3) %Line for the fence
x = [0 0];  
y = [0 3];
line(x, y, 'color', 'black', 'LineWidth', 3) %Line for the homeplate
title('Plot of Ball Distance for Range of Angles (Improved Bat)')
xlabel('Distance')
ylabel('Height')
 
%initializing vectors for the table to use
vector1 = zeros(0, 1);
vector2 = zeros(0, 1);
vector3 = zeros(0, 1);
for theta = 0:1:90
	velocityY = v1.*cosd(theta);
	velocityZ = v1.*sind(theta);
	
	time_ = 2.*(-velocityZ./-32); %-32 is acceleration by gravity
	%max height is vertex of the parabola, so we must multiply by 2 to
	%find the total time traveled
	distance = velocityY*time_; 
	
	t2 = 409./velocityY; %time when the ball is at the fence
	height = 3 +(137*sind(theta))*t2-16*t2^2;
	
	new_row1 = theta; %fill vector with theta value each iteration
	vector1 = [vector1 ; new_row1];
    vector1((theta+1),:) = new_row1;
	
	new_row2 = distance; %fill vector with distance value each iteration
	vector2 = [vector2 ; new_row2];
    vector2((theta+1),:) = new_row2; 
	
	new_row3 = height; %fill vector with height value each iteration
	vector3 = [vector3 ; new_row3];
    vector3((theta+1),:) = new_row3;
	matrix = [vector1 vector2 vector3];
end
T = array2table(matrix); %pull values from the 91x3 matrix into the table. 
T.Properties.VariableNames = {'Theta' 'Distance' 'Height'}
%max clearance is height at the distance 409
%%Table for angle values - distance - height clearance over fence

thetaMax = 45; %degree that causes greatest distance
timeMax = 409./thetaMax  ; %Distance / y velocity which gives the time
y4 = v1.*cosd(thetaMax).*timeMax;
z4 = 3 + (v1.*sind(thetaMax).*timeMax - 16.*timeMax.^2);

r = [0, v1.*cos(thetaMax).*timeMax , h + (v1.*sind(thetaMax).*timeMax - 16.*timeMax.^2)]; %equation for r vector
rP = diff([0, y4, z4]); %r prime

rPMag = sqrt(dot(rP, rP)); %magnitude of r prime
tangentU = rP/rPMag %unit tangent vector
tangentP = diff(tangentU); %derivative of unit tangent vector
tangentMag = sqrt(dot(tangentP, tangentP)); %magnitude of tangent vector
normalU = tangentP/tangentMag %magnitude of the normal line
Curvature = sqrt(dot(tangentP, tangentP))/rPMag %curvature

y2Plot = v1.*cosd(thetaMax).*t;
z2Plot = 3 + (v1.*sind(thetaMax).*t - 16.*t.^2);
plot(y2Plot, z2Plot, 'blue', 'LineWidth', 5)
