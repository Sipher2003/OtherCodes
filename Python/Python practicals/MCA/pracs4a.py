def chk_palindrome(s):
    if len(s) <=1:
        return True
    
    if (s[0]==s[-1]):
        return chk_palindrome(s[1:-1])
    return False

str="racecar"
print(f"is {str} a palindrome",chk_palindrome(str))
    