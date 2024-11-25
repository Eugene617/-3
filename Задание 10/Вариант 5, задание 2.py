def read_matrix_from_file(filename):
    matrix=[]
    with open(filename, 'r') as file:
        for line in file:
            row=list(map(float, line.strip().split()))
            matrix.append(row)
    return matrix
def transform_matrix(matrix):
    new_matrix=[]
    for row in matrix:
        if not row:
            new_matrix.append(row)
            continue
        min_value=min(row)
        min_index=row.index(min_value)
        new_row=row[:]
        if min_value%2==0:
            new_row[min_index]=0
        else:
            new_row[min_index]=1
        new_matrix.append(new_row)
    return new_matrix
def write_matrix_to_file(matrix, filename):
    with open(filename, 'w') as file:
        for row in matrix:
            file.write(' '.join(map(str, row))+'\n')
def display_matrix(matrix):
    for row in matrix:
        print(row)
        if name=="main":
            input_file='ФИО_группа_vvod.txt' 
            output_file='ФИО_группа_vivod.txt'
            matrix=read_matrix_from_file(input_file)
            new_matrix=transform_matrix(matrix)
            write_matrix_to_file(new_matrix, output_file)
            display_matrix(new_matrix)
