def transform_matrix(matrix):
    new_matrix=[]  
    for row in matrix:
        min_value=min(row)
        new_row=[]
        for value in row:
            if value==min_value:
                if value%2==0:
                    new_row.append(0)
                else:
                    new_row.append(1)
        else:
                new_row.append(value)
        new_matrix.append(new_row)
    return new_matrix
n=int(input())
m=int(input())
matrix=[
    [3, 1, 4, 2],
    [5, 9, 2, 6],
    [5, 3, 5, 9]]
transformed_matrix=transform_matrix(matrix)
for row in transformed_matrix:
    print(row)
