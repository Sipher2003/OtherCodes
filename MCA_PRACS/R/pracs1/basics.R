setwd("D:/R pracs fymca")
bitmap(file="out.png")

#arithmetic operators

a=10
b=20


Sum=a+b
Dif=b-a
Mul=a*b
Div=a/b
#Mod=b%a
res=a|b

Sum
Dif
Mul
Div
res

#vector
vec=c(1,3,5,7,9)
vec

vec2=c(1.5,3.0,4.5,6.0)
vec2

#Dataframe
x1=c(1,2,3,4,5)
name=c("Kaus","Tej","Boom","Nin","Sri")
marks=c(80,90,67,81,75)
df1=data.frame(x1,name,marks)
df1

#if else
if (a > b) {
  print("a is greater than b")
} else {
  print("b is greater than or equal to a")
}

#for loop
for(x in name){
  print(x)
}

for (x in name){
  if (x == "Boom"){
    break;
  }
  print(x)
}

#while loop
i=1;

while (i<=6){
  print(i)
  i=i+1;
}

#graphs
library(ggplot2)

data(mtcars)
head(mtcars)
mtcars

cig <- c(5,23,25,48,17,8,4,26,11,19,14,35,29,4,23)
lon <- c(80,78,60,53,85,84,73,79,81,75,68,72,58,92,65)

plot(cig,lon)
boxplot(cig,lon)
scatter.smooth(cig,lon)

x <- c("A", "B", "C", "D")
y <- c(2, 4, 6, 8) 
barplot(y,names.arg=x,col="lightgreen")
