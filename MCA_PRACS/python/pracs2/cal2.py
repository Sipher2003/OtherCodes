def month_days(month):
    month_days_dict = {
        "January": 31,
        "February": 28,  # Assuming non-leap year for simplicity
        "March": 31,
        "April": 30,
        "May": 31,
        "June": 30,
        "July": 31,
        "August": 31,
        "September": 30,
        "October": 31,
        "November": 30,
        "December": 31
    }
    return month_days_dict.get(month, "Invalid month name")

month_name = input("Enter the month name: ")
days = month_days(month_name)
print(f"Number of days in {month_name}: {days}")
