def compint(p,r,t,comp_freq):
 amount=p*(1+(r/comp_freq))**(comp_freq*t)
 return amount

principal=float(input("Enter principal:"))
rate=float(input("Enter rate:"))/100
time=float(input("Enter time:"))
comp_freq=float(input("Enter compounding freq:"))

amount=compint(principal,rate,time,comp_freq)
cI=amount-principal


print(f"compond interest is {cI:.2f} ")
print(f"amount is {amount:.2f} ")