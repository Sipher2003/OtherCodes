#arithmetic operations
setwd("C:/Kaustubh/Home/MCA/SEM 1/dwm/pracs/home practice")
getwd()

a=10
b=20

sum=a+b
dif=a-b
prod=a*b
div=a/b
mod=a%%b
res=a|b

print(sum)
print(dif)
print(prod)
print(div)
print(mod)

#vectors

vec1=c(1,2,3,4,5)
vec1

vec2=c(6,7,8,9,10)
vec2

vec3=11:20
vec3

vec1+vec2
vec1*vec2

#DATAFRAME

x1=c(1,2,3)
name=c("kaus","nin","sri")
marks=c(50,60,70)

df=data.frame(x1,name,marks)
df


library(ggplot2)

c=c(10,20,30,50)
v=c(60,50,40,30)

plot(c,v)


x=c("A","B","C","D")
Y=c(25,35,15,50)

barplot(Y,names.arg=x,col = "lightgreen")


class(c)


#list

numlist=list(1,2,3,4,5)
list2=list(4,5,6,"apple","banana")

list3=list(numlist,list2)
list3

#matrix
mat1=matrix(c(1,2,3,4,5,6),nrow=3,ncol=3)
mat1

mat2=matrix(c(7,8,9,10,11,12),nrow=3,ncol=3)
mat2

mat1+mat2


#data

data(mtcars)
cars
head(mtcars)

data(iris)
head(iris)


temp=c(1,2,3,4,5)
temp

rm(temp)
temp

dfat=data.frame(
  d1=1:5,
  d2=c(11,22,33,44,55)
)
dfat

attach(dfat)
print(d1)
detach(dfat)
print(d1)


#from console
cat("Enter your numbers (press Enter after each number, type 'done' to finish):\n")

# Initialize an empty list to store numbers
numbers <- c()

repeat {
  input <- readline("Enter a number (or 'done'): ")
  if (tolower(input) == "done") {
    break
  }
  # Convert input to numeric
  number <- as.numeric(input)
  if (is.na(number)) {
    cat("Invalid input. Please enter a valid number.\n")
  } else {
    numbers <- c(numbers, number)
  }
}

cat("You entered the numbers:\n")
print(numbers)

data=read.csv("homeprices.csv")
data

library(dplyr)
summary(data)
data=data %>%
  rename(amount=price,size=area)
data


#new column

data$freq=c(23,32,42,21,78)
data


df <- data.frame(
  Name = c("Alice", "Bob", NA, "David"),
  Age = c(25, 30, 22, NA),
  Gender = c("F", "M", "F", "M"),
  Salary = c(50000, 60000, 55000, 65000)
)
df



df$Name[is.na(df$Name)]="Other"
df

df$Age[is.na(df$Age)]=mean(df$Age,na.rm=TRUE)
df$Age=floor(df$Age)

df

df$Gender=ifelse(df$Gender=="M",1,0)
df

subdata= df%>% filter(Salary>=55000)
subdata


#histogram
data <- c(10, 20, 20, 30, 30, 40, 50, 60)

hist(data,col="lightblue",xlab = "values",main = "histogram")

boxplot(data,col="green")

categories <- c("A", "B", "C", "D")
values <- c(10, 20, 15, 25)

barplot(values,names.arg = categories,xlab = "categories",ylab = "values")

x <- 1:10
y <- c(2, 4, 6, 8, 6, 12, 11, 15, 19, 25)

plot(x,y,type="o",col="cyan",)

# Data
x <- c(1, 2, 3, 4, 5, 6)
y <- c(2, 4, 1, 8, 7, 9)

#Scatterplot
plot(x, y, col = "red", pch =1, main = "Scatterplot", xlab = "X-axis", ylab = "Y-axis")


# Data
slices <- c(10, 20, 30, 40)
labels <- c("A", "B", "C", "D")

# Pie Chart
pie(slices, labels = labels, col = rainbow(length(labels)), main = "Pie Chart")




#correlation plot
if(!require(corrplot)) install.packages("corrplot")
if(!require(ggplot2)) install.packages("ggplot2")
if(!require(reshape2)) install.packages("reshape2")
if(!require(ggcorrplot)) install.packages("ggcorrplot")


library(corrplot)
library(ggplot2)
library(reshape2)
library(ggcorrplot)


data=mtcars
data
corr=cor(data)
corr

#using corrplot
corrplot(corr,method="circle",addCoef.col = "black",tl.cex = 1)

#using ggcorrplot
ggcorrplot(corr,type = "lower",lab = TRUE,colors = c("red","blue","white"),)


#normal distribution

mean=0
std_dev=1
samplesize=1000

data_normal=rnorm(samplesize,mean = mean,sd=std_dev)
data_normal

ggplot(data.frame(x=data_normal),aes(x))+geom_histogram(aes(y=..density..),bins = 30,color="black",fill="blue",
                                                        alpha=0.5)+
                                                          geom_density(color="red",size=1)




#binomial distribution

n_trials=10
prob_success=0.5
size=1000


data_binom=rbinom(size,n_trials,prob_success)


ggplot(data.frame(x=data_binom),aes(x))+
         geom_histogram(bins = 15,colour = "black",fill="lightgreen",alpha=0.7)



#univariate 

ggplot(data.frame(x=data_normal),aes(x))+
  geom_boxplot(color="purple",fill="lightblue")

ggplot(data.frame(x=data_normal),aes(x))+
  geom_histogram(bins=30,color="purple",fill="lightblue")


#bivariate analysis

set.seed(123)
x=rnorm(100)
y=2*x+rnorm(100)


ggplot(data.frame(x,y),aes(x=x,y=y))+
  geom_point(color="blue",fill="pink")

corr=cor(x,y)
corr
ggcorrplot(cor,type =  "lower",colors = c("red","blue","white"))


#linear regression
set.seed(123)
x=rnorm(100)
y=2*x+rnorm(100)

ggplot(data.frame(x,y),aes(x=x,y=y))+
  geom_point(color="blue")+
  geom_smooth(method = "lm",color="red")



model=lm(y~x)
data=data.frame(x=x,y=y,residuals=residuals(model))

ggplot(data,aes(x=x,y=residuals))+
  geom_point(color="blue")+
  geom_hline(yintercept = 0,linetype="dashed")



data$predicted=predict(model)

ggplot(data,aes(x=predicted,y=y))+
  geom_point(color="blue")+
  geom_abline(slope=1,intercept = 0,color="red")


  
  
#apriori algorithm

library(arules)
library(arulesViz)
library(RColorBrewer)

data("Groceries")

rules=apriori(Groceries,parameter = list(supp=0.01,conf=0.2))
inspect(rules[1:10])

arules::itemFrequencyPlot(Groceries,topN=20,col=brewer.pal(8,'Pastel2'),type="relative")


#decision tree c50

library(C50)

data("iris")

model_c50=C5.0(Species ~ Sepal.Length+Sepal.Width+Petal.Length+Petal.Width,data=iris)

summary(model_c50)

plot(model_c50)

#dtid3
library(RWeka)

data("iris")

model_r48=J48(Species ~ Sepal.Length+Sepal.Width+Petal.Length+Petal.Width,data=iris)

summary(model_r48)

plot(model_r48)

#kmeans

data("iris")

data=iris[,-5]

set.seed(123)
kmmodel=kmeans(data,centers = 3)

print(kmmodel$cluster)


ggplot(data,aes(x=Sepal.Length,y=Sepal.Width,colour = factor(kmmodel$cluster)))+
  geom_point()
  
