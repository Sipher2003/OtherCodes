setwd("D:/R pracs fymca")
getwd()

library("dplyr")

#reading the data
data=read.csv("homeprices.csv")

print("original data is:")
data

#renaming the data0
data = data %>%
      rename(amount=price, total_area=area)

print("After renaming the columns:")
print(data)

#adding a new variable in the data
data$freq=c(4,6,8,3,2)
print("After adding a new column in the data")
data

#creating a dataframe and dealing with missing values

df <- data.frame(
  Name = c("Alice", "Bob", NA, "David"),
  Age = c(25, 30, 22, NA),
  Gender = c("F", "M", "F", "M"),
  Salary = c(50000, 60000, 55000, 65000)
)
df

#handling the missing values
df$Name[is.na(df$Name)]="Unknown"
df
df$Age[is.na(df$Age)]=mean(df$Age,na.rm = TRUE) #setting na.rm = TRUE ensures that only the non-missing values are considered in the calculation.
df$Age=floor(df$Age)
df


#handling categorical data in R
# Convert categorical variable 'Gender' to numerical
df$Gender <- ifelse(df$Gender == "M", 1, 0)

print("Data Frame after dealing with categorical data:")
print(df)

#subset of data
# Creating a subset where Age is greater than 25
subset_data <- df %>% filter(Age > 25)

print("Subset of Data Frame where Age > 25:")
print(subset_data)


