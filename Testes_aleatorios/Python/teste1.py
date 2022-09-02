def pedro(n):
    n = str(n) 
    soma = 0
    
    for i in range(len(n)):
        soma += int(n[i])**(i+1)
    return soma

for i in range(10000):
    if i == pedro(i):
        print(i)