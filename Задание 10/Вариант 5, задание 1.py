def read_matrix_from_file(filename):
    matrix=[]
    with open(filename, 'r') as file:
        for line in file:
            row=list(map(int, line.split()))
            matrix.append(row)
    return matrix
def sort_matrix_rows(matrix):
    for row in matrix:
        row.sort()
    return matrix
def write_matrix_to_file(matrix, filename):
    with open(filename, 'w') as file:
        for row in matrix:
            file.write(' '.join(map(str, row))+'\n')
