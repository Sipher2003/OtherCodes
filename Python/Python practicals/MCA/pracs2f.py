import calendar

def get_month_number(month,year):
    try:
        month_number=list(calendar.month_name).index(month.capitalize())

        if month_number==0:
            return "invalid month name"
        
        return calendar.monthrange(year,month_number)[1]
    except ValueError:
        print("invalid input")

monthname=input("Enter month name: ")
year=int(input("Enter year: "))

days=get_month_number(monthname,year)

print(days)