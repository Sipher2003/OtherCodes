setwd("C:/Kaustubh/Github/OtherCodes/MCA_PRACS/R/pracs2")
getwd()

#vectors
veggies =c("carrot","ladyfinger","tom")
veggies

nums = c(1,2,3,4,5,6)
nums

#Vector with numerical values in a sequence
numbers = 1:10
numbers

numbners2 <- 11:20
numbners2

#arithmetic operations
numbers+numbners2
numbers-numbners2
numbers*numbners2

class(numbers) #get dtype


#list

numlist=list(1,2,3,4,5,6,7,8)
numlist

list2=list(1,2,3,"apple")
list2

list3=c(numlist,list2)
list3


#matrix

mat1=matrix(c(1,2,3,4,5,6),nrow=3,ncol = 3)
mat1

thismatrix <- matrix(c("apple", "banana", "cherry", "orange"), nrow = 2, ncol = 2)
thismatrix


#factor

# Create a factor
music_genre <- factor(c("Jazz", "Rock", "Classic", "Classic", "Pop", "Jazz", "Rock", "Jazz"))
music_genre

#dataframe

df=data.frame(
  Training = c("Strength", "Stamina", "Other"),
  Pulse = c(100, 150, 120),
  Duration = c(60, 30, 45)
)

df

summary(df)


#reading csv
recsv= read.csv("homeprices.csv")
recsv

