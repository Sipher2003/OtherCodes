def concatenate_and_sum(dict1, dict2):
    concatenated = {**dict1, **dict2}
    total_sum = sum(concatenated.values())
    return concatenated, total_sum

# Example usage
dict1 = {'a': 1, 'b': 2}
dict2 = {'c': 3, 'd': 4}
merged_dict, total = concatenate_and_sum(dict1, dict2)
print("Concatenated Dictionary:", merged_dict, "Total Sum:", total)
