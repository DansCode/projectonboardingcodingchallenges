def crunch(shape,num):
    flag = (shape > "c")
    return flag*(4*num)+(1-flag)*(6.28*num)

print(crunch("s",7))
print(crunch("c",4))
print(crunch("c",9))