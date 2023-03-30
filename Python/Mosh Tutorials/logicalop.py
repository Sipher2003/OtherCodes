has_high_income=True
has_good_credit=True
has_criminal_record=False


if has_high_income and has_good_credit:
    print("Eligible")

if has_high_income or has_good_credit:
    print("not Eligible")

if has_good_credit and not has_criminal_record:
    print("Eligible for the loan")