import cmath

# Function to solve quadratic equation
def solve_quadratic(a, b, c):
    d = (b ** 2) - (4 * a * c)  # Discriminant
    sol1 = (-b + cmath.sqrt(d)) / (2 * a)
    sol2 = (-b - cmath.sqrt(d)) / (2 * a)
    return sol1, sol2

# Input
a = float(input("Enter coefficient a: "))
b = float(input("Enter coefficient b: "))
c = float(input("Enter coefficient c: "))

# Output
solutions = solve_quadratic(a, b, c)
print(f"The solutions are: {solutions[0]} and {solutions[1]}")
