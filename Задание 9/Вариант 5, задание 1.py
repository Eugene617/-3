def sort_matrix_rows(matrix):
    for row in matrix:
        row.sort()
    return matrix
n=int(input())
m=int(input())
matrix=[
    [3, 1, 4, 2],
    [5, 9, 2, 6],
    [5, 3, 5, 9]]
sorted_matrix = sort_matrix_rows(matrix)
for row in sorted_matrix:
    print(row)
