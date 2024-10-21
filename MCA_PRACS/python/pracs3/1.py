def merge_and_find_second_largest(list1, list2):
    merged_list = list1 + list2
    n = len(merged_list)

    # Bubble Sort
    for i in range(n):
        for j in range(0, n-i-1):
            if merged_list[j] > merged_list[j+1]:
                merged_list[j], merged_list[j+1] = merged_list[j+1], merged_list[j]

    # Find second largest
    unique_list = list(set(merged_list))  # Remove duplicates
    if len(unique_list) < 2:
        return None  # Less than 2 unique elements
    return unique_list[-2]  # Second largest

# Example usage
list1 = [3, 5, 1]
list2 = [2, 8, 7]
second_largest = merge_and_find_second_largest(list1, list2)
print("Second Largest Element:", second_largest)
