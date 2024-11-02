# Install necessary packages (only run if not already installed)
if(!require(corrplot)) install.packages("corrplot")
if(!require(ggplot2)) install.packages("ggplot2")
if(!require(reshape2)) install.packages("reshape2")
if(!require(ggcorrplot)) install.packages("ggcorrplot")

# Load the packages
library(corrplot)
library(ggplot2)
library(reshape2)
library(ggcorrplot)

# Step 1: Compute the Correlation Matrix
data <- mtcars  # Replace this with your dataset if needed
cor_matrix <- cor(data)  # Calculate correlation matrix


# Step 2: Plot with corrplot
cat("\n--- Using corrplot ---\n")
corrplot(cor_matrix, method = "circle", 
         title = "Correlation Plot (corrplot)", 
         addCoef.col = "black", # Add correlation coefficients
         tl.cex = 0.8)  # Text label size


# Step 3: Plot with ggplot2
cat("\n--- Using ggplot2 ---\n")
# Reshape the correlation matrix to long format
cor_data <- melt(cor_matrix)


# Create the ggplot2 correlation plot
ggplot(data = cor_data, aes(x = Var1, y = Var2, fill = value)) +
  geom_tile(color = "white") +  # Tile plot with white grid lines
  scale_fill_gradient2(low = "red", mid = "white", high = "blue", midpoint = 0) +
  theme_minimal() +
  labs(title = "Correlation Plot (ggplot2)", x = "", y = "") +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))  # Rotate x-axis labels


# Step 4: Plot with ggcorrplot
cat("\n--- Using ggcorrplot ---\n")
ggcorrplot(cor_matrix, hc.order = TRUE, type = "lower", 
           lab = TRUE, # Display correlation coefficients on the plot
           colors = c("red", "white", "blue"), # Set colors for the gradient
           title = "Correlation Plot (ggcorrplot)")  
