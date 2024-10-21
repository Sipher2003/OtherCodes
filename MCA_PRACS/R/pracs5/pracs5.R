setwd("D:/R pracs fymca")
getwd()

#install packages
install.packages("ggplot2")
library(ggplot2)

# Sample Data
set.seed(123)
data <- data.frame(
  category = rep(c("A", "B", "C"), each = 100),
  values = c(rnorm(100, mean = 5), rnorm(100, mean = 10), rnorm(100, mean = 15))
)


# Histogram
ggplot(data, aes(x = values)) +
  geom_histogram(binwidth = 1, fill = "pink", color = "red") +
  labs(title = "Histogram of Values", x = "Values", y = "Frequency")

# Boxplot
ggplot(data, aes(x = category, y = values)) +
  geom_boxplot(fill = "orange") +
  labs(title = "Boxplot of Values by Category", x = "Category", y = "Values")

# Bar Chart
ggplot(data, aes(x = category)) +
  geom_bar(fill = "green") +
  labs(title = "Bar Chart of Categories", x = "Category", y = "Count")
# Sample Time Series Data
time_data <- data.frame(
  time = seq(1, 100),
  value = cumsum(rnorm(100))
)

# Sample Time Series Data
time_data <- data.frame(
  time = seq(1, 100),
  value = cumsum(rnorm(100))
)

# Line Graph
ggplot(time_data, aes(x = time, y = value)) +
  geom_line(color = "purple") +
  labs(title = "Line Graph of Time Series Data", x = "Time", y = "Value")

# Scatterplot
ggplot(data, aes(x = category, y = values)) +
  geom_jitter(width = 0.2, height = 0) +
  labs(title = "Scatterplot of Values by Category", x = "Category", y = "Values")

# Pie Chart
category_counts <- as.data.frame(table(data$category))
colnames(category_counts) <- c("category", "count")

ggplot(category_counts, aes(x = "", y = count, fill = category)) +
  geom_bar(stat = "identity", width = 1) +
  coord_polar("y") +
  labs(title = "Pie Chart of Categories")



