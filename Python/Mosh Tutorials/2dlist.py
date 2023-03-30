matrix=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

print(matrix[0][1]) #Will return 2
print(matrix[1][2]) #Will return 6
print(matrix[2][2]) #Will return 9

for row in matrix:
    for item in row:
        print(item)

