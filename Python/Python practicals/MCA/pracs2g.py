#password

def chk_password(password):
    if not(6<= len(password) <=16):
        return "Invalid password size"
    
    has_lower=any((char.islower()) for char in password)
    has_upper=any((char.isupper()) for char in password)
    has_digit=any((char.isdigit()) for char in password)
    has_char=any(char in "@$!%*?&" for char in password)

    errors=[]
    if not (has_lower):
         errors.append("at least one lowercase letter (a-z)")
    if not has_upper:
        errors.append("at least one uppercase letter (A-Z)")
    if not has_digit:
        errors.append("at least one digit (0-9)")
    if not has_char:
        errors.append("at least one special character (@$!%*?&)")

    if errors:
        return f"password is invalid{','.join(errors)}"
    else:
        return "valid password"
    
password=input("Entr your password:")
result=chk_password(password)
print(result)
