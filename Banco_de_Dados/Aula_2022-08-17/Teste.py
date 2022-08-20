espaco = input(":")

lista1 = [("'Empregado',") ("'Produto',") ("'Compra',")]

frase = "A frase é"

for elemento in lista1:
    frase += " " + elemento[0]

# print(f"eis o{espaco.strip()}espaço")

# while True:
#     if espaco.isspace():
#         espaco = input(":")
#     elif espaco == '':
#         espaco = input(":")
#     else:
#         break

# espaco = espaco.strip()

# print(f"eis o{espaco}espaço")

print(frase)

if espaco == '1' or espaco == '0':
    print("Sim")
else:
    print("Não")