#setwd and getwd functions
setwd("C:/Kaustubh/Github/OtherCodes/MCA_PRACS/R/pracs3")
getwd


#data function
data("mtcars")
head(mtcars)

data("iris")
head(iris)

#rm function
vec1=c(11,22,33,44,55)
vec1

lis1=list("nums"=c(1,2,3,4,5),
          "chars"=c('a','b','c','d','e'))
lis1

rm(vec1)
vec1      #object not found error
 
#attach and detach functions
df1=data.frame(
  x=1:5,
  y=c(11,22,33,44,55)
)

attach(df1)

print(x)
print(y)

detach(df1)

print(x)  #error
print(y)   #error

print(df1$x)
print(df1$y)

#reading the data from the console

# Prompt the user to enter numbers
cat("Enter your numbers (press Enter after each number, type 'done' to finish):\n")

# Read the data from console
data <- scan(what = numeric(), nmax = 100)

# Display the entered data
print(data)


cat("Enter your names (press Enter after each name, type 'done' to finish):\n")

names <- scan(what = "", nmax = 100)

print(names)

install.packages("readxl")
library("readxl")

#read data from excel and csv
data=read_excel("SaleData.xlsx")
data

csv=read.csv("homeprices.csv")
csv

summ=summary(csv)
summ

csv$arpr=csv$area+csv$price
csv
