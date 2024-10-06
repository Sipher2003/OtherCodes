# Function to compute compound interest
def compute_compound_interest(principal, rate, time, compounding_frequency):
    amount = principal * (1 + rate / (100 * compounding_frequency)) ** (compounding_frequency * time)
    return amount

# Input
P = float(input("Enter principal amount: "))
r = float(input("Enter annual interest rate (in %): "))
t = float(input("Enter time (in years): "))
n = int(input("Enter number of times interest applied per time period: "))

# Output
amount = compute_compound_interest(P, r, t, n)
print(f"The amount after {t} years is: {amount:.2f}")
