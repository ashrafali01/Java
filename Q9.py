'''
9) define a function in such a way that it can accept n number of values and print their sum. [ variable number of arguments]

'''

def disp(*vars) :
    sum=0
    for i in vars:
        sum += i
    print(sum) 


disp(1,3,3,23,321,65,4,)
